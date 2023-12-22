package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/product" , loadOnStartup = 1)
public class ProductServlet extends HttpServlet{
	public ProductServlet() {
		System.out.println("No-arg constructor");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in Productservlet...");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in ProductServlet....");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in ProductServlet....");
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		String quantity=req.getParameter("quantity");

		System.out.println("Name of Product is:"+name);
		System.out.println("Price of Product is: "+price);
		System.out.println("Type of Product is: "+type);
		System.out.println("Quantity of Product is: "+quantity);

		req.setAttribute("Key1", name);
		req.setAttribute("Key2", price);
		req.setAttribute("Key3", type);
		req.setAttribute("Key4", quantity);
		RequestDispatcher dispatcher=req.getRequestDispatcher("ProductSuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
