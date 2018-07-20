<%@ page language="java" contentType="text/html; charset=UTF-8"    
    pageEncoding="UTF-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">    
<html>    
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
<title>Login</title>    
</head>    
<body>    
<form name="form1" action="${pageContext.request.contextPath}/login.do" method="POST">
	username:<input type="text" value="${param.username}" name="username"/> <br/>
	password:<input type="password" value="${param.password}" name="password"/> <br/>
	
	<script language="javascript" type="text/javascript"> 
function check()
{
if (document.form1.username.value==""){
alert("请输入登录账号!");
return false;
}
if (document.form1.password.value==""){
alert("请输入登录密码!");
return false;
}
return true; 
}
</script> 
	<input type="submit" value="提交" onclick="return check()" style="display:inline; float:left;margin-right:50px"/>
	<a href="${pageContext.request.contextPath}/reg" style="float:left; display:inline;margin-top:4px">注册</a>
</form>
<br/>
<hr/>
<label style="color:red;"> ${msg} </label>
</body>    
</html>   
