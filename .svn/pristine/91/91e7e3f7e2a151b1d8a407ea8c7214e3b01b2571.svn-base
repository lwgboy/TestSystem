<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.pro.domain.Student"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title></title>
	</head>
	<body>
		<table align="center" border="1" width="30%">
				<tr>
					<td>
						学号
					</td>
					<td>
						姓名
					</td>
					<td>
						分数
					</td>
				</tr>
			<c:forEach items="${stuList}" var="stu">
				<tr>
					<td>
						${stu.stuId}
					</td>
					<td>
						${stu.stuName}
					</td>
					<td>
						${stu.totalScore}
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
	<script type="text/javascript">

</script>
</html>