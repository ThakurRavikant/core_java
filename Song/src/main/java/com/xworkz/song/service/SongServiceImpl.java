package com.xworkz.song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.song.dto.SongDTO;
import com.xworkz.song.repo.SongRepository;

@Service
public class SongServiceImpl implements SongService{
	
	@Autowired
	private SongRepository repo;

	@Override
	public boolean saveAndValidation(SongDTO songDTO) {
	System.out.println("runing saveAndValidation in  SongServiceImpl class....");
	this.repo.save(songDTO);
		return true;
	}

}
