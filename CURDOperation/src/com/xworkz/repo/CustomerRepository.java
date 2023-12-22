package com.xworkz.repo;

import com.xworkz.dto.CustomerDTO;

public interface CustomerRepository {
	
	int TOTAL_NUM=5;
	void save(CustomerDTO customer);

}
