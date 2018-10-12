<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.QuestionService"%>
<%@page import="com.pro.service.QuestionServiceImpl"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.domain.Question"%>
<%
	String currentPage = request.getParameter("currentPage");
	if(currentPage==null||"".equals(currentPage)){
		currentPage = "1";
	}
	
	QuestionService questionService = new QuestionServiceImpl();
	PageModel<Question> pageModel = questionService.findPage(Integer.parseInt(currentPage),20);
	request.setAttribute("pageModel",pageModel);
	
	request.getRequestDispatcher("question.jsp").forward(request,response);

%>