package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player" , loadOnStartup = 1)
public class PlayerServlet extends HttpServlet {
	public PlayerServlet() {
		System.out.println("No-arg const");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init in Playerservlet...");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in PlayerServlet....");
		super.service(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in PlayerServlet....");
		String name=req.getParameter("name");
		String sport=req.getParameter("sport");
		String country=req.getParameter("country");
		String married=req.getParameter("married");
		String wife=req.getParameter("wife");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String father=req.getParameter("father");
		String jersey=req.getParameter("jersey");
		String captain=req.getParameter("captain");
		String coach=req.getParameter("coach");
		String age=req.getParameter("age");
		String mother=req.getParameter("mother");
		String alive=req.getParameter("alive");

		System.out.println("Name of Product is:"+name);
		System.out.println("sport: "+sport);
		System.out.println("country: "+country);
		System.out.println("married: "+married);
		System.out.println("wife: "+wife);
		System.out.println("gender: "+gender);
		System.out.println("dob: "+dob);
		System.out.println("father: "+father);
		System.out.println("jersey: "+jersey);
		System.out.println("captain: "+captain);
		System.out.println("coach: "+coach);
		System.out.println("age: "+age);
		System.out.println("mother: "+mother);
		System.out.println("alive: "+alive);
		
		req.setAttribute("Key1", name);
		req.setAttribute("Key2", sport);
		req.setAttribute("Key3", country);
		req.setAttribute("Key4", married);
		req.setAttribute("Key5", wife);
		req.setAttribute("Key6", gender);
		req.setAttribute("Key7", dob);
		req.setAttribute("Key8", father);
		req.setAttribute("Key9", jersey);
		req.setAttribute("Key10", captain);
		req.setAttribute("Key11", coach);
		req.setAttribute("Key12", age);
		req.setAttribute("Key13", mother);
		req.setAttribute("Key14", alive);
		RequestDispatcher dispatcher=req.getRequestDispatcher("PlayerSuccess.jsp");
		dispatcher.forward(req, resp);
	}
}



