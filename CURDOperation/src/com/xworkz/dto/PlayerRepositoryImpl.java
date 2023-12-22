package com.xworkz.dto;

import com.xworkz.repo.PlayerRepository;

public class PlayerRepositoryImpl implements PlayerRepository {
	private PlayerDTO[] player=new PlayerDTO[PLAYER];
	private int index=0;


	@Override
	public  boolean save(PlayerDTO playerdto) {
		System.out.println("Invoking playerDTO "+playerdto);
		if(this.index>PLAYER) {
			this.player[index]=playerdto;
			System.out.println("Saving player in index:"+this.index);
			index++;
			System.out.println("Next index of player:"+this.index);
		}
		else {
			System.err.println("Data In valid");
		}
		return true;
	}
}
