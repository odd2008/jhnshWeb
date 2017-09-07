package com.cn.ms.paging;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ms.dao.DoctorDao;
import com.cn.ms.entity.DoctorBean;
import com.cn.ms.paging.util.PageBean;
import com.cn.ms.paging.util.PagePara;

@Service
public class DoctorDaoImpl implements DoctorInterface{

	@Autowired
	private DoctorDao doctorDao;
	
	@Override
	public PageBean<DoctorBean> findByPage(int current) {
		
		int count = doctorDao.findAll();
		int size = PagePara.PAGE_SIZE;
		
		//找出查询的起始行和最后一行
		int start = size*current + 1;
		int end = size*(current + 1);
		
		List<DoctorBean> list = doctorDao.findByNum(start, end);
		
		PageBean<DoctorBean> pageList = new PageBean<DoctorBean>();
		pageList.setCount(count);
		pageList.setCurrentPage(current);
		pageList.setSize(size);
		pageList.setList(list);
		
		return pageList;
	}

}
