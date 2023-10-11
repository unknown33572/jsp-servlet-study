<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/10/23
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Test-LoginForm</title>
</head>
<body> <%-- 로그인 폼 --%>
  <form method="post" action="test-login.jsp">
    <label for="userid"> 아이디 : </label>
    <input type="text" name="id" id="userid" />
    <br />
    <label for="userpw"> 비밀번호 : </label>
    <input type="password" name="pw" id="userpw" />
    <br />
    <input type="submit" value="로그인" />
  </form>
</body>
</html>
