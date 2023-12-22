package com.xworkz.dto;

import com.xworkz.repo.ArmyRepository;

public class ArmyRepositoryImp implements ArmyRepository{
	private String[] names=new String[TOTAL_NUM];
	private int index=0;

	@Override
	public void save(String names) {
		System.out.println("Save method of Apartment Repository, Name saved:"+names);
		if(this.index<TOTAL_NUM) {
			System.out.println("Name saved at index:"+this.index);
			this.names[index]=names;
			index=index+1;
		}else {
			System.err.println("Dataset is full ...!");
		}

	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<TOTAL_NUM;i++) {
			System.out.println("Politician name at index "+i+" is :"+this.names[i]);
		}
	}

}


