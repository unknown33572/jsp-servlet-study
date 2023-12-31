package com.study.controller;

import com.study.controller.action.Action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/boardServlet")
public class BoardServlet extends HttpServlet {
  @Serial
  private static final long serialVersionUID = 1L;

  public BoardServlet() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String command = req.getParameter("command");
    System.out.println("BoardServlet에서 요청을 받음을 확인 : " + command);
    ActionFactory af = ActionFactory.getInstance();
    Action action = af.getAction(command);

    if(action != null) {
      action.execute(req, resp);
    }
  }


  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    doGet(req, resp);
  }
}
