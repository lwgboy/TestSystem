<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.StuQuestionScoreServiceImpl"%>
<%@page import="com.pro.service.StuQuestionScoreService"%>
<%@page import="com.pro.service.StudentServiceImpl"%>
<%@page import="com.pro.service.StudentService"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.service.UnitService"%>
<%@page import="com.pro.service.UnitServiceImpl"%>


<%
//2
	UnitService unitService = new UnitServiceImpl();
	List<Unit> unitList = unitService.findAllUnit();
	
	request.setAttribute("unitList",unitList);
	
	//3
	request.getRequestDispatcher("unitList.jsp").forward(request,response);
	
%>