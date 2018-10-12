<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.QuestionService"%>
<%@page import="com.pro.service.QuestionServiceImpl"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.domain.Teacher"%>
<%
	request.setCharacterEncoding("UTF-8");
	String questionId = request.getParameter("questionId");
	String teaId = request.getParameter("teaId");
	String questionValue = request.getParameter("questionValue");
	
	Question question = new Question(Integer.parseInt(questionId),questionValue,new Teacher(Integer.parseInt(teaId)));
	QuestionService questionService = new QuestionServiceImpl();
	questionService.update(question);
	
	response.sendRedirect("doQuestion.jsp");

%>