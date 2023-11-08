package com.study.controller.action;

import com.study.dao.BoardDAO;
import com.study.dto.BoardVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardUpdateAction implements Action {
  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    BoardVO bVo = new BoardVO();

    bVo.setNum(Integer.parseInt(req.getParameter("num")));
    bVo.setPass(req.getParameter("pass"));
    bVo.setName(req.getParameter("name"));
    bVo.setTitle(req.getParameter("title"));
    bVo.setContent(req.getParameter("content"));

    BoardDAO bDao = BoardDAO.getInstance();
    bDao.updateBoard(bVo);

    new BoardListAction().execute(req, resp);
  }
}
