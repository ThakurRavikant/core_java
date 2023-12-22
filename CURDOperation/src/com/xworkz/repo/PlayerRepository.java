package com.xworkz.repo;

import com.xworkz.dto.PlayerDTO;

public interface PlayerRepository {
	int PLAYER=4;
	
	public boolean  save(PlayerDTO playerdto);

}
