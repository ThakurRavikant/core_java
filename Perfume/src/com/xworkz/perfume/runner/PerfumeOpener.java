package com.xworkz.perfume.runner;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.perfume.config.PerfumeConfig;
import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.service.PerfumeService;
import com.xworkz.perfume.service.PerfumeServiceImp;

public class PerfumeOpener {
	
	public static void main(String[] args) {
		PerfumeDTO dto1 = new PerfumeDTO("Gucci", 5600, "France", 50, "Evening");
		PerfumeDTO dto2 = new PerfumeDTO("Dior", 8500, "France", 100, "Spring");
		PerfumeDTO dto3 = new PerfumeDTO("Foog", 654, "America", 17, "Monsoon");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PerfumeConfig.class);
			
		PerfumeService serv = context.getBean(PerfumeServiceImp.class);
		serv.validateAndSave(dto1);
		serv.validateAndSave(dto2);
		serv.validateAndSave(dto3);
		
		
		System.out.println("Before updating");
		Collection<PerfumeDTO> list = serv.readAll();
		
		list.forEach(p -> System.out.println(p));
		serv.updatePriceByUsingName("Gucci", 9876);
		System.out.println("After updating");

		Collection<PerfumeDTO> data=serv.readAll();
		for(PerfumeDTO perfume : data) {
			System.out.println(perfume);
		}
		boolean result = serv.isExists(dto1);
		System.out.println(result);
	}
		
	}


