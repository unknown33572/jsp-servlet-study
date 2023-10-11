
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>Login</title>
</head>
<body>
  <form method="get" action="Login"> <%-- GET 방식으로 Login.java 서블릿으로 전송 --%>
    <label for="userid"> 아이디: </label>
    <input type="text" name="id" id="userid" />
    <br />
    <label for="password"> 비밀번호: </label>
    <input type="password" name="pw" id="password" />
    <br />
    <input type="submit" value="로그인" />
  </form>
</body>
</html>
