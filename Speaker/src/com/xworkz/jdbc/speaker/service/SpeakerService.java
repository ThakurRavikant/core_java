package com.xworkz.jdbc.speaker.service;

import java.util.List;

import com.xworkz.jdbc.speaker.dto.SpeakerDTO;

public interface SpeakerService {
	
	public String saveAndValidate(SpeakerDTO dto);

	public String saveAndValidate(List<SpeakerDTO> speakerList);
	
	

}
