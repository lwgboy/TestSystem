<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.service.QuestionServiceImpl"%>
<%@page import="com.pro.service.QuestionService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

/* 	String currentPage = request.getParameter("currentPage");
	if(currentPage==null||"".equals(currentPage)){
		currentPage = "1";
	}
	
	QuestionService questionService = new QuestionServiceImpl();
	PageModel<Question> pageModel = questionService.findPage(Integer.parseInt(currentPage),2);
	request.setAttribute("pageModel",pageModel);
	
	request.getRequestDispatcher("add.jsp").forward(request, response); */
	
	QuestionService questionService = new QuestionServiceImpl();
	List<Question> questionList = questionService.findAll();
	request.setAttribute("questionList",questionList);
	request.getRequestDispatcher("addUnit.jsp").forward(request, response);
%>

