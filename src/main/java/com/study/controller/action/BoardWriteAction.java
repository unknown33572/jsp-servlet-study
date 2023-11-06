package com.study.controller.action;

import com.study.dao.BoardDAO;
import com.study.dto.BoardVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardWriteAction implements Action {

  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    BoardVO bVo = new BoardVO();

    bVo.setName(req.getParameter("name"));
    bVo.setPass(req.getParameter("pass"));
    bVo.setTitle(req.getParameter("title"));
    bVo.setContent(req.getParameter("content"));

    BoardDAO bDao = BoardDAO.getInstance();
    bDao.insertBoard(bVo);

    System.out.println("BoardWriteAction.java에서 insertBoard() 메소드 실행 완료");

    resp.sendRedirect("BoardServlet?command=board_list");
  }
}
