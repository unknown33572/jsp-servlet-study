<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" type="text/css" href="../css/shopping.css">
  <script type="text/javascript" src="../script/board.js"></script>
</head>
<body>
  <div id="wrap" align="center">
    <h1>게시글 등록</h1>
    <form name="frm" method="post" action="BoardServlet">
      <input type="hidden" name="command" value="board_write">
      <table>
        <tr>
          <th>작성자</th>
          <td><input type="text" name="name">* 필수</td>
        </tr>

        <tr>
          <th>비밀번호</th>
          <td><input type="password" name="pass">* 필수</td>
        </tr>

        <tr>
          <th>제목</th>
          <td><input type="text" name="title">* 필수</td>
        </tr>

        <tr>
          <th>내용</th>
          <td><textarea name="content" rows="10" cols="50"></textarea>* 필수</td>
        </tr>
      </table>
      <br>
      <input type="submit" value="등록" onclick="return boardCheck()">
      <input type="reset" value="취소">
      <input type="button" value="글 목록" onclick="location.href='BoardServlet?command=board_list'">
    </form>
  </div>
</body>
</html>
