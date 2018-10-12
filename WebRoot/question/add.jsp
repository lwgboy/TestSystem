<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../seinc.jsp"  %>
<html>
<head>
<title>题库添加</title>
</head>
<body>
	<form action="doAdd.jsp" method="post">
		<table border="1" align="center" width="720">
			<br/><br/><br/><br/><br/>
			<tr bgcolor="red">
				<td width="20%" align="center">命题人</td>
				<td width="80%" align="center"><%=teacher.getTeaName() %><input type="hidden" name="teaId" value="<%=teacher.getTeaId() %>"/></td>
			</tr>
			<tr>
				<td width="20%" align="center">题目内容</td>
				<td width="80%"><textarea style="width:100%; height:300px;" name="questionValue"></textarea></td>
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