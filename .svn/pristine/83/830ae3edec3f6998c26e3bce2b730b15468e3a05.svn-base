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
 
<%
	//2
	UnitService unitService = new UnitServiceImpl();
	List<Unit> uL = unitService.findAllUnit();
	List<Unit> unitList = new ArrayList<Unit>();
	for(int i=0;i<uL.size();i++){
		Unit unit = uL.get(i);
		if(unit.getUnitFlag()==1){
			unitList.add(unit);
		}
	}
	request.setAttribute("unitList",unitList);
	
	//3
	request.getRequestDispatcher("chooseUnit.jsp").forward(request,response);
%>