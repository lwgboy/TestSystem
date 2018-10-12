<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Student"%>
<%@page import="com.pro.service.StudentService"%>
<%@page import="com.pro.service.StudentServiceImpl"%>
<%@page import="com.pro.service.UnitService"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pro.dao.StuQuestionScoreDaoImpl"%>
<%@page import="com.pro.dao.StuQuestionScoreDao"%>
<%@page import="com.pro.service.StuQuestionScoreService"%>
<%@page import="com.pro.service.StuQuestionScoreServiceImpl"%>
 
<%
	Student stu = (Student)session.getAttribute("stu");
	String stuId = stu.getStuId();
	
	//按stuId 查所有unit 成绩
	StudentService studentService = new StudentServiceImpl();
	List<Unit> unitList = studentService.findSingleStuScore(stuId);
	
	List<Unit> ut = new ArrayList<Unit>();
	for(int i = 0; i < unitList.size(); i++){
		Unit unit = unitList.get(i);
		if(unit.getScore()>0){
			ut.add(unit);
		}
	}
	
	
	
	if(ut.size()!=0){
		request.setAttribute("ut",ut);
		
		request.getRequestDispatcher("selectScore.jsp").forward(request,response);
	}else{
		response.sendRedirect("noTesting.jsp");
	}
	

%>