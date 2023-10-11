<%--
  Created by IntelliJ IDEA.
  User: s
  Date: 10/10/23
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP 간단 사용방법</title>
</head>
<body>
  <%! // 선언부
    String hi = "안녕하세요.";
    String name= "홍길동";
    int x = 10;
    int y = 20;

    public int add(int x, int y){
      return x + y;
    }
  %>
  <% // 실행부
    out.print(hi + "<br>" + name + "입니다.<br>");
    out.print("x : " + x + "<br>");
    out.print("y : " + y + "<br>");
    out.print("x + y = " + add(x, y) + "<br>");
  %>
</body>
</html>
