<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录</title>
</head>
<body>
	<form id="frm" name="frm" action="dologin.jsp" method="post" onsubmit="return f();">
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	<table border="1" width="500" align="center"> 
		<tr	bgcolor="blue" align="center">
			<td colspan="2">登录</td>
		</tr>
		
		<tr>
			<td>登录选项</td>
			<td>
				<input type="radio" name="flag" value="1" checked />学生
				<input type="radio" name="flag" value="2"  />教师
			</td>
		</tr>
		
		<tr>
			<td>账号</td>
			<td>
				<input type="text" name="teaId" id="teaId" />
			</td>
		</tr>
		<tr>
			<td>密码</td>
			<td>
				<input type="password" name="pwd" id="pwd" />
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="submit" value="登录" ></input>
				<input type="reset" value="重置" ></input>
			</td>
		</tr>
	</table>
	</form>
</body>
<script type="text/javascript">
	function f(){
		var teaId=document.getElementById("teaId").value;
		var password=document.getElementById("pwd").value;
		
		var flag=document.getElementsByName("flag");
		
		var reg = /^[0-9]*$/;
		if(teaId==""||teaId==null){
			alert('账号不能为空');
			document.getElementById("teaId").focus();
			document.getElementById("teaId").style.borderColor='red';
			return false;
		}else if(!reg.test(teaId)){
			alert('账号输入错误！');
			document.getElementById("teaId").focus();
			return false;
		}else if(password==""||password==null){
			alert('请输入密码');
			document.getElementById("pwd").focus();
			document.getElementById("pwd").style.borderColor='red';
			return false;
		}
		
		for(var i=0;i<flag.length;i++){
			if(flag[0].checked){
				document.getElementById("frm").action="stu/doStuLogin.jsp";
			}
		}
		
	return true;

	}
</script>
</html>