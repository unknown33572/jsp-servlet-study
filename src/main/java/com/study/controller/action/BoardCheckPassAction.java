package com.study.controller.action;

import com.study.dao.BoardDAO;
import com.study.dto.BoardVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardCheckPassAction implements Action {

  @Override
  public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String url = null;

    String num = req.getParameter("num");
    String pass = req.getParameter("pass");

    BoardDAO bDao = BoardDAO.getInstance();
    BoardVO bVo = bDao.selectOneBoardByNum(num); // 게시글 번호로 게시글 정보를 가져옴

    if(bVo.getPass().equals(pass)) {
      url = "board/checkSuccess.jsp";
    } else {
      url = "board/boardCheckPass.jsp";
      req.setAttribute("message", "비밀번호가 틀렸습니다.");
    }

    RequestDispatcher dispatcher = req.getRequestDispatcher(url);
    dispatcher.forward(req, resp);
  }
}
