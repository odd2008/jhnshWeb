package com.cn.ms.entity;

public class DoctorBean {

	private String id;
	
	private String password;
	
	private String name;
	
	private String sectionId;
	
	private String sex;
	
	private String info;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "DoctorBean [id=" + id + ", password=" + password + ", name=" + name + ", sectionId=" + sectionId
				+ ", sex=" + sex + ", info=" + info + ", getId()=" + getId() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + ", getSectionId()=" + getSectionId() + ", getSex()=" + getSex()
				+ ", getInfo()=" + getInfo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
