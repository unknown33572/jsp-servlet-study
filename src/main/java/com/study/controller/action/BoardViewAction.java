package com.study.controller.action;

import com.study.dao.BoardDAO;
import com.study.dto.BoardVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardViewAction implements Action {
  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String url = "board/boardView.jsp";

    String num = req.getParameter("num");

    BoardDAO bDao = BoardDAO.getInstance();

    bDao.updateViewCount(num);

    BoardVO bVo = bDao.selectOneBoardByNum(num);

    req.setAttribute("board", bVo);

    RequestDispatcher dispatcher = req.getRequestDispatcher(url);
    dispatcher.forward(req, resp);
  }
}
