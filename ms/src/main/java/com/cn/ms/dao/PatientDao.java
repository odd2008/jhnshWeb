package com.cn.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.ms.entity.RegInfo;
import com.cn.ms.entity.RegUser;
@Repository
public interface PatientDao {
 
	public RegUser checkReg(String id);
		
	public String selectName(String id);
	
	public List<RegInfo> selectAll(String id);
}
