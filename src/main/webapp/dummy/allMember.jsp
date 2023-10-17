<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/15/23
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%!
  Connection conn = null;
  Statement stmt = null;
  ResultSet rs = null;

  String url = "jdbc:mysql://localhost:3306/test";
  String uId = "root";
  String uPwd = "mysql123";
  String sql = "select * from user";
%>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <table width="800" border="1">
    <tr>
      <th>이름</th><th>나이</th><th>성별</th><th>주소</th>
    </tr>
    <%
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, uId, uPwd);
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while(rs.next()) {
          out.println("<tr>");
          out.println("<td>" + rs.getString("name") + "</td>");
          out.println("<td>" + rs.getInt("age") + "</td>");
          out.println("<td>" + rs.getString("gender") + "</td>");
          out.println("<td>" + rs.getString("address") + "</td>");
          out.println("</tr>");
        }
      } catch(Exception e) {
        e.printStackTrace();
      } finally {
        try {
          if(rs != null) rs.close();
          if(stmt != null) stmt.close();
          if(conn != null) conn.close();
        } catch(Exception e) {
          e.printStackTrace();
        } finally {
          try {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
          } catch(Exception e) {
            e.printStackTrace();
          }
        }
      }
    %>
  </table>
</body>
</html>
