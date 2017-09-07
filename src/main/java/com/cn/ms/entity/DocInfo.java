package com.cn.ms.entity;

public class DocInfo {

	private String name;
	
	private String patName;
	
	private String num;
	
	private String date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DocInfo [name=" + name + ", patName=" + patName + ", num=" + num + ", date=" + date + "]";
	}
	
	
}
