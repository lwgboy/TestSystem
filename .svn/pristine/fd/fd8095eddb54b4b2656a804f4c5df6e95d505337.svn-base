<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.QuestionService"%>
<%@page import="com.pro.service.QuestionServiceImpl"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.domain.Teacher"%>
<%
	request.setCharacterEncoding("UTF-8");
	String teaId = request.getParameter("teaId");
	String questionValue = request.getParameter("questionValue");
	
	Question question = new Question(questionValue,new Teacher(Integer.parseInt(teaId)));
	QuestionService questionService = new QuestionServiceImpl();
	questionService.save(question);
	
	response.sendRedirect("doQuestion.jsp");

%>