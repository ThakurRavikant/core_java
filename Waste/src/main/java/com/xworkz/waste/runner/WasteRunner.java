package com.xworkz.waste.runner;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.dto.WasteRepositoryImpl;
import com.xworkz.waste.dto.WasteServiceImpl;
import com.xworkz.waste.repo.WasteRepository;
import com.xworkz.waste.service.WasteService;

public class WasteRunner {
	public static void main(String[] args) {
		WasteDTO waste=new WasteDTO("Plastic","solid",1.0);
		System.out.println(waste);
		WasteRepository rep=new WasteRepositoryImpl();

		WasteService waste1 = new WasteServiceImpl(rep);
		boolean result = waste1.validate(waste);

		if(result) {
			System.out.println("Saved result is: "+result);
		}else {
			System.err.println(result);
		}
	}
}


