<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Question"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="doUpdate.jsp" method="post">
		<table border="1" align="center" width="720">
			<br/><br/><br/><br/><br/>
<%
	Question question = (Question)request.getAttribute("question");
%>
			<tr bgcolor="red">
				<td width="20%" align="center">命题人</td>
				<td width="80%" align="center"><%=question.getTeacher().getTeaName() %><input type="hidden" name="teaId" value="<%=question.getTeacher().getTeaId() %>"/></td>
			</tr>
			<tr>
				<td width="20%" align="center">题目编号</td>
				<td width="80%" align="center"><%=question.getQuestionId() %><input type="hidden" name="questionId" value="<%=question.getQuestionId() %>"/></td>
			</tr>
			<tr>
				<td width="20%" align="center">题目内容</td>
				<td width="80%"><textarea style="width:100%; height:300px;" name="questionValue"><%=question.getQuestionValue() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="确认" />/
					<input type="button" value="返回" onclick="history.go(-1);return false;" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>