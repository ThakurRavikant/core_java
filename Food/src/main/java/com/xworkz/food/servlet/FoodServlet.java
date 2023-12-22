package com.xworkz.food.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/food" , loadOnStartup = 1)
public class FoodServlet extends HttpServlet{
	public FoodServlet() {
		System.out.println("No-arg constructor");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in Foodservlet...");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in FoodServlet....");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in FoodServlet....");
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String hotelName=req.getParameter("hotelName");
		String price=req.getParameter("price");
		String quantity=req.getParameter("quantity");

		System.out.println("Name is:"+name);
		System.out.println("Type of Food is: "+type);
		System.out.println("HotelName is: "+hotelName);
		System.out.println("Price of Food is: "+price);
		System.out.println("Quantity of Food is: "+quantity);

		req.setAttribute("Key1", name);
		req.setAttribute("Key2", type);
		req.setAttribute("Key3", hotelName);
		req.setAttribute("Key4", price);
		
		req.setAttribute("Key4", quantity);
		RequestDispatcher dispatcher=req.getRequestDispatcher("FoodSuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
