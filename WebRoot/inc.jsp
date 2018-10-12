<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<script type="text/javascript">
		function f(v){
			
			var searchForm = document.getElementById('searchForm');
			
			document.getElementById('currentPage').value = v;
			
			searchForm.submit();
		}
	</script>

	<table height="40" align="right">
		<tr>
			<td>
			<c:choose>
				<c:when test="${pageModel.currentPage<=1 }">
					首页 上一页
				</c:when>
				<c:otherwise>
					<a href="#" onclick="f(1); return false;" >首页</a>
					<a href="#" onclick="f(${pageModel.pageUp}); return false;" >上一页</a>
				</c:otherwise>
			</c:choose> 
			
			<c:choose> 
				<c:when test="${pageModel.currentPage>=pageModel.totalPage }">
					下一页 尾页
				</c:when>
				<c:otherwise>
					<a href="#" onclick="f(${pageModel.pageDown}); return false;" >下一页</a>
					<a href="#" onclick="f(${pageModel.pageEnd}); return false;" >尾页</a>
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
	</table>
</body>
</html>
