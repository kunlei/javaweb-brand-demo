package com.learn.javaweb.web;

import com.learn.javaweb.pojo.Brand;
import com.learn.javaweb.service.BrandService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
  private final BrandService service = new BrandService();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    List<Brand> brands = service.selectAll();

   req.setAttribute("brands", brands);

   req.getRequestDispatcher("/brand.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
   this.doGet(req, resp);
  }
}
