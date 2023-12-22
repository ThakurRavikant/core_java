package com.xworkz.runner;

import com.xworkz.dto.OlympicRepositoryImp;
import com.xworkz.repo.OlympicRepository;

public class OlympicRunner {
	public static void main(String[] args) {
		OlympicRepository olym = new OlympicRepositoryImp();
		olym.save("2010");
		olym.save("2009");
		olym.save("2008");
		olym.save("2007");
		olym.save("2006");
		
		olym.display();
	}

	
}
