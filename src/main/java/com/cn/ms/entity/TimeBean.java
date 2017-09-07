package com.cn.ms.entity;

/**
 * 医生出诊的时间
 * @author yu
 *
 */
public class TimeBean {
	
	private String doctorId;
	
	private String mon;
	
	private String tue;
	
	private String wed;
	
	private String thu;
	
	private String fri;
	
	private String sat;
	
	private String sun;

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getMon() {
		return mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getTue() {
		return tue;
	}

	public void setTue(String tue) {
		this.tue = tue;
	}

	public String getWed() {
		return wed;
	}

	public void setWed(String wed) {
		this.wed = wed;
	}

	public String getThu() {
		return thu;
	}

	public void setThu(String thu) {
		this.thu = thu;
	}

	public String getFri() {
		return fri;
	}

	public void setFri(String fri) {
		this.fri = fri;
	}
	
	public String getSat() {
		return sat;
	}

	public void setSat(String sat) {
		this.sat = sat;
	}

	public String getSun() {
		return sun;
	}

	public void setSun(String sun) {
		this.sun = sun;
	}

	@Override
	public String toString() {
		return "TimeBean [doctorId=" + doctorId + ", mon=" + mon + ", tue=" + tue + ", wed=" + wed + ", thu=" + thu
				+ ", fri=" + fri + "]";
	}
	
	
}
