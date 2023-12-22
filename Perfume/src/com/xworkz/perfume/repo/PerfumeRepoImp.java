package com.xworkz.perfume.repo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;

@Component
public class PerfumeRepoImp implements PerfumeRepo {

	@Autowired
	Collection<PerfumeDTO> perfumes;

	@Override
	public boolean save(PerfumeDTO pdto) {
		if(perfumes!=null) {
			perfumes.add(pdto);
			System.out.println("Saved successfully");
			return true;
		}
		return false;
	}
	
	
	
	public Collection<PerfumeDTO> readAll(){
		return perfumes;
	}



	@Override
	public boolean updatePriceByUsingName(String brandName, int price) {
		for(PerfumeDTO dto: perfumes) {
			if(dto.getBrandName().equals(brandName)) {//brand name for particular dto 
				dto.setPrice(price);
				return true;
			}
			System.out.println("brand name not matching is moving to next index");
		}
		System.out.println("Brand name is not present  in dataBase");
		return false;
	}



	@Override
	public void removeByBrandName() {
		// TODO Auto-generated method stub
		
	}
	
}
