package com.study.controller;

import com.study.dao.UserDAO;
import com.study.dto.UserVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
  @Serial
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    RequestDispatcher dispatcher = req.getRequestDispatcher("/user/login.jsp");
    dispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    String url = "user/login.jsp";

    String uid = req.getParameter("uid");
    String upw = req.getParameter("upw");

    UserDAO uDao = UserDAO.getInstance(); // singleton pattern
    int result = uDao.userCheck(uid, upw); // 1: 일치, 0: 실패, -1: 불일치

    String url = "main.jsp";
    if(result == 1) {
      UserVO uVo = uDao.getUser(uid);
      HttpSession session = req.getSession();
      session.setAttribute("loginUser", uVo);
//      req.setAttribute("loginUser", uVo);
      System.out.println(uVo + " is logged in.");
    } else if(result == 0) {
      req.setAttribute("message", "비밀번호가 맞지 않습니다.");
    } else if(result == -1) {
      req.setAttribute("message", "존재하지 않는 회원입니다.");
    }
    RequestDispatcher dispatcher = req.getRequestDispatcher(url);
    dispatcher.forward(req, resp);
  }
}
