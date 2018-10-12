<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.pro.service.UnitQuestionScoreServiceImpl"%>
<%@page import="com.pro.service.UnitQuestionScoreService"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.service.UnitQuestionService"%>
<%@page import="com.pro.service.UnitQuestionServiceImpl"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="com.pro.service.UnitService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String unitId = request.getParameter("unitId");
	
	UnitQuestionScoreService unitQuestionService = new UnitQuestionScoreServiceImpl();
	
	Map<String,Object> maps = new HashMap<String,Object>(); 
	
	maps = unitQuestionService.findUnitQuestionScore(unitId);
	
	UnitService unitService = new UnitServiceImpl();
	Unit unit = unitService.findSingleUnit(unitId); 

	request.setAttribute("maps", maps);
	request.setAttribute("unit", unit);
	
	request.getRequestDispatcher("unitQuestion.jsp").forward(request, response);
	
%>








