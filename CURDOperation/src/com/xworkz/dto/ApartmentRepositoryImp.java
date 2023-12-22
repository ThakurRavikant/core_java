package com.xworkz.dto;

import com.xworkz.repo.ApartmentRepository;

public class ApartmentRepositoryImp implements ApartmentRepository {
	private String[] names=new String[TOTAL_APART];
	private int index=0;

	@Override
	
	public void save(String names) {
		System.out.println("Save method of Apartment Repository, Name saved:"+names);
		if(this.index<TOTAL_APART) {
			System.out.println("Name saved at index:"+this.index);
			this.names[index] = names;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}

	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<TOTAL_APART;i++) {
			System.out.println("Politician name at index "+i+" is :"+this.names[i]);
		}
	}
}


