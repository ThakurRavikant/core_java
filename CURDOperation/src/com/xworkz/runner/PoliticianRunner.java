package com.xworkz.runner;

import com.xworkz.dto.PoliticanRepositoryImp;
import com.xworkz.repo.PoliticanRepository;

public class PoliticianRunner {
	public static void main(String[] args) {
		PoliticanRepository repository = new PoliticanRepositoryImp();
		repository.save("DSK");
		repository.save("BSK");
		repository.save("BARI");
		repository.save("Hari");
		repository.save("Harilal");
		
		repository.display();
		
		
		
		
	}

	
	
}

