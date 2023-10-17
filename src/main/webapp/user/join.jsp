<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/16/23
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Join</title>
</head>
<body>
  <h2>Join</h2>
  <form action="join.jsp" method="post" name="frm">
    <table>
      <tr>
        <td>ID</td>
        <td>
          <input type="text" name="uid" size="20">필수
          <input type="hidden" name="checkid" size="20">
          <input type="button" value="중복확인" onclick="idCheck()">
          <td id="idError-message" colspan="2"></td>
        </td>
      </tr>
      <tr>
        <td>PW</td>
        <td><input type="password" name="upw" size="20">필수</td>
      </tr>
      <tr>
        <td>PW Check</td>
        <td><input type="password" name="upw_check" size="20">필수</td>
        <td id="pwError-message" colspan="2"></td>
      </tr>
      <tr>
        <td>Name</td>
        <td><input type="text" name="uname" size="20">필수</td>
      </tr>
      <tr>
        <td>E-mail</td>
        <td><input type="text" name="email" size="20"></td>
      </tr>
      <tr>
        <td>Phone</td>
        <td><input type="text" name="phone" size="20"></td>
      </tr>
      <tr>
        <td>gender</td>
        <td><select name="gender">
          <option value="1">남성</option>
          <option value="2">여성</option>
        </select>필수</td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="button" value="가입하기" onclick="validateForm()">
          <input type="reset" value="다시작성">
        </td>
      </tr>
      <tr><td colspan="2">${message}</td></tr>
    </table>
  </form>
  <script type="text/javascript" src="../script/user.js"></script>
</body>
</html>
