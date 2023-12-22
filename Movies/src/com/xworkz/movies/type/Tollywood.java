package com.xworkz.movies.type;

import com.xworkz.movies.Movies;

public class Tollywood implements Movies{

	@Override
	public void produce() {
		System.out.println("Running produce method in Tollywood Class");
		
	}

	@Override
	public void promote() {
		System.out.println("Running promote method in Tollywood Class");
		
	}

	@Override
	public void released() {
		System.out.println("Running released method in Tollywood Class");
		
	}

}
