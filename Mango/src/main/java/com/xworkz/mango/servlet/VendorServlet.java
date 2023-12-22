package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/vendor" , loadOnStartup = 1)
public class VendorServlet extends HttpServlet{
	public VendorServlet() {
		System.out.println("No-arg constructor");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in Vendorservlet...");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in VendorServlet....");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in VendorServlet....");
		String name=req.getParameter("name");
		String gst=req.getParameter("gst");
		String owner=req.getParameter("owner");
		String location=req.getParameter("location");

		System.out.println("Name of  Vendor is:"+name);
		System.out.println("gst : "+gst);
		System.out.println("owner: "+owner);
		System.out.println("location : "+location);

		req.setAttribute("Key1", name);
		req.setAttribute("Key2", gst);
		req.setAttribute("Key3", owner);
		req.setAttribute("Key4", location);
		RequestDispatcher dispatcher=req.getRequestDispatcher("VendorSuccess.jsp");
		dispatcher.forward(req, resp);
	}
}



