package com.xworkz.speaker.runner;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.jdbc.speaker.dto.SpeakerDTO;
import com.xworkz.jdbc.speaker.service.SpeakerService;
import com.xworkz.jdbc.speaker.service.SpeakerServiceImpl;

public class SpeakerRunner {
	public static void main(String[] args) {
		
	
	SpeakerDTO dto = new SpeakerDTO(3, "hammerX", 1100, "Better");
	SpeakerDTO dto1 = new SpeakerDTO(6, "yasudv.6", 1700, "Better");

	List<SpeakerDTO> speakerList = new LinkedList<SpeakerDTO>();
	speakerList.add(dto);
	speakerList.add(dto1);
	
		SpeakerService ser = new SpeakerServiceImpl();
		String ret = ser.saveAndValidate(speakerList);
		System.out.println(ret);
	}
//	SpeakerService service = new SpeakerServiceImpl();
//	listDto.saveAndValidate(SpeakerDTO);
//	service.saveAndValidate(dto1);
	
	
}
