<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>添加试卷</TITLE>
</HEAD>

<BODY>
	<form>
		<table border="1" width="720">
			<tr >
				<td align="center" bgcolor="#D1D1D1">
					单元测试名称
				</td>
				<td align="center">
					<input type="text" />
				</td>
			</tr>
			<tr>
				<td align="center" width="100%" colspan="2">
					<a href="#" onclick="f(); return false;" >添加题目</a>
				</td>
			</tr>
		</table>
		<div id="question" style="display:block">
			<label><font color="#6600FF">订单商品明细：</font></label>
			<table width="90%" border="1">
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
			<table border="1" width="90%" id="tb">

			</table>
			总分:<label id="total">&nbsp;</label><br/>
			<input type="submit" value="提交" />
		</div>
	</form>
</BODY>

<SCRIPT LANGUAGE="JavaScript">
	function f(){
		window.showModalDialog('questionWin.html',window,'dialogWidth=800px;dialogHeight=300px');
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