<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2019/1/2
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>html登录模板</title>
</head>
<body>
<div class="login">
    <h1>登录</h1>
    <form action="/login" method="post">
        <ul>
            <li>姓　名：<input type="text" name="usercode" /> </li>
            <li>密　码：<input type="text" name="password" /> </li>
            <li><input type="submit" value="登录" /> </li>
        </ul>
    </form>
</div>
</body>
</html>
