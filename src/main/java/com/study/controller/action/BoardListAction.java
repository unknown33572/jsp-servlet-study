package com.study.controller.action;

import com.study.dao.BoardDAO;
import com.study.dto.BoardVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BoardListAction implements Action {

  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String url = "board/boardList.jsp";

    BoardDAO bDao = BoardDAO.getInstance();

    List<BoardVO> boardList = bDao.selectAllBoards();

    req.setAttribute("boardList", boardList);

    RequestDispatcher dispatcher = req.getRequestDispatcher(url);
    dispatcher.forward(req, resp);
  }
}
