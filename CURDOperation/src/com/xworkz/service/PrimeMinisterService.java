package com.xworkz.service;

import com.xworkz.dto.PrimeMinisterDTO;

public interface PrimeMinisterService {


	public boolean validateAndSave(PrimeMinisterDTO dto);
	
	PrimeMinisterDTO findByName(String name);

}
