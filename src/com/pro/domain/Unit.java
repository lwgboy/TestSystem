package com.pro.domain;

public class Unit {

	private String unitId;
	private String unitName;
	private int unitFlag;
	
	
	//各个unit的所有学生（List）的成绩
	private int score;
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Unit(String unitId, String unitName, int unitFlag) {
		super();
		this.unitId = unitId;
		this.unitName = unitName;
		this.unitFlag = unitFlag;
	}
	public Unit() {   
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public int getUnitFlag() {
		return unitFlag;
	}
	public void setUnitFlag(int unitFlag) {
		this.unitFlag = unitFlag;
	}
	public Unit(String unitId) {
		super();
		this.unitId = unitId;
	}

	
}
