package com.xworkz.movies.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.movies.Langague;
import com.xworkz.movies.Movies;
@Component
public class Bollywood implements Movies{
	@Autowired
	Langague lang;

	@Override
	public void produce() {
		System.out.println("Running produce method in Bollywood Class");
		
	}

	public void promote() {
		System.out.println("Running promote method in Bollywood Class");
		
	}

	@Override
	public void released() {
		System.out.println("Running released method in Bollywood Class");
		
	}

}
