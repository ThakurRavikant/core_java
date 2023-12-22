package com.xworkz.instanceVariable.runner;

import com.xworkz.instanceVariable.thing.AirCooler;

public class AirCoolerRunner {
public static void main(String[] args) {
	AirCooler voltas=new AirCooler();
	voltas.weather();
	
	
	//int temperature=25;
	
	voltas.setTemperature(35);
	String getresult=voltas.getresult(voltas.getTemperature());
	System.out.println(getresult);
	
	String getWeather=voltas.getWeather(getresult);
	System.out.println(getWeather);
}
}