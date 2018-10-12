<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Unit"%>
<%@page import="java.util.List"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择考试单元</title>
</head>
<body>
	<form action="selectUnit.jsp" method="post">
		<table border="1" width="40%" align="center">
			<tr align="center">
				<td width="65%">
					请选择单元：
					<select name="unitId">
						<%
							List<Unit> unitList = (List<Unit>)request.getAttribute("unitList");
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
					<input type="submit" value="确认测试该试卷" />/<input type="button" value="返回" onclick="tz(); return false;" />
				</td>
			</tr>
		</table>
			
	</form>
</body>
<script type="text/javascript">
	function tz(){
		window.location.href='../index.jsp';
	}
</script>
</html>