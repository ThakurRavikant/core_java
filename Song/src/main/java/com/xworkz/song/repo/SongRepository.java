package com.xworkz.song.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.song.dto.SongDTO;

@Repository
public interface SongRepository {
	void save(SongDTO songDTO);

}
