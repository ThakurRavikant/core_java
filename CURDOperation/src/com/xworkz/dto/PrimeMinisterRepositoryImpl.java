package com.xworkz.dto;

import com.xworkz.repo.PrimeMinisterRepository;

public class PrimeMinisterRepositoryImpl implements PrimeMinisterRepository {
	
	private PrimeMinisterDTO[] pm = new PrimeMinisterDTO[NUMBER];
	private int index = 0;
	

	@Override
	public void save(PrimeMinisterDTO dto) {
		System.out.println("Save method of PrimeMinister Repository, name save:"+dto);
		if(index>NUMBER) {
		this.pm[index]=dto;
		System.out.println("Save name of PrimeMinister:"+this.index);
		index++;
		System.out.println("Next index is:"+this.index);
		}
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
