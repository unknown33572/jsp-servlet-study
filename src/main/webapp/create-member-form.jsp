<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/11/23
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>회원가입 폼</title>
</head>
<body>
  <h2>회원가입 입력 폼</h2>
  <form method="post" action="created-member-info.jsp">
    <table>
      <tr>
        <td>아이디</td>
        <td><input type="text" name="id"></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="pw" name="pw"></td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name"></td>
      </tr>
      <tr>
        <td>나이</td>
        <td><input type="text" name="age"></td>
      </tr>
      <tr>
        <td>이메일</td>
        <td><input type="text" name="email"></td>
      </tr>
      <tr>
        <td>전화번호</td>
        <td><input type="text" name="phone"></td>
      </tr>
      <tr>
        <td><input type="submit" value="확인"></td>
        <td><input type="reset" value="취소"></td>
      </tr>
    </table>
  </form>
</body>
</html>
