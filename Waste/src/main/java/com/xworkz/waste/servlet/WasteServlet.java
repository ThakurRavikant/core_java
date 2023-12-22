package com.xworkz.waste.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.dto.WasteRepositoryImpl;
import com.xworkz.waste.dto.WasteServiceImpl;
import com.xworkz.waste.repo.WasteRepository;
import com.xworkz.waste.service.WasteService;

@WebServlet(urlPatterns = "/save", loadOnStartup = 1)
public class WasteServlet {
	public WasteServlet() {
		System.out.println("Created WasteServlet..");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String weight = req.getParameter("weight");
		
		double convertedWeight = Double.parseDouble(weight);
		
		WasteDTO dto = new WasteDTO(name, type, convertedWeight);

		WasteRepository repository = new WasteRepositoryImpl();
		
		WasteService service = new WasteServiceImpl(repository);
		
		boolean saved = service.validate(dto);
		if (saved) {
			System.out.println("Waste is Saved");
			req.setAttribute("dto", dto);
			req.setAttribute("msg","Waste is Saved");
		} else {
			System.out.println("Waste is not saved...");
			req.setAttribute("msg","Waste is not Saved");
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher("WasteSuccess.jsp");
		dispatcher.forward(req, resp);// ?? Servlet Chain

	}

}
