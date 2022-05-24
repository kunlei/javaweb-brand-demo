package com.learn.javaweb.web;

import com.learn.javaweb.pojo.Brand;
import com.learn.javaweb.service.BrandService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
  private BrandService service = new BrandService();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    String brandName = req.getParameter("brandName");
    String companyName = req.getParameter("companyName");
    String ordered = req.getParameter("ordered");
    String description = req.getParameter("description");
    String status = req.getParameter("status");

    Brand brand = new Brand();
    brand.setBrandName(brandName);
    brand.setCompanyName(companyName);
    brand.setOrdered(Integer.parseInt(ordered));
    brand.setDescription(description);
    brand.setStatus(Integer.parseInt(status));

    service.add(brand);

    req.getRequestDispatcher("/selectAllServlet").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    this.doGet(req, resp);
  }
}

