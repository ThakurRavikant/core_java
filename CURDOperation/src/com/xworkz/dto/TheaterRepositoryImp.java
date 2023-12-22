package com.xworkz.dto;

import com.xworkz.repo.TheaterRepository;

public class TheaterRepositoryImp implements TheaterRepository {
	private TheaterDTO[] theater =new TheaterDTO[TOTAL_NUM];
	private int index=0;
	@Override
	public void save(TheaterDTO theater) {
		System.out.println("Save method of Theater Repository, Name saved:"+theater);
		if(this.index<TOTAL_NUM) {
			this.theater[index]=theater;
			System.out.println("Save method of Theater Repository, Name saved:"+this.index);
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full...");
		}
	}

}


