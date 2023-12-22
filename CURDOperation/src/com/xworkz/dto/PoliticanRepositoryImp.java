package com.xworkz.dto;

import com.xworkz.repo.PoliticanRepository;

public class PoliticanRepositoryImp implements PoliticanRepository {

	private String[] names=new String[TOTAL_NUM];
	public int index=0;




	@Override
	public void save(String names) {
		System.out.println("Save method of Politician Repository, Name saved:"+names);
		if(this.index<TOTAL_NUM) {
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
		for(int i=0;i<TOTAL_NUM;i++) {
			System.out.println("Politician name at index "+i+" is :"+this.names[i]);
		}
	}

}




