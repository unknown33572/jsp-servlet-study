package com.study.dummy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html; charset=utf-8");

    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));

    PrintWriter out = resp.getWriter();
    out.print("<html><body>");
    out.print("입력한 정보는 다음과 같습니다.<br>");
    out.print("이름: ");
    out.print(name);
    out.print("<br>나이: ");
    out.print(age);
    out.print("<br><a href='javascript:history.go(-1)'>다시</a>"); // 뒤로가기
    out.print("</body></html>");
    out.close();
  }
}
