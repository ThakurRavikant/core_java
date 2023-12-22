package com.xworkz.runner;

import com.xworkz.dto.PlayerDTO;
import com.xworkz.dto.PlayerRepositoryImpl;
import com.xworkz.dto.PlayerServiceImpl;
import com.xworkz.repo.PlayerRepository;
import com.xworkz.service.PlayerService;

public class PlayerRunner {
	public static void main(String[] args) {	
		PlayerDTO playerdto = new PlayerDTO("Virat Kohli", "Cricket");
		PlayerRepository repository = new PlayerRepositoryImpl();
		
		
		PlayerService player = new PlayerServiceImpl(repository);
		boolean result = player.validateAndsave(playerdto);
		
		if(result) {
			System.out.println("Saved result is: "+result);
		}else {
			System.err.println(result);
		}
	}

}
