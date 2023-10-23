package com.study.controller;

import com.study.dao.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/IdCheck.do")
public class IdCheckServlet extends HttpServlet {
  @Serial
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String userid = req.getParameter("userid");

    UserDAO uDao = UserDAO.getInstance(); // 싱글톤 패턴

    int result = uDao.comfirmID(userid);

//    System.out.println("result: " + result);

    req.setAttribute("userid", userid);
    req.setAttribute("result", result);

    RequestDispatcher dispatcher = req.getRequestDispatcher("/user/idcheck.jsp");
    dispatcher.forward(req, resp);
  }
}
