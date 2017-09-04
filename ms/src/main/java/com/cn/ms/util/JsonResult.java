package com.cn.ms.util;

import java.io.Serializable;

public class JsonResult<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	//state 1是成功  2是失败
	private String state;
	private T data;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
