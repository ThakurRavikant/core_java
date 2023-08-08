package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Shirt;

public class ShirtRunner {
	public static void main(String args[]) {
		Shirt abcMall=new Shirt("Black", "Jocky", 500, "SquareBracket", 7, 1000, 'A', "Online", "Good", 75);
		if(abcMall!=null) {
			abcMall.display(); // calling constructor
		}
}
}