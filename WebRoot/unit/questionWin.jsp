<%@page import="java.util.List"%>
<%@page import="com.pro.domain.Question"%>
<%@page import="com.pro.util.PageModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
<TITLE>题目列表</TITLE>

</HEAD>

<BODY>
	<table width="800">
		<tr height="60" bgcolor="#D1D1D1">
			<td width="10%" align="center">
				题目编号
			</td>
			<td width="70%" align="center">
				题目名称
			</td>
			<td width="20%">
				出题老师
			</td>
		</tr>
		<c:forEach items="${pageModel.list }" var="question" varStatus="vs">
		<tr
			height="40"
			<c:if test="${vs.count%2==0 }">
				bgcolor="#D9D9D";
			</c:if>
		>
			<td width="10%" align="center">
				${question.questionId }
			</td>
			<td width="70%">
				<a href="#" no="${question.questionId }" onclick="fc(this);return false;">${question.questionValue }</a>
			</td>
			<td width="20%">
				${question.teacher.teaName }
			</td>
		</tr>
		</c:forEach>
	
	</table>
	<%@include file="../inc.jsp" %>
</BODY>

<SCRIPT LANGUAGE="JavaScript">
	function fc(v){

		var parWin=window.parent.dialogArguments;
		var tb=parWin.document.getElementById("tb");
		for(var i=0; i<tb.rows.length;i++){
			if(tb.rows[i].cells[0].firstChild.nodeValue==v.getAttribute("no")){
				 alert('该题目已经添加！');
				 return;
			}
		}

		var row_=tb.insertRow();

		var cell_1=row_.insertCell(0);
		cell_1.innerHTML=v.getAttribute("no")+'<input type="hidden" name="questionId" id="questionId" value="'+v.getAttribute("no")+'" />';
		cell_1.width="10%";

		var cell_2=row_.insertCell(1);
		cell_2.innerHTML=v.firstChild.nodeValue;
		cell_2.width="70%";

		var cell_3=row_.insertCell(2);
		cell_3.innerHTML='<input type="text" name="score" id="score" value="0" onblur="getSum();"/>';
		cell_3.width="10%";

		var cell_4=row_.insertCell(3);
		cell_4.innerHTML='<a href="#" onclick="remove(this)">移除</a>';
		cell_4.width="10%";
		
		parWin.getSum();
	}
</SCRIPT>

</HTML>