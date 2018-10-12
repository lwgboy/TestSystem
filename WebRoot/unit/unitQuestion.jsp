<%@page import="com.pro.domain.UnitQuestionScore"%>
<%@page import="java.util.Map"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.domain.Unit"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
<TITLE>所有单元</TITLE>
</HEAD> 
<BODY>
<%
	Unit unit = (Unit)request.getAttribute("unit");
 %>
<table width="100%">
	<tr height="60">
		<td colspan="2">
			<%=unit.getUnitName() %>
		</td>
	</tr>
	<tr height="40">
		<td width="10%">
			题号
		</td>
		<td width="70%">
			题目
		</td>
		<td width="20%">
			题目分数
		</td>
	</tr>
<%
	Map<String,Object> maps = (Map<String,Object>)request.getAttribute("maps");
	List<Question> questionList =(List<Question>) maps.get("questionList");
	List<UnitQuestionScore> scoreList =(List<UnitQuestionScore>) maps.get("scoreList");
	for(int i = 0 ; i < questionList.size(); i++){
	Question question = questionList.get(i);
	UnitQuestionScore unitQuestionScore = scoreList.get(i);
 %>
 	<tr height="60">
		<td width="10%">
			<%=question.getQuestionId() %>
		</td>
		<td width="70%">
			<%=question.getQuestionValue() %>
		</td>
		<td width="20%">
			<%=unitQuestionScore.getScore() %>
		</td>
	</tr>
<%
	}
 %>
</table>
</BODY>
</HTML>






