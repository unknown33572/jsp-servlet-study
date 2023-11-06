package com.study.controller.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardWriteFormAction implements Action {

  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String url = "board/boardWrite.jsp";

    RequestDispatcher dispatcher = req.getRequestDispatcher(url);
    dispatcher.forward(req, resp);
  }
}
