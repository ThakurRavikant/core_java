package com.xworkz.runner;

import com.xworkz.dto.LabourDTO;
import com.xworkz.dto.LabourRepositoryImpl;
import com.xworkz.dto.ValidationServiceImpl;
import com.xworkz.service.LabourService;

public class LabourRunner {
	public static void main(String[] args) {
		LabourDTO dto = new LabourDTO("Ravi","ravi@123gmail.com","Nepal",23);
		LabourDTO dto1 = new LabourDTO("Mohan","mohan@123gmail.com","Banglore",23);
		
		
		LabourService ser = new ValidationServiceImpl();
		boolean result = ser.validationService(dto);
		
	
	if(result) {
		System.out.println("save result is:"+result);
	}else {
		System.out.println(result);
	}
	}
}
