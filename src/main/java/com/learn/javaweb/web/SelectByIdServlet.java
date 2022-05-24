package com.learn.javaweb.web;

import com.learn.javaweb.pojo.Brand;
import com.learn.javaweb.service.BrandService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
  private final BrandService service = new BrandService();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    String id = req.getParameter("id");

    Brand brand = service.selectById(Integer.parseInt(id));

    req.setAttribute("brand", brand);

    req.getRequestDispatcher("/update.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
   this.doGet(req, resp);
  }
}
