<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Unit"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title></title>
	</head>
	<%
		List<Unit> unitList = (List<Unit>)request.getAttribute("ut");
	%>
	<body>
		<table align="center" border="1" width="25%">
			<tr>
				<td>
					单元名
				</td>
				<td>
					成绩
				</td>
			</tr>
			<%
				for(int i = 0; i < unitList.size(); i++)
				{
					Unit unit = unitList.get(i);
			%>
			<tr>
				<td>
					<%=unit.getUnitName() %>
				</td>
				<td>
					<%=unit.getScore() %>
				</td>
			</tr>
			<%				
				}
			%>
			
		</table>
	</body>
</html>