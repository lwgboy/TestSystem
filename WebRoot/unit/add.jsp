<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>添加试卷</TITLE>
</HEAD>
<style type="text/css">
	
</style>

<BODY>

<%
	Date dt=new Date();
	String unitId = dt.getTime()+"";
%>
	<form action="doAddUnit.jsp" method="post" >
		<table width="720" align="center">
		<tr height="40"  bgcolor="#D9D9D">
			<td>
				试卷编号
			</td>
			<td align="center">
				<%=unitId %><input type="hidden" id="in1" name="unitId" readonly="readonly" value="<%=unitId %>">
			</td>
		</tr>
			<tr height="40">
				<td align="center">
					试卷名称
				</td>
				<td align="center">
					<input type="text" name="unitName"/>
				</td>
			</tr>
			<tr height="40">
				<td align="center" width="100%" colspan="2"  bgcolor="#D9D9D">
					<a href="#" onclick="f(); return false;" >添加题目</a>
				</td>
			</tr>
		</table>
		<div id="question" style="display:block">
			<table border="1" width="100%">

			</table>
			<table width="100%" height="50">
				<tr>
					<td width="10%" align="center">
						题目编号
					</td>
					<td width="70%" align="center">
						题目内容
					</td>
					<td width="10%" align="center">
						题目分值
					</td>
					<td width="10%" align="center">
						操作
					</td>
				</tr>
			</table>
			<table border="1" width="100%" id="tb">

			</table>
			总分:<label id="total">&nbsp;</label><br/>
			<input type="submit" value="提交" />
		</div>
	</form>
</BODY>

<SCRIPT LANGUAGE="JavaScript">
	function f(){
		window.showModalDialog('doQuestionWin.jsp',window,'dialogWidth=800px;dialogHeight=300px');
	}

	function getSum(){
		var rows_=document.getElementById("tb").rows;
		var sum=0;
		for(var i=0;i<rows_.length;i++){
			sum=sum+parseFloat(rows_[i].cells[2].childNodes[0].value);
		}
		document.getElementById("total").firstChild.nodeValue=sum;
	}

	function remove(v){
		var tab=document.getElementById("tb");
		
		var row_=v.parentNode.parentNode;
		var index=row_.rowIndex;
		
		tab.deleteRow(index);
		
		getSum();
	}

</SCRIPT>
</HTML>