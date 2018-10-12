package com.pro.domain;

public class StuQuestionScore {
	
	private int answerId;
	private String answerValue;
	private int answerScore;
	private Unit unit;
	private Question question;
	private Student student;
	private int unitQuestionScore;
	

	private int questionId;
	private String stuId;
	private String unitId;
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	public int getUnitQuestionScore() {
		return unitQuestionScore;
	}
	public void setUnitQuestionScore(int unitQuestionScore) {
		this.unitQuestionScore = unitQuestionScore;
	}
	public StuQuestionScore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuQuestionScore(int answerId, String answerValue, int answerScore, Unit unit, Question question,
			Student student) {
		super();
		this.answerId = answerId;
		this.answerValue = answerValue;
		this.answerScore = answerScore;
		this.unit = unit;
		this.question = question;
		this.student = student;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswerValue() {
		return answerValue;
	}
	public void setAnswerValue(String answerValue) {
		this.answerValue = answerValue;
	}
	public int getAnswerScore() {
		return answerScore;
	}
	public void setAnswerScore(int answerScore) {
		this.answerScore = answerScore;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
