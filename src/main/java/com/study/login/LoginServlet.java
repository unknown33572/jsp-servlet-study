package com.study.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html; charset=utf-8");

    String id = req.getParameter("id");
    String pw = req.getParameter("pw");

    PrintWriter out = resp.getWriter();
    out.print("<html><body>");
    out.print("입력한 정보는 다음과 같습니다.<br>");
    out.print("아이디: ");
    out.print(id);
    out.print("<br>비밀번호: ");
    out.print(pw);

    out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
    out.print("</body></html>");
  }
}
