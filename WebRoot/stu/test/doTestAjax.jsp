<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.StuQuestionScore"%>
<%@page import="com.alibaba.fastjson.JSON"%>
<%@page import="com.pro.service.StuQuestionScoreService"%>
<%@page import="com.pro.service.StuQuestionScoreServiceImpl"%>
<%
	String stuQuestionScoreStr=new String(request.getParameter("stuQuestionScore").getBytes("ISO-8859-1"),"UTF-8");
	StuQuestionScore stuQuestionScore = JSON.parseObject(stuQuestionScoreStr,StuQuestionScore.class);
	
	String stuId = stuQuestionScore.getStuId();
	String unitId = stuQuestionScore.getUnitId();
	int questionId = stuQuestionScore.getQuestionId();
	String answerValue = stuQuestionScore.getAnswerValue();
	
	//System.out.println(stuId+":"+unitId+":"+questionId+":"+answerValue);
	
	StuQuestionScoreService stuQuestionScoreService = new StuQuestionScoreServiceImpl();
	stuQuestionScoreService.update_stuQuestionScore_answerValue(unitId,stuId, questionId, answerValue);
	
	

%>