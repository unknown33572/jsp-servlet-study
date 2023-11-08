package com.study.controller.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardCheckPassFormAction  implements Action {
  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String url = "board/boardCheckPass.jsp";

    req.getRequestDispatcher(url).forward(req, resp);
  }
}
