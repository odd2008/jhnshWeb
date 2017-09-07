package com.cn.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.ms.entity.TreeBean;
@Repository
public interface SectionDao {
	
	public List<TreeBean> treeNode(String id);
	
	public List<TreeBean> treeRoot();
}
