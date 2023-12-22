package com.xworkz.repo;

import com.xworkz.dto.LabourDTO;

public interface LabourRepository {
	int NUMBER=5;
	public boolean saveAndValid(LabourDTO labour);

}
