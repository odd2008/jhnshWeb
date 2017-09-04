package com.cn.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ms.dao.TimeDao;
import com.cn.ms.entity.TimeBean;

@Service
public class TimeService {

	@Autowired
	public TimeDao dao;
	
	public void setTime(TimeBean bean){
		dao.updateTime(bean);
	}
	
	public TimeBean selectTime(String doctorId){
		TimeBean bean = dao.selectTime(doctorId);
		return bean;
	}
}
