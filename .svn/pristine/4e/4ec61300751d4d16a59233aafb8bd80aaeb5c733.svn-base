<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.TeacherService"%>
<%@page import="com.pro.service.TeacherServiceImpl"%>
<%@page import="com.pro.domain.Teacher"%>
<%
	String teaId = request.getParameter("teaId");
	String teaPwd = request.getParameter("pwd");
	
	TeacherService teacherService = new TeacherServiceImpl();
	Teacher teacher = null;
	teacher = teacherService.getTea(Integer.parseInt(teaId),teaPwd);
	String path = "login.jsp";
	if(null!=teacher){
		path = "index.jsp";
		session.setAttribute("teacher",teacher);
	}
	response.sendRedirect(path);
%>