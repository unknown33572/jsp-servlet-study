<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <script type="text/javascript" src="../../meddleware/paramCheck.js"></script>
</head>
<body>
  <form name="frm" method="get" action="ParamServlet" onsubmit="return check()">
    이름: <input type="text" name="name"><br>
    나이: <input type="text" name="age"><br>
    <input type="submit" value="submit">
  </form>
</body>
</html>
