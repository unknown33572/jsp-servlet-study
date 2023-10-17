<%@page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calendar</title>
</head>
<body>
  <%
    Calendar date = Calendar.getInstance();
    SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
    SimpleDateFormat time = new SimpleDateFormat("hh시 mm분 ss초");
  %>
  <h1>오늘 날짜는 <%= today.format(date.getTime()) %></h1>
  <h1>현재 시간은 <%= time.format(date.getTime()) %></h1>
</body>
</html>
