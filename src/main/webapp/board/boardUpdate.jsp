<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" type="text/css" href="../css/shopping.css">
  <script type="text/javascript" src="../script/board.js"></script>
</head>
<body>
  <div id="wrap" align="center">
    <h1>게시글수정</h1>
    <form name="frm" method="post" action="BoardServlet">
      <input type="hidden" name="command" value="board_update">
      <input type="hidden" name="pass" value="${board.pass}">
      <input type="text" name="num" value="${board.num}" readonly>
      <input type="text" name="name" value="${board.name}" readonly>
      <table>
        <tr>
          <th>제목</th>
          <td><input type="text" name="title" value="${board.title}"></td>
        </tr>
        <tr>
          <th>내용</th>
          <td><textarea cols="70" rows="15" name="content">${board.content}</textarea></td>
        </tr>
      </table>
      <br>
      <input type="submit" value="수정등록">
      <input type="reset" value="다시작성">
      <input type="button" value="목록보기" onclick="location.href='BoardServlet?command=board_list'">
    </form>
  </div>
</body>
</html>
