package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repo.GroceryRepository;

public class GroceryServiceImpl implements GroceryService{
	private GroceryRepository repo;

	public GroceryServiceImpl(GroceryRepository repo) {
		this.repo = repo;
	}

	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<GroceryDTO> getAll() {
		return this.repo.getAll();
	}

	@Override
	public boolean vaildateAndSave(GroceryDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
	}

}
