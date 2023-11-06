<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" type="text/css" href="../css/shopping.css">
  <script type="text/javascript" src="../script/board.js"></script>
</head>
<body>
  <div id="wrap" align="center">
    <h1>게시글 상세</h1>
    <table>
      <tr>
        <th>제목</th> <td>${board.title}</td>
        <td>작성자</td> <td>${board.name}</td>
      </tr>
      <tr>
        <th>내용</th> <td colspan="3">${board.content}</td>
      </tr>
      <tr>
        <th>조회수</th> <td>${board.viewcount}</td>
      </tr>
    </table>
    <br>
    <input type="button" value="목록" onclick="location.href='BoardServlet?command=board_list'">
  </div>
</body>
</html>
