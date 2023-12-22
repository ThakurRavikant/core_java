package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Joker;

public class JokerRunner {
public static void main(String[] args) {
	Joker joker = new Joker();
	String result=joker.toString();
	
	Joker joker1 = new Joker("Roony","Sunny","Tonny",5000000,"06-09-2020",8.6,"Good",true);
	String result1=joker1.toString();
	System.out.println(result1);
	
	
	Joker joker3 = new Joker("Roony","Sunny","Tonny",8000000,"06-09-2020",8.6,"Good",true);
	String result2=joker3.toString();
	System.out.println(result2);
	

	Joker joker4 = new Joker("Roony","Sunny","Tonny",8000000,"06-09-2020",8.6,"Good",true);
	boolean result3=joker4.equals(joker3);
	System.out.println(result2);
	
	Joker joker5 = new Joker("Roony","Sunny","Tonny",5000000,"06-09-2020",8.6,"Good",true);
	boolean result4=joker5.equals(joker1);
	System.out.println(result4);
}

}
