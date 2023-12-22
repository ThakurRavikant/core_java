package com.xworkz.runner;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateRunner {
	public static void main(String[] args) {
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		LocalDate past=LocalDate.of(2000,11, 06);
		System.out.println(past);
		
		LocalDate future=LocalDate.of(2023, 11, 12);
		System.out.println(future);
		
		boolean check=past.isAfter(future);
		System.out.println(check);
		
		boolean checked=future.isBefore(past);
		System.out.println("checked:"+checked);
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		LocalTime pasttime = LocalTime.of(2, 30);
		System.out.println(pasttime);
		
		LocalTime futureTime=LocalTime.of(5,15 );
		System.out.println(futureTime);
		
		boolean checkTime=pasttime.isAfter(futureTime);
		System.out.println(checkTime);
		
		boolean checkedTime=futureTime.isBefore(pasttime);
		System.out.println(checkedTime);
	}

}
