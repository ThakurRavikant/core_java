package com.xworkz.repo;

import com.xworkz.dto.TheaterDTO;

public interface TheaterRepository {
	int TOTAL_NUM=5;
	void save(TheaterDTO theater);

}
