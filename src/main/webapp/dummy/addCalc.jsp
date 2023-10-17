<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>ADD</title>
</head>
<body>
  <h1>ADD</h1>

  <%=
    request.getParameter("numX")
  %>
  +
  <%=
    request.getParameter("numY")
  %>
  =
  <%=
    request.getParameter("sum")
  %>

  ${numX} + ${numY} = ${sum} <%--왜 안되는건지...--%>
</body>
</html>
