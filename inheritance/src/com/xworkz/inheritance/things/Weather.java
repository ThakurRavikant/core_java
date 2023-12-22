package com.xworkz.inheritance.things;

public class Weather {
	protected double temperature;
	protected double humidity;
	protected String windSpeed;
	protected int precipitation;
	protected String pressure;
	protected String visibility;
	protected String sunriseTime;
	protected String sunsetTime;
	protected String weatherDescription;
	protected String weatherCode;
	protected String windDirection;
	protected String uvIndex;
	protected String airQualityIndex;
	protected double dewPoint;
	protected boolean cloudCover;
	protected boolean weatherIcon;
	protected String feelsLikeTemperature;
	protected String precipitationProbability;
	protected String thunderstormProbability;
	protected String pollenCount;
	
	public Weather() {
		System.out.println("Default construstor of Weather");
	}
	
	public Weather(double temperature,double humidity,String windSpeed,int precipitation,String pressure, String visibility,String sunriseTime,String sunsetTime
			, String weatherDescription,String weatherCode,String windDirection,String uvIndex,String airQualityIndex,double dewPoint,boolean cloudCover,
			boolean weatherIcon,String feelsLikeTemperature,String precipitationProbability,String thunderstormProbability,String pollenCount) {
		System.out.println("All Argument construstor of Weather");
		this.temperature=temperature;
		this.humidity=humidity;
		this.windDirection=windDirection;
		this.precipitation=precipitation;
		this.pressure=pressure;
		this.visibility=visibility;
		this.sunriseTime=sunriseTime;
		this.sunsetTime=sunsetTime;
		this.weatherDescription=weatherDescription;
		this.weatherCode=weatherCode;
		this.uvIndex=uvIndex;
		this.airQualityIndex=airQualityIndex;
		this.dewPoint=dewPoint;
		this.cloudCover=cloudCover;
		this.weatherIcon=weatherIcon;
		this.feelsLikeTemperature=feelsLikeTemperature;
		this.precipitationProbability=precipitationProbability;
		this.thunderstormProbability=thunderstormProbability;
		this.pollenCount=pollenCount;
		
		
	}
	public void display() {
		System.out.println("This is display method of Weather class");
	}

}
