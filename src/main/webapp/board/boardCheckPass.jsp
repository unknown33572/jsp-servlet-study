<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" href="../css/shopping.css">
  <script type="text/javascript" src="../script/board.js"></script>
</head>
<body>
  <div align="center">
    <h1>비밀번호 확인</h1>
    <form action="BoardServlet" name="frm" method="get">
      <input type="hidden" name="command" value="board_check_pass"> 비밀번호를 입력해주세요.<%-- command에 board_check_pass를 넣어서 보냄 --%>
      <input type="hidden" name="num" value="${param.num}">
      <table style="width: 80%">
        <tr>
          <th>비밀번호</th>
          <td>
            <input type="password" name="pass" size="20">
          </td>
        </tr>
      </table>
      <br>
      <input type="submit" value="확인" onclick="return passCheck()">
      <br>
    </form>
  </div>
</body>
</html>
