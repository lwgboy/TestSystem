<%@page import="com.pro.domain.UnitQuestionScore"%>
<%@page import="com.pro.service.UnitQuestionScoreServiceImpl"%>
<%@page import="com.pro.service.UnitQuestionScoreService"%>
<%@page import="com.pro.service.UnitQuestionServiceImpl"%>
<%@page import="com.pro.service.UnitQuestionService"%>
<%@page import="com.pro.domain.UnitQuestion"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="com.pro.service.UnitService"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.service.QuestionServiceImpl"%>
<%@page import="com.pro.service.QuestionService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String unitName = request.getParameter("unitName");
	String unitId = request.getParameter("unitId");
	String[] questionId = request.getParameterValues("questionId");
	String[] score = request.getParameterValues("score");
	
	UnitService unitService = new UnitServiceImpl();
	UnitQuestionService unitQuestionService = new UnitQuestionServiceImpl();
	UnitQuestionScoreService unitQuestionScoreServiceImpl = new UnitQuestionScoreServiceImpl();
	
	Unit unit = new Unit();
	unit.setUnitId(unitId);
	unit.setUnitName(unitName);
	unit.setUnitFlag(1);
	unitService.insertUnit(unit);
	
	UnitQuestionScore unitQuestionScore = new UnitQuestionScore();
	unitQuestionScore.setUnitId(unitId);
	
	for(int i = 0; i < questionId.length; i++){
		UnitQuestion unitQuestion = new UnitQuestion();
		unitQuestion.setUnitId(unitId);
		unitQuestion.setQuestionId(Integer.parseInt(questionId[i]));
		
		unitQuestionService.insertUnitQuestion(unitQuestion);
		
		unitQuestionScore.setQuestionId(Integer.parseInt(questionId[i]));
		unitQuestionScore.setScore(Integer.parseInt(score[i]));
		unitQuestionScoreServiceImpl.insertUnitQuestionScore(unitQuestionScore);
	}

	response.sendRedirect("../index.jsp");
	
%>








