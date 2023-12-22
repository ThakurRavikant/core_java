package com.xworkz.dto;

import com.xworkz.service.PrimeMinisterService;
import com.xworkz.util.PrimeMinisterUtil;

public class PrimeMinisterServiceImpl implements PrimeMinisterService{


	@Override
	public boolean validateAndSave(PrimeMinisterDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String country = dto.getCountry();
		
		String partyName = dto.getPartyName();

		if(PrimeMinisterUtil.validatenumbers(id)) {
			System.out.println("ValidationService PrimeMinister id is: "+id);

		}else {
			System.err.println(id);
		}
		if(PrimeMinisterUtil.validate(name)) {
			System.out.println("ValidationService PrimeMinister name is: "+name);

		}else {
			System.err.println(name);
		}
		if(PrimeMinisterUtil.validate(country)) {
			 System.out.println("ValidationService PrimeMinister Country is: "+country);
			 
		 }else {
			 System.err.println(country);
		 }
		if(PrimeMinisterUtil.validate(partyName)) {
			 System.out.println("ValidationService PrimeMinister Country is: "+partyName);
			 
		 }else {
			 System.err.println(partyName);
		 }

		return true;
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
