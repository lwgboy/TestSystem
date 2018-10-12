package com.pro.domain;

public class Teacher {
	
	private int teaId;
	private String teaName;
	private String teaPwd;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getTeaPwd() {
		return teaPwd;
	}
	public void setTeaPwd(String teaPwd) {
		this.teaPwd = teaPwd;
	}
	public Teacher(int teaId) {
		super();
		this.teaId = teaId;
	}
	public Teacher(int teaId, String teaName) {
		super();
		this.teaId = teaId;
		this.teaName = teaName;
	}
	
}
