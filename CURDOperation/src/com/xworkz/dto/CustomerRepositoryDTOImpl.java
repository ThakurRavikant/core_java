package com.xworkz.dto;

import com.xworkz.repo.CustomerRepository;

public class CustomerRepositoryDTOImpl implements CustomerRepository {
	private	CustomerDTO[] customer=new CustomerDTO[TOTAL_NUM];
	private int index=0;
	@Override
	public void save(CustomerDTO customer) {
		System.out.println("Save method of Customer Repository, Name saved:"+customer);
		if(this.index<TOTAL_NUM) {
			this.customer[index]=customer;
			System.out.println("Save method of Customer Repository, Name saved:"+this.index);
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full...");
		}

	}

}
