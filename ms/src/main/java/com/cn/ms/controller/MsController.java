package com.cn.ms.controller;



import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.ms.entity.DocInfo;
import com.cn.ms.entity.DoctorBean;
import com.cn.ms.entity.RegInfo;
import com.cn.ms.entity.RegUser;
import com.cn.ms.entity.TimeBean;
import com.cn.ms.entity.TreeBean;
import com.cn.ms.service.CheckService;
import com.cn.ms.service.InfoService;
import com.cn.ms.service.TimeService;
import com.cn.ms.service.TreeService;
import com.cn.ms.util.JsonResult;

@Controller
@RequestMapping("/home")
public class MsController {
	@Autowired
	private CheckService checkService;
	
	@Autowired
	private TreeService treeService;
	
	@Autowired
	private InfoService infoService;
	
	@Autowired
	private TimeService timeService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	/**
	 * 患者登录页面
	 * @return
	 */
	@RequestMapping("/login1")
	public String login1(){
		return "login1";
	}
	
	/**
	 * 医生登录页面
	 * @return
	 */
	@RequestMapping("/login2")
	public String login2(){
		return "login2";
	}
	
	//患者 :检查登录账号密码
	@RequestMapping("/check1")
	@ResponseBody
	public JsonResult<RegUser> check1(HttpServletRequest req){
		 String password = req.getParameter("password");
		 String id = req.getParameter("id");
		 JsonResult<RegUser> result = checkService.checkReg(id,password);
		 return  result;
	}
	
	//医生 :检查登录账号密码
		@RequestMapping("/check2")
		@ResponseBody
		public JsonResult<DoctorBean> check2(HttpServletRequest req){
			 String password = req.getParameter("password");
			 String id = req.getParameter("id");
			 JsonResult<DoctorBean> result = checkService.checkReg2(id,password);
			 return  result;
		}
		
	@RequestMapping("/choose")
	public ModelAndView choose(HttpServletRequest req,ModelAndView view){
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		HttpSession session = req.getSession();
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		view(view,id);
		view.setViewName("choose");
		return view;
	}
	//医生进入选择页面
	@RequestMapping("/choose2")
	public ModelAndView choose2(HttpServletRequest req,ModelAndView view){
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		HttpSession session = req.getSession();
		session.setAttribute("id2",id);
		session.setAttribute("password2", password);
		DoctorBean bean = infoService.docInfo(id);
		view.addObject("docInfo",bean);
		view.setViewName("choose2");
		return view;
	}
	
    @RequestMapping("/register")
    public String register(){
    	return "register";
    }
    
    /**
     * 组织树的异步请求
     * @param id
     * @return
     */
    @RequestMapping("/tree")
    @ResponseBody
    public List<TreeBean> tree(String id){
    	List<TreeBean> list = treeService.select(id);
    	return list;
    }
    
    @RequestMapping("/edit")
    public ModelAndView edit(ModelAndView view,String id,HttpServletRequest req){
    	DoctorBean bean = infoService.docInfo(id);
    	HttpSession session = req.getSession();
    	String pId = (String) session.getAttribute("id");
    	view(view,pId);
    	TimeBean timeBean = timeService.selectTime(id);
    	view.addObject("docInfo",bean);
    	view.addObject("time",timeBean);
    	view.setViewName("register-edit");
    	
    	return view;
    }
    

    //医生进入设置页面
    @RequestMapping("/setup")
    public ModelAndView setup(HttpServletRequest req,ModelAndView view){
    	HttpSession session = req.getSession();
    	String id = (String) session.getAttribute("id2");
    	DoctorBean bean = infoService.docInfo(id);
		view.addObject("docInfo",bean);
		view.setViewName("setup");
		return view;
    	
    }
    
    //ajax设置医生的预约时间
    @RequestMapping("/savetime")
    @ResponseBody
    public JsonResult<String> setup(TimeBean bean,HttpServletRequest req){
    	HttpSession session = req.getSession();
    	String id = (String) session.getAttribute("id2");
    	bean.setDoctorId(id);
    	timeService.setTime(bean);
    	JsonResult<String> result = new JsonResult<String>();
    	result.setState("1");
    	return result;
    }
    
    @RequestMapping("/guahao")
    @ResponseBody
    public JsonResult<String> guahao(String docId,String index,HttpServletRequest req){
    	JsonResult<String> json = infoService.patNum(index, docId,req);
    	return json;
    }
    @RequestMapping("/record")
    public ModelAndView edit(ModelAndView view,HttpServletRequest req){
    	HttpSession session = req.getSession();
    	String id = (String) session.getAttribute("id");
    	List<RegInfo> list = infoService.allInfo(id);
    	view(view,id);
    	view.addObject("regInfo",list);
    	view.setViewName("register-info");
    	
    	return view;
    }
    
    @RequestMapping("/record2")
    public ModelAndView edit2(ModelAndView view,HttpServletRequest req){
    	HttpSession session = req.getSession();
    	String id = (String) session.getAttribute("id2");
    	List<DocInfo> bean = infoService.docmessage(id);
    	DoctorBean name = infoService.docInfo(id);
    	view.addObject("infobean",bean);
    	view.addObject("name",name);
    	view.setViewName("doctor-info");
    	
    	return view;
    }
    
    public ModelAndView view(ModelAndView view,String id){
    	String name = infoService.checkName(id);
    	view.addObject("name",name);
    	
    	return view;
    }
}












