package com.xworkz.football.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/message")
public class MessageServlet extends HttpServlet {
	public MessageServlet() {
		System.out.println("Calling message servlet...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet In message servlet...");
		String name = req.getParameter("name");
		String msg = req.getParameter("msg");
		System.out.println("Name:" + name);
		System.out.println("Message is:" + msg);
		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();
		pw.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "\r\n"
				+ "<title>Xworkz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "<ul class=\"nav justify-content-end\">\r\n"
				+ "  <!-- <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Active</a>\r\n"
				+ "  </li> -->\r\n"
				+ "  <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link\" href=\"index.html\">Home</a>\r\n"
				+ "  </li>\r\n"
				+ "  <!-- <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link\" href=\"#\">Link</a>\r\n"
				+ "  </li>\r\n"
				+ "  <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link disabled\" aria-disabled=\"true\">Disabled</a>\r\n"
				+ "  </li> -->\r\n"
				+ "</ul>\r\n"
				+ "</nav>\r\n"
				+ "	<form action=\"message\">");
		pw.print("<h1>");
		pw.print("Name: "+name);
		pw.print("</br> Message:"+msg);
		pw.print("</br>Saved successfully...!");
		pw.print("</h1>");
		
	}

}
