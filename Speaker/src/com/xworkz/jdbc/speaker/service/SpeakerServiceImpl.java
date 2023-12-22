package com.xworkz.jdbc.speaker.service;

import java.util.List;

import com.xworkz.jdbc.speaker.dto.SpeakerDTO;
import com.xworkz.jdbc.speaker.repo.SpeakerRepository;
import com.xworkz.jdbc.speaker.repo.SpeakerRepositoryImpl;

public class SpeakerServiceImpl implements SpeakerService{


	@Override
	public String saveAndValidate(SpeakerDTO dto) {
		if(dto!=null) {
			if(dto.getBrandName()!=null && dto.getPrice()>0 ) {
				SpeakerRepository repo = new SpeakerRepositoryImpl();
				boolean saved = repo.save(dto);
				if(saved) {
					return "Movie is saved";

				}
			}
		}
		return "Movie is not saved";


	}

	@Override
	public String saveAndValidate(List<SpeakerDTO> speakerList) {
		if(speakerList!=null) {

			SpeakerRepository repo = new SpeakerRepositoryImpl();
			boolean saved = repo.save(speakerList);
			if(saved) {
				return "Speaker is saved";
				
			}
		}

		return "Speaker is not saved";
	}


}
