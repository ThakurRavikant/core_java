package com.xworkz.inheritance.things;

public class CountryRunner {
	public static void main(String[] args) {
		
		Karnataka bgV1=new Bangalore();
		TamilNadu bgV2=new Chennai();
		Kerala bgV3=new Thiruvanathapuram();
		Madhesh bgV4=new Parsa();
		
		System.out.println(".................");
		
		India bgV5=new Karnataka();
		India bgV6=new TamilNadu();
		India bgV7=new Kerala();
		Nepal bgV8=new Madhesh();
		
		System.out.println(".................");
		
		Country bgV9=new India();
		Country bgV10=new Nepal();
		Object bgV11=new Country();
		
		System.out.println(".................");
		
		Country bgV12=new Bangalore();
		Country bgV13=new Chennai();
		Country bg14=new Thiruvanathapuram();
		Country bg27=new Madhesh();
		
		System.out.println(".................");
		Country bgV15=new Karnataka();
		Country bgV16=new TamilNadu();
		Country bgV17=new Kerala();
		Country bgV18=new Madhesh();
		
		System.out.println(".................");
		
		Object bgV19=new Karnataka();
		Object bgV20=new TamilNadu();
		Object bgV21=new Kerala();
		Object bgV22=new Madhesh();
		
		System.out.println(".................");
		
		Object bgV23=new Bangalore();
		Object bgV24=new Chennai();
		Object bg25=new Thiruvanathapuram();
		
		System.out.println(".................");
		Object bgV26=new India();
		Object bgV28=new Nepal();
		
		
		
	}
}
