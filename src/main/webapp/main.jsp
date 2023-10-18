<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty loginUser}">
  <jsp:forward page="login.do"/>
</c:if>
<html>
<head>
  <title>UserInfo</title>
  <script type="text/javascript" src="script/user.js"></script>
</head>
<body>
  <h2>회원 전용 페이지</h2>
  <form action="logout.do">
    <table>
      <tr>
        <td>
          안녕하세요. <c:out value="${loginUser.uname}"/>님 환영합니다!
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="로그아웃"/>
          <input type="button" value="회원정보변경" onclick="location.href='userUpdate.do?uid=${loginUser.uid}'">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
