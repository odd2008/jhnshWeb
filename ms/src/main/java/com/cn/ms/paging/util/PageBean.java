package com.cn.ms.paging.util;

import java.util.List;


public class PageBean<T> {
	
	/**
	 * 当前的页码  jsp传来的
	 */
	private int currentPage;
	
	/**
	 * 每页的大小
	 */
	private int size;
	
	/**
	 * 总数
	 */
	private int count;
	
	/**
	 * 分页bean的集合
	 */
	private List<T> list;

	/**
	 * 获取最大的页数
	 * @return
	 */
	public int getLastPage(){
		int num = count/size;
		return count%size == 0? num : num+1;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
