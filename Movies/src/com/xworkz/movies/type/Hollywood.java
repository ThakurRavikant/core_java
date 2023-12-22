package com.xworkz.movies.type;

import org.springframework.stereotype.Component;

import com.xworkz.movies.Movies;

@Component
public class Hollywood implements Movies {

	@Override
	public void produce() {
		System.out.println("Running produce method in Hollywood Class");
		
	}

	@Override
	public void promote() {
		System.out.println("Running promote method in Hollywood Class");
		
	}

	@Override
	public void released() {
		System.out.println("Running released method in Hollywood Class");
		
	}

	

}
