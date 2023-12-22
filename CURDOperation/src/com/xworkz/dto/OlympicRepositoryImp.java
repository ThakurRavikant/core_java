package com.xworkz.dto;

import com.xworkz.repo.OlympicRepository;

public class OlympicRepositoryImp implements OlympicRepository{
	private String[] years=new String[YEAR];
	private int index=0;

	@Override
	public void save(String years) {
		System.out.println("Save method of Olympic Repository, Name saved:"+years);

		if(this.index<YEAR) {
			System.out.println("Year saved at index:"+this.index);
			this.years[index] = years;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");

		}

	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<YEAR;i++) {
			System.out.println("Olypmic year at index "+i+" is :"+this.years[i]);
		}
	}

}


