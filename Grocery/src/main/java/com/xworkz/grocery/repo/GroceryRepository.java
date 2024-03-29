package com.xworkz.grocery.repo;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;

public interface GroceryRepository {
	void save(GroceryDTO dto);
	default int total() {
		return 0;
	}

	default Collection<GroceryDTO> getAll() {
		return null;
	}
}
