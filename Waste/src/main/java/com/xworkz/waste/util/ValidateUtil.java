package com.xworkz.waste.util;

public class ValidateUtil {
	public static boolean validateString(String string) {
		if(string != null && !string.isEmpty() && string.length()>4 && string.length()<30) {
			return true;
		}else {
			System.err.println(string);
		}
		return true;
	}			
	public static boolean validateNumber(double weight) {
		if(weight < 100 && weight > 1) {
			return false;
			
		}else {
			System.out.println(weight);
		}
		return true;	
	}
}
