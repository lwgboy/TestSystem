<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Student"%>
<%@page import="com.pro.domain.Unit"%>
<html>
<head>
<title>查询批改试卷</title>
</head>
<body>
<%
	Map<String,Object> maps = (Map<String,Object>)request.getAttribute("maps");
	List<Student> studentList = (List<Student>)maps.get("studentList");
	List<Unit> unitList = (List<Unit>)maps.get("unitList");
%>
	<form action="selectStuQuestionScore.jsp" method="post">
		<table border="1" width="60%" align="center">
			<tr align="center">
				<td width="35%">
					请选择第几单元：
					<select name="unitId">
						<%
							for(int i = 0;i<unitList.size();i++)
								{
									Unit unit =  unitList.get(i);
						%>
							<option value="<%=unit.getUnitId()%>"><%=unit.getUnitName()%></option>
						<%
							}
						%>
					</select>
				</td>
				<td width="35%">
					请选择哪位学生：
					<select name="stuId">
						<%
							for(int i = 0;i<studentList.size();i++)
								{
									Student student = studentList.get(i);
						%>
							<option value="<%=student.getStuId()%>"><%=student.getStuId()%>:<%=student.getStuName()%></option>
						<%
							}
						%>
					</select>
				</td>
				<td width="30%">
					<input type="submit" value="确认批改该试卷" />/<input type="button" value="返回" onclick="history.go(-1);return false;" />
				</td>
			</tr>
		</table>

	</form>
</body>
</html>