<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
<form action="Login.action" method="post">
用户名：<input type="text" name="username"><br>
密码：<input type="password" name="password"><br>
书籍1：<input type="text" name="book[0].username"><br>
书籍2：<input type="text" name="book[1].password"><br>
&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交">
</form>
</body>
</html>