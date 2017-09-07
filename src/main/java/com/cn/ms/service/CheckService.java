package com.cn.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ms.dao.DoctorDao;
import com.cn.ms.dao.PatientDao;
import com.cn.ms.entity.DoctorBean;
import com.cn.ms.entity.RegUser;
import com.cn.ms.util.JsonResult;

@Service
public class CheckService {
    @Autowired
	private PatientDao check;
    
    @Autowired
   	private DoctorDao check2;
    
    public JsonResult<RegUser> checkReg(String id,String password){
    	RegUser user = check.checkReg(id);
    	JsonResult<RegUser> result = new JsonResult<RegUser>();
    	if (user!=null) {
    		if (password!=null && !password.trim().equals("") && user.getPassword().equals(password)){
        		result.setState("1");
        		result.setData(user);
    		}
    	} else {
    		result.setState("0");
    		result.setData(new RegUser());
    	}
    	return result;
    }
    
    public JsonResult<DoctorBean> checkReg2(String id,String password){
    	DoctorBean user = check2.docInfo(id);
    	JsonResult<DoctorBean> result = new JsonResult<DoctorBean>();
    	if (user!=null) {
    		if (password!=null && !password.trim().equals("") && user.getPassword().equals(password)){
        		result.setState("1");
        		result.setData(user);
    		}
    	} else {
    		result.setState("0");
    		result.setData(new DoctorBean());
    	}
    	return result;
    }
    
}
