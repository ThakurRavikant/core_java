package com.xworkz.runner;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.dto.CustomerRepositoryDTOImpl;
import com.xworkz.repo.CustomerRepository;

public class CustomerRunner {
	public static void main(String[] args) {
		CustomerDTO crdo = new CustomerDTO("Ravikant Thakur","ravikant.xworkz@gmail.com","Nepal",false);
		CustomerDTO crdo1 = new CustomerDTO("Ravikant","ravikant.xworkz@gmail.com","Nepal",false);
		System.out.println(crdo.toString());
		
		CustomerRepository crdo2 = new CustomerRepositoryDTOImpl();
		crdo2.save(crdo1);
		crdo2.save(crdo);
	}
	

}
