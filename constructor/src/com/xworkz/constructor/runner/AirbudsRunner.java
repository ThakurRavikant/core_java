package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Airbuds;

public class AirbudsRunner {
	public static void main(String args[]) {
		Airbuds boat=new Airbuds("realme","Amazon",1500,"24hours",true);
		if(boat!=null) {
			boat.display();
			System.out.println("The value of reference is not equal to null");
		}
	}

}
