package com.xworkz.perfume.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repo.PerfumeRepo;

@Component
public class PerfumeServiceImp implements PerfumeService{

	@Autowired
	PerfumeRepo repo;

	@Override
	public boolean validateAndSave(PerfumeDTO pdto) {
		if(pdto!=null) {
			if(pdto.getBrandName()!=null && pdto.getBrandName().length()>3) {
				if(pdto.getPrice()>500) {
					if(pdto.getPerfumeNote()!=null) {
						System.out.println("Data is validated...");
						repo.save(pdto);
						return true;
					}
				}
			}
		}
		return false;
	}

	public Collection<PerfumeDTO> readAll(){
		Collection<PerfumeDTO> perfumes = repo.readAll();
		return perfumes;
	}



	@Override
	public boolean isExists(PerfumeDTO pdto) {
		Collection<PerfumeDTO> list = repo.readAll();
		for (PerfumeDTO perfumeDto : list) {
			if (perfumeDto.getBrandName().equals(pdto.getBrandName())) {
				if (perfumeDto.getPerfumeNote().equals(pdto.getPerfumeNote())) {
					System.out.println("perfume exists");
					return true;
				}
			}
		}
		System.out.println("perfume exists");
		return false;
		
	}

	@Override
	public boolean updatePriceByUsingName(String brandName, int price) {
		if (brandName != null & price > 500) {
			boolean result = repo.updatePriceByUsingName(brandName, price);
			return result;
		}
		return false;
	}

	@Override
	public boolean removeDtoByUsingBrand() {
		// TODO Auto-generated method stub
		return false;
	}

	
	}


