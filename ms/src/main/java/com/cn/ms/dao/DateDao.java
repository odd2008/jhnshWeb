package com.cn.ms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.ms.entity.DateBean;
import com.cn.ms.entity.DocInfo;

@Repository
public interface DateDao {
	
	public Integer dateNum(DateBean bean);
	
	public Integer insert(DateBean bean);
	
	public Integer hasReg(DateBean bean);
	
	public List<DocInfo> docInfo(String doctorId);
}
