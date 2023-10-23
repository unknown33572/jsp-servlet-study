
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <script type="text/javascript" src="../script/user.js"></script>
  <title>Title</title>
</head>
<body>
  <h2>회원수정</h2>
  <form action="/userUpdate.do" method="post" name="frm">
    <table>
      <tr>
        <td>이름</td>
        <td><input type="text" name="name" size="20" value="${uVo.uname}" readonly></td>
      </tr>

    </table>
  </form>
</body>
</html>
