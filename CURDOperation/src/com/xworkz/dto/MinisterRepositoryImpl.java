package com.xworkz.dto;

import com.xworkz.repo.MinisterRepository;

public class MinisterRepositoryImpl implements MinisterRepository{
	

	@Override
	public boolean validateandsave(MinisterDTO ministerDTO) {
		System.out.println("invokking minister class ");
		if(ministerDTO!=null) {
			System.out.println("name is valid");
		}else {
			System.err.println("Name is invaild");
	
		}
		
		return false;
	}

}
