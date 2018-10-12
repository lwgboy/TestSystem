<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pro.util.PageModel"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="java.util.List"%>
<HTML>
<HEAD>
<TITLE>题目</TITLE>
</HEAD>

<BODY>
	<br />
	<a href="add.jsp">添加题目</a>
	<br />
	<table width="100%" border="1">
		<tr bgcolor="red" align="center">
			<td width="10%" align="center">
				题目编号
			</td>
			<td width="70%">
				题目内容
			</td>
			<td width="10%" align="center">
				出题老师
			</td>
			<td width="10%" align="center">
				操作
			</td>
		</tr>
<%
	PageModel<Question> pageModel =(PageModel<Question>)request.getAttribute("pageModel");
	List<Question> questionList = pageModel.getList();
	for(int i = 0; i <questionList.size();i++){
		Question question = questionList.get(i);
%>
		<tr >
			<td align="center">
				<%=question.getQuestionId() %>
			</td>
			<td>
				<%=question.getQuestionValue() %>
			</td>
			<td align="center">
				<%=question.getTeacher().getTeaName() %>
			</td>
			<td align="center">
				<a href="selectOne.jsp?questionId=<%=question.getQuestionId() %>&currentPage=<%=pageModel.getCurrentPage()%>">修改</a>/
				<a href="#" onclick="return confirm('你真的要删除嘛？')">删除</a>
			</td>
		</tr>
<%
	}
%>	
	</table>
	
	
	<script type="text/javascript">
		function f(v) {
			//找到你准备赋值并提效的表单
			var searchForm = document.getElementById("searchForm");
			//为表单元素currentPage赋值。
			document.getElementById('currentPage').value = v;
			//提交表单
			searchForm.submit();
		}
	</script>
	<form action="doQuestion.jsp" method="post" id="searchForm">
		<!-- 页码放在这个表单元素中 -->
		<input type="hidden" name="currentPage" id="currentPage" />
	</form>
	<table width="100%" border="1">
		<tr>
			<td align="right">
				<a href="#" onclick="f(1);return false;">首页</a>
				<a href="#" onclick="f(<%=pageModel.getPageUp()%>);return false;">上一页</a>
				第
				<%=pageModel.getCurrentPage()%>页

				<a href="#" onclick="f(<%=pageModel.getPageEnd()%>);return false;">下一页</a>
				<a href="#" onclick="f(<%=pageModel.getPageEnd()%>);return false;">尾页</a>

				<a href="#" onclick="f(<%=pageModel.getPageDown()%>);return false;">下一页</a>
				<a href="#" onclick="f(<%=pageModel.getPageEnd()%>);return false;">尾页</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
	</table>
	
	
</BODY>
</HTML>