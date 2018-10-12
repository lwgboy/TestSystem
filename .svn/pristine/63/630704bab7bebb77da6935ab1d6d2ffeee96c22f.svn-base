<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.StuQuestionScoreServiceImpl"%>
<%@page import="com.pro.service.StuQuestionScoreService"%>
<%@page import="com.pro.service.StudentServiceImpl"%>
<%@page import="com.pro.service.StudentService"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Student"%>


<%
	String unitId = request.getParameter("unitId");

	StudentService studentService = new StudentServiceImpl();
	List<Student> stuList = studentService.findStuGetScore(unitId);
	
	request.setAttribute("stuList",stuList);
	
	request.getRequestDispatcher("showUnitScore.jsp").forward(request,response);
%>