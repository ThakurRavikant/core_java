package com.xworkz.waste.repo;

import com.xworkz.waste.dto.WasteDTO;

public interface WasteRepository  {
	int MAX_COUNT=5;
	
	public void save(WasteDTO dto);

}
