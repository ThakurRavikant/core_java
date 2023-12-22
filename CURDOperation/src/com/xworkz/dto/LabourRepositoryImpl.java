package com.xworkz.dto;

import com.xworkz.repo.LabourRepository;

public class LabourRepositoryImpl implements LabourRepository {
	private LabourDTO[] labour = new LabourDTO[NUMBER];
	private int index=0;
	

	@Override
	public boolean saveAndValid(LabourDTO labour) {
		System.out.println("Save and Vaild method of labour Repository, Name saved:"+labour);
		if(index<NUMBER) {
			this.labour[index]=labour;
			System.out.println("Name of labour save, name saved:"+this.index);
			index++;
			System.out.println("Next index is:"+index);
			
		}else {
			System.err.println("Data set is full...");
		}
		return true;
	}

}
