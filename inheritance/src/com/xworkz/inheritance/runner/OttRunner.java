package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Ott;

public class OttRunner {
public static void main(String[] args) {
	Ott ott = new Ott();
	String ott1=ott.toString();
	System.out.println(ott1);
	
	Ott ott2 = new Ott(8.5,"1.8Million");
	String ott3=ott2.toString();
	System.out.println(ott3);
	
	Ott ott4 = new Ott(8.5,"1.8Million");
	boolean ott5=ott4.equals(ott2);
	System.out.println(ott5);
	
	Ott ott6 = new Ott(7.5,"1.8Million");
	boolean ott7=ott6.equals(ott4);
	System.out.println(ott7);
	
	Ott ott8 = new Ott(8.5,"1.8Million");
	boolean ott9=ott8.equals(ott4);
	System.out.println(ott9);
}
}
