package com.xworkz.repo;

import com.xworkz.dto.MetroStaffDTO;

public interface MetroStaffRepository {
	int TOTAL_NUM=5;
	
	void save(MetroStaffDTO metrostaff);

}
