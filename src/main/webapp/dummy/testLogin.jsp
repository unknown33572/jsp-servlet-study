<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/10/23
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Test-Login</title>
</head>
<body>
  <% // 로그인 처리
    String id = "s";
    String pw = "1234";
    String name = "홍길동";
    request.setCharacterEncoding("UTF-8");
    if(id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pw"))){
      response.sendRedirect("testMain.jsp?name="+ URLEncoder.encode(name,"UTF-8"));
    } else {
      response.sendRedirect("testLoginForm.jsp");
    }
  %>
</body>
</html>
