<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/9/23
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>MethodType</title>
</head>
<body>
  <form method="get" action="MethodServlet">
    <input type="submit" value="GET 방식">
  </form>
  <br>
  <form method="post" action="MethodServlet">
    <input type="submit" value="POST 방식">
  </form>
</body>
</html>
