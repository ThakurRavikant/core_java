package com.xworkz.perfume.service;

import java.util.Collection;

import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeService {

	public boolean validateAndSave(PerfumeDTO pdto);
	

	public Collection<PerfumeDTO> readAll();

	public boolean isExists(PerfumeDTO pdto);
	
	public boolean updatePriceByUsingName(String brandName,int price);
	
	public boolean removeDtoByUsingBrand();



}
