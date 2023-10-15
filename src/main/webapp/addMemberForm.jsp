<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/15/23
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <h2>회원 가입폼</h2>
  <form method="post" action="./addMember.jsp">
    <table border="1">
      <tr>
        <td>이름</td>
        <td><input type="text" name="name"></td>
      </tr>
      <tr>
        <td>나이</td>
        <td><input type="text" name="age"></td>
      </tr>
      <tr>
        <td>성별</td>
        <td><input type="text" name="gender"></td>
      </tr>
      <tr>
        <td>주소</td>
        <td><input type="text" name="address"></td>
      </tr>
        <td colspan="2" align="center">
          <input type="submit" value="확인">
          <input type="reset" value="취소">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
