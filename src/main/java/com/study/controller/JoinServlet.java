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

@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
  @Serial
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    RequestDispatcher dispatcher = req.getRequestDispatcher("/user/join.jsp");
    dispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");

    String userid = req.getParameter("userid");
    String pwd = req.getParameter("upw");
    String name = req.getParameter("uname");
    String email = req.getParameter("email");
    String phone = req.getParameter("phone");
    String gender = req.getParameter("gender");

    UserVO uVo = new UserVO();
    uVo.setUid(userid);
    uVo.setUpw(pwd);
    uVo.setUname(name);
    uVo.setEmail(email);
    uVo.setPhone(phone);
    uVo.setGender(gender);

    UserDAO uDao = UserDAO.getInstance();
    int result = uDao.insertUser(uVo);

    HttpSession session = req.getSession();

    if(result == 1) {
      session.setAttribute("loginUser", uVo);
      req.setAttribute("message", "회원가입에 성공했습니다.");
    } else {
      req.setAttribute("message", "회원가입에 실패했습니다.");
    }

    RequestDispatcher dispatcher = req.getRequestDispatcher("/user/login.jsp");
    dispatcher.forward(req, resp);
  }
}
