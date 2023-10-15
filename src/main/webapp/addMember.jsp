<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/15/23
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
  Connection conn = null;
  PreparedStatement pstmt = null;

  String url = "jdbc:mysql://localhost:3306/test";
  String uId = "root";
  String uPwd = "mysql123";

  String sql = "insert into user (name, age, gender, address) values(?,?,?,?)";
%>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <%
    request.setCharacterEncoding("UTF-8");

    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String gender = request.getParameter("gender");
    String address = request.getParameter("address");

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, uId, uPwd);
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, name);
      pstmt.setString(2, age);
      pstmt.setString(3, gender);
      pstmt.setString(4, address);
      pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (conn != null) {
          conn.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        try {
          if (pstmt != null) {
            pstmt.close();
          }
          if (conn != null) {
            conn.close();
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  %>
  <h1>회원가입이 완료되었습니다.</h1>
  <a href="allMember.jsp">회원목록으로 이동</a> <br>
</body>
</html>
