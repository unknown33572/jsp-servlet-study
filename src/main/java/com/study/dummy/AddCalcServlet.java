package com.study.dummy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddCalcServlet")
public class AddCalcServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int numX = 20;
    int numY = 10;
    int sum = numX + numY;

    req.setAttribute("numX", numX);
    req.setAttribute("numY", numY);
    req.setAttribute("sum", sum);

    RequestDispatcher dispatcher = req.getRequestDispatcher("/addCalc.jsp");
    dispatcher.forward(req, resp);
  }
}
