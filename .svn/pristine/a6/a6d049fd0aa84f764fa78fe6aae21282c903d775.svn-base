<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Teacher"%>
<%Teacher teacher = (Teacher)session.getAttribute("teacher"); 
		if(teacher==null){
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}%>