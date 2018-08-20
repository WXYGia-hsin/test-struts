<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/4 0004
  Time: 上午 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPEhtmlPUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
</head>
<body>
<div align="center">
<h1>用户登录</h1>
<s:form  action="login" method="post">
<s:textfield name="userName" label="账号"/>
<s:password name="password" label="密码"/>
<s:submit value="登录"/>
</s:form>
</div>
</body>
</html>