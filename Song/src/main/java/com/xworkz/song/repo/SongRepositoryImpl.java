package com.xworkz.song.repo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.song.dto.SongDTO;

@Repository
public class SongRepositoryImpl implements SongRepository{

	@Override
	public void save(SongDTO songDTO) {
	System.out.println("invoking save method in SongRepositoryImpl class..");
		
	}

}
