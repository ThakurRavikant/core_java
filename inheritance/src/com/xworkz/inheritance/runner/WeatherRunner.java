package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Weather;
import com.xworkz.inheritance.things.Winter;

public class WeatherRunner extends Weather {
	public static void main(String[] args) {
		Weather weather = new Winter();
		weather.display();
	}

}
