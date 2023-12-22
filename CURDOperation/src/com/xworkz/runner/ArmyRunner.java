package com.xworkz.runner;

import com.xworkz.dto.ArmyRepositoryImp;
import com.xworkz.repo.ArmyRepository;

public class ArmyRunner {
	public static void main(String[] args) {
		ArmyRepository army = new ArmyRepositoryImp();
		army.save("COBRA");
		army.save("NEVY");
		army.save("AIR_FORCE");
		army.save("CRF");
		army.save("CID");
		
		army.display();
		
	}

}
