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
	<br/>
	<a href="doQuestionWin.jsp">添加单元测试</a>
	<br/><br/>
	<div id="updateDiv" style="dsiplay:none;">
		
	</div>
	<table width="100%">
		<tr  bgcolor="#D1D1D1" align="center" height="60">
			<td width="20%">
				单元编号
			</td>
			<td width="55%">
				单元测试名称
			</td>
			<td>
				操作
			</td>
		</tr>
		
		 <c:forEach items="${pageModel.list }" var="unit" varStatus="vs">
		<tr height="40"
			<c:if test="${vs.count%2==0 }">
				bgcolor="#D9D9D";
			</c:if>
		>
			<td width="10%" align="center">
				${unit.unitId }
			</td>
			<td width="65%">
				<a href="doUnitQuestion.jsp?unitId=${unit.unitId }">${unit.unitName }</a>
			</td>
			<td>
				<a href="#">修改</a>
			</td>
		</tr>
		</c:forEach>
		
	</table>
	<form action="doUnit.jsp" method="post" id="searchForm">
		<input type="hidden" id="currentPage" name="currentPage"/>
	</form>
		<%@include file="../inc.jsp" %>
</BODY>
</HTML>
