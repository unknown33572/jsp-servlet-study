package com.study.controller.action;

import com.study.dao.BoardDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardDeleteAction implements Action {
  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String num = req.getParameter("num");

    BoardDAO bDao = BoardDAO.getInstance();
    bDao.deleteBoard(num);

//    new BoardListAction().execute(req, resp);

    resp.sendRedirect("BoardServlet?command=board_list");
  }
}
