<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.service.StuQuestionScoreService"%>
<%@page import="com.pro.service.StuQuestionScoreServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.StuQuestionScore"%>
<%@page import="com.pro.service.UnitService"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.service.StudentService"%>
<%@page import="com.pro.service.StudentServiceImpl"%>
<%@page import="com.pro.domain.Student"%>
<%
	String unitId = request.getParameter("unitId");
	String stuId = request.getParameter("stuId");
	
	UnitService unitService = new UnitServiceImpl();
	Unit unit = unitService.findSingleUnit(unitId);
	
	StudentService studentService = new StudentServiceImpl();
	Student stu = studentService.findOne(stuId);
	
	StuQuestionScoreService stuQuestionScoreService = new StuQuestionScoreServiceImpl();
	StuQuestionScore stuQuestionScore = stuQuestionScoreService.findStuQSSingle(stuId,unitId);
	if(stuQuestionScore==null){
		response.sendRedirect("correctionError.jsp");
	}else{
		List<StuQuestionScore> stuQuestionScoreList = stuQuestionScoreService.getStuQuestionScoreList(unitId,stuId);
		request.setAttribute("stuQuestionScoreList",stuQuestionScoreList);
		request.setAttribute("unit",unit);
		request.setAttribute("student",stu);

		request.getRequestDispatcher("correction.jsp").forward(request,response);
	}
	
%>