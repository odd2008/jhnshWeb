package com.cn.ms.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ms.dao.DoctorDao;
import com.cn.ms.dao.SectionDao;
import com.cn.ms.entity.TreeBean;

@Service
public class TreeService {
	@Autowired
	private DoctorDao doctorDao;
	
	@Autowired
	private SectionDao sectionDao;
	
	//查询组织和人员身份信息
	public List<TreeBean> select(String id){
		if(!StringUtils.isEmpty(id)){
			List<TreeBean> node = sectionDao.treeNode(id);
			for(TreeBean e: node){
				e.setpId(id);
				e.setIsParent(true);
			}
			List<TreeBean> peoplenode = doctorDao.tree(id);
			for(TreeBean e: peoplenode){
				e.setpId(id);
				e.setIsParent(false);
			}
			node.addAll(peoplenode);
			return node;
		}else{
			List<TreeBean> root = sectionDao.treeRoot();
			for(TreeBean e: root){
				e.setIsParent(true);
			}
			return root;
		}
	}
}
