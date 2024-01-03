package com.xworkz.song.service;

import org.springframework.stereotype.Service;

import com.xworkz.song.dto.SongDTO;

@Service
public interface SongService {
 boolean saveAndValidation(SongDTO songDTO);
}
