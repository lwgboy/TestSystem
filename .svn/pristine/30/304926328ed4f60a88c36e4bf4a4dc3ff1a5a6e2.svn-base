<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Student"%>
<%@page import="com.pro.service.StudentService"%>
<%@page import="com.pro.service.StudentServiceImpl"%>
 
<%
	String stuId = request.getParameter("teaId");
	String stuPwd = request.getParameter("pwd");
	Student student = new Student();
	student.setStuId(stuId);
	student.setStuPwd(stuPwd);
	
	StudentService studentService = new StudentServiceImpl();
	Student stu = studentService.findStudentSingle(student);
	String path = "../login.jsp";
	if(null!=stu){
		path = "index.jsp";
		session.setAttribute("stu",stu);
	}
	response.sendRedirect(path);
%>