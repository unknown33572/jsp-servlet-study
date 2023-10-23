<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <h2>아이디 중복확인</h2>
  <form action="IdCheck.do" method="get" name="frm">
    아이디 <input type="text" name="userid" value="${userid}"/>
    <input type="submit" value="중복확인">
    <br>
    <c:if test="${result == 1}">
      <script type="text/javascript">
        opener.document.frm.userid.value = "";
      </script>
      ${userid}는 이미 사용중인 아이디입니다.
    </c:if>

    <c:if test="${result == -1}">
      ${userid}는 사용 가능한 아이디입니다.
      <input type="button" value="사용" onclick="idOk()">
    </c:if>
  </form>
  <script type="text/javascript" src="../script/user.js"></script>
</body>
</html>
