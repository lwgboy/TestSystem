<%@page import="com.pro.domain.Unit"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.service.UnitServiceImpl"%>
<%@page import="com.pro.service.UnitService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String currentPage = request.getParameter("currentPage");
	if(currentPage==null||"".equals(currentPage)){
		currentPage = "1";
	}
	
	UnitService unitService = new UnitServiceImpl();
	PageModel<Unit> pageModel = unitService.findPageUnit(Integer.parseInt(currentPage),10);
	
	request.setAttribute("pageModel",pageModel);
	
	request.getRequestDispatcher("unit.jsp").forward(request, response);
	
%>








