package com.cn.ms.dao;

import org.springframework.stereotype.Repository;

import com.cn.ms.entity.TimeBean;

@Repository
public interface TimeDao {
	//更新医生的预约时间表
	public Integer updateTime(TimeBean bean);
	
	//查出医生设置的预约时间表
	public TimeBean selectTime(String doctorId);
}
