package com.cn.ms.paging;


import com.cn.ms.entity.DoctorBean;
import com.cn.ms.paging.util.PageBean;

public interface DoctorInterface {
	
	public PageBean<DoctorBean> findByPage (int current);
	
}
