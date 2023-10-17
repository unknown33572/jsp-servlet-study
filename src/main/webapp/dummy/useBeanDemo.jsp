<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/11/23
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Java Bean Create</title>
</head>
<body>
  <jsp:useBean id="member" class="com.study.dummy.bean.MemberBean"/>

  이름: <%= member.getName() %><br/>
  나이: <%= member.getAge() %><br/>
  <hr/>
  <%
    member.setName("홍길동");
    member.setAge("20");
  %>
  이름: <%= member.getName() %><br/>
  나이: <%= member.getAge() %><br/>
</body>
</html>
