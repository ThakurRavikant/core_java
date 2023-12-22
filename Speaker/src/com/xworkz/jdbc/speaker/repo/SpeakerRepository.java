package com.xworkz.jdbc.speaker.repo;

import java.util.List;

import com.xworkz.jdbc.speaker.dto.SpeakerDTO;

public interface SpeakerRepository {
	
	public boolean save(SpeakerDTO dto);

	public boolean save(List<SpeakerDTO> speakerList);
	

}
