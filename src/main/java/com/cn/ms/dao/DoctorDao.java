package com.cn.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.ms.entity.DoctorBean;
import com.cn.ms.entity.TreeBean;
@Repository
public interface DoctorDao {
	
	public List<TreeBean> tree(String id);
	
	public DoctorBean docInfo(String id);
	
	public int findAll();
	
	public List<DoctorBean> findByNum(int start,int end);
}
