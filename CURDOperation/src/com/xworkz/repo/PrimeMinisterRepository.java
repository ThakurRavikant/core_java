package com.xworkz.repo;

import com.xworkz.dto.PrimeMinisterDTO;

public interface PrimeMinisterRepository {
	int NUMBER=5;
	
	public void save(PrimeMinisterDTO dto);
	
	PrimeMinisterDTO findByName(String name);

}
