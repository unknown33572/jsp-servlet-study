<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/11/23
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
  <%
    request.setCharacterEncoding("UTF-8");
  %>
  <jsp:useBean id="member" class="com.study.bean.MemberBean" />
  <jsp:setProperty name="member" property="*" />
<head>
  <title>회원 정보 폼</title>
</head>
<body>
  <h2>회원 정보</h2>
  <table>
    <tr>
      <td>아이디</td>
      <td><jsp:getProperty name="member" property="id"/></td>
    </tr>

    <tr>
      <td>비밀번호</td>
      <td><jsp:getProperty name="member" property="pw"/></td>
    </tr>

    <tr>
      <td>이름</td>
      <td><jsp:getProperty name="member" property="name"/></td>
    </tr>

    <tr>
      <td>나이</td>
      <td><jsp:getProperty name="member" property="age"/></td>
    </tr>

    <tr>
      <td>이메일</td>
      <td><jsp:getProperty name="member" property="email"/></td>
    </tr>

    <tr>
      <td>전화번호</td>
      <td><jsp:getProperty name="member" property="phone"/></td>
    </tr>
  </table>
</body>
</html>
