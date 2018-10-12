<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.service.QuestionService"%>
<%@page import="com.pro.service.QuestionServiceImpl"%>
<%
	String questionId=request.getParameter("questionId");
	int currentPage =Integer.parseInt(request.getParameter("currentPage"));
	
	QuestionService questionService = new QuestionServiceImpl();
	Question question = questionService.findtOne(Integer.parseInt(questionId));
	request.setAttribute("question",question);
	
	request.getRequestDispatcher("update.jsp").forward(request,response);

%>