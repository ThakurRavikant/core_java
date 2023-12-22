package com.xworkz.movies.type;

import org.springframework.stereotype.Component;

import com.xworkz.movies.Langague;
@Component
public class English implements Langague {

	@Override
	public void speak() {
		System.out.println("Running speak method in Marathi Calss");
		
	}

}
