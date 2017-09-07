package com.cn.ms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.ms.dao.DateDao;
import com.cn.ms.dao.DoctorDao;
import com.cn.ms.dao.PatientDao;
import com.cn.ms.entity.DateBean;
import com.cn.ms.entity.DocInfo;
import com.cn.ms.entity.DoctorBean;
import com.cn.ms.entity.RegInfo;
import com.cn.ms.util.JsonResult;

@Service
public class InfoService {
	@Autowired
	private DoctorDao docDao;
	@Autowired
	private DateDao dateDao;
	@Autowired
	private PatientDao patDao;
	
	public DoctorBean docInfo(String id){
		DoctorBean bean  = docDao.docInfo(id);
		return bean;
	}
	
	@Transactional
	public JsonResult<String> patNum(String date,String id,HttpServletRequest req){
		DateBean bean = new DateBean();
		HttpSession session = req.getSession();
		String patientId = (String) session.getAttribute("id");
		bean.setPatientId(patientId);
		bean.setDate(date);
		bean.setDoctorId(id);
		
		Integer i = dateDao.dateNum(bean);
		String num = String.valueOf(i+1);
		bean.setNum(num);
		
		JsonResult<String> json = new JsonResult<String>();
		if(dateDao.hasReg(bean)>0){
			json.setData("您已经预约过了！");
			json.setState("0");
		} else if (i<10) {
			dateDao.insert(bean);
			json.setData(String.valueOf(num));
			json.setState("1");
		} else {
			json.setData("人数已经达到10人上线");
			json.setState("0");
		}
		return json;
	}
	
	public String checkName(String id){
		String name= patDao.selectName(id);
		return name;
	}
	
	public List<RegInfo> allInfo(String id){
		List<RegInfo> list = patDao.selectAll(id);
		return list;
	}
	
	public List<DocInfo> docmessage(String doctorId){
		List<DocInfo> bean = dateDao.docInfo(doctorId);
		return bean;
	}
}
