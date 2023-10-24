package com.study.controller;

import com.study.dao.UserDAO;
import com.study.dto.UserVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/userUpdate.do")
public class UserUpdateServlet extends HttpServlet {
  @Serial
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String uid = req.getParameter("uid");
    UserDAO uDao = UserDAO.getInstance();

    UserVO uVo = uDao.getUser(uid);
    req.setAttribute("uVo", uVo);

    RequestDispatcher dispatcher = req.getRequestDispatcher("/user/userUpdate.jsp");
    dispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");

    String email = req.getParameter("email");
    String phone = req.getParameter("phone");
    String uid = req.getParameter("uid");

    UserVO uVo = new UserVO();
    uVo.setEmail(email);
    uVo.setPhone(phone);
    uVo.setUid(uid);

    UserDAO uDao = UserDAO.getInstance();

    uDao.updateUser(uVo);

    resp.sendRedirect("login.do");
  }
}
