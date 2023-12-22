package com.xworkz.runner;

import com.xworkz.dto.TheaterDTO;
import com.xworkz.dto.TheaterRepositoryImp;
import com.xworkz.repo.TheaterRepository;

public class TheaterRunner {
	public static void main(String[] args) {
		TheaterDTO theater = new TheaterDTO("Galaxy","BTM","Reddy","AC&Non AC","Good");
		TheaterDTO theater1 = new TheaterDTO("Galaxy2","BTM-10th cross","Reddy","AC&Non AC","Good");
		
		TheaterRepository theater2 = new TheaterRepositoryImp();
		theater2.save(theater1);
		theater2.save(theater);
		
	}

}
