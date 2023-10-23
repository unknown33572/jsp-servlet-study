<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <h2>Login</h2>
  <form action="login.do" method="post" name="loginForm">
    <table>
      <tr>
        <td>ID</td>
        <td><input type="text" id="uid" name="uid" value="${uid}"></td>
      </tr>
      <tr>
        <td>PW</td>
        <td><input type="password" id="upw" name="upw" value="${upw}"></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Login" onclick="loginCheck()">
          <input type="reset" value="Cancel">
          <input type="button" value="Join" onclick="location.href='join.do'">
        </td>
      </tr>
      <tr><td colspan="2">${message}</td></tr>
<%--      <tr><td colspan="2">${loginUser}</td></tr>--%>
    </table>
  </form>
  <script type="text/javascript" src="../script/user.js"></script>
</body>
</html>
