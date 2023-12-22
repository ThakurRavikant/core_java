package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Diwali;
import com.xworkz.inheritance.things.Festival;

public class FestivalRunner extends Diwali  { 
	public static void main(String[] args) {
		//Dasara festival = new Dasara();
		//Festival dasara = new Dasara();
		//dasara.display();
		//Festival diwali = new Diwali();
		Festival festival = new Diwali();
		festival.display();
		FestivalRunner fr=new FestivalRunner();
		
	}
}
