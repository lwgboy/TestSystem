<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.UnitService"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.service.StudentService"%>
<%@page import="com.pro.service.StudentServiceImpl"%>
<%@page import="com.pro.domain.Student"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%
	UnitService unitService = new UnitServiceImpl();
	List<Unit> unitList = unitService.findAllUnit();
	
	StudentService studentService = new StudentServiceImpl();
	List<Student> studentList = studentService.findStudentAll();
	
	Map<String, Object> maps = new HashMap<String, Object>();
	maps.put("unitList",unitList);
	maps.put("studentList",studentList);
	request.setAttribute("maps",maps);
	
	request.getRequestDispatcher("beforCorrection.jsp").forward(request,response);

%>


