package com.xworkz.dto;

import com.xworkz.repo.MetroStaffRepository;

public class MetroStaffRepositoryImp implements MetroStaffRepository {
	private MetroStaffDTO[] metrostaff=new MetroStaffDTO[TOTAL_NUM];
	private int index=0;
	@Override
	public void save(MetroStaffDTO metrostaff) {
		System.out.println("Save method of Customer Repository, Name saved:"+metrostaff);
		if(this.index<TOTAL_NUM) {
			this.metrostaff[index]=metrostaff;
			System.out.println("Save method of Customer Repository, Name saved:"+this.index);
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full...");
		}

	}
}


