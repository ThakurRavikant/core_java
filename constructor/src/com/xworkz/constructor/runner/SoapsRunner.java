package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Soaps;

public class SoapsRunner {
public static void main(String args[]) {
	Soaps abcMall=new Soaps("Lux",100, 2.5f,"Rectanglur",10000);
	if(abcMall !=null) {
		abcMall.display1();
		System.out.println("the value is :");
	}else {
		System.out.println("the value are equal");
	}
}
}