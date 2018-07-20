<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>注册成功！</h1>
<h2>即将跳转至登录页面</h2>
<%response.setHeader("refresh","3; url=/SpringMVC/login"); %>
<h3>如果没有跳转,请按  <a href="${pageContext.request.contextPath}/login">这里</a></h3>
</body>
</html>