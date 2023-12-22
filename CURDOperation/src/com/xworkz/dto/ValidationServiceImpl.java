package com.xworkz.dto;

import com.xworkz.repo.LabourRepository;
import com.xworkz.service.LabourService;
import com.xworkz.util.LabourUtil;

public class ValidationServiceImpl implements LabourService{

	@Override
	public boolean validationService(LabourDTO labour) {
		String name = labour.getName();
		String email = labour.getEmail();
		String address = labour.getAddress();
		double age = labour.getAge();
		
		
		if(LabourUtil.validateString(name)) {
			System.out.println("ValidationService labour name is:"+name);
		}else {
			System.err.println(name);
		}
		if(LabourUtil.validateString(email)) {
			System.out.println("ValidationService labour email is:"+email);
		}else {
			System.err.println(email);
		}
		if(LabourUtil.validateString(address)) {
			System.out.println("ValidationService labour address is:"+address);
		}else {
			System.err.println(address);
		}
		if(LabourUtil.validatenumbers(age)) {
			System.out.println("ValidationService labour age is:"+age);
		}else {
			System.err.println(age);
		}
		LabourRepository labour1 = new LabourRepositoryImpl();
		labour1.saveAndValid(labour);
		return true;
	}

}
