package com.xworkz.enumeration.things;


public class ResortRunner {
	public static void main(String[] args) {
		Resort resort = new Resort();
		resort.display();

		Resort resort1 = new Resort("Reliance","3-days","10-05-2023",enumLocation.CHIKKAMANGLORE,enumTypeOfFood.NON_VEG);
		resort1.display();

		Resort resort2 = new Resort("Tata","5-days");
		resort2.display();
		
		Resort resort3 = new Resort();
		resort3.setLocation(enumLocation.GOA);
		resort3.display();
		
		Resort resort4 = new Resort();
		resort4.settypesOfFood(enumTypeOfFood.NORTH_INDIAN_FOODS);
		resort4.display();
	}
}
