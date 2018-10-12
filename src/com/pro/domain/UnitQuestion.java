package com.pro.domain;

public class UnitQuestion {
	
	private int unitQuestionId;
	private int questionId;
	private String unitId;
	public UnitQuestion(int unitQuestionId, int questionId, String unitId) {
		super();
		this.unitQuestionId = unitQuestionId;
		this.questionId = questionId;
		this.unitId = unitId;
	}
	public UnitQuestion() {
		super();
	}
	public int getUnitQuestionId() {
		return unitQuestionId;
	}
	public void setUnitQuestionId(int unitQuestionId) {
		this.unitQuestionId = unitQuestionId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	
}
