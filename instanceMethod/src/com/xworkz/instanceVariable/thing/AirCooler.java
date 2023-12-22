package com.xworkz.instanceVariable.thing;

public class AirCooler {
	
	private String brandName;
	private int price;
	private String shoppingMode;
	private String quality;
	private String type;
	private int temperature;
	
	
	public AirCooler() {
		System.out.println("Default constructor");
	}
	public AirCooler(String brandName,int price,String shoppingMode,String quality,String type,int temperature) {
		this.brandName=brandName;
		this.price=price;
		this.shoppingMode=shoppingMode;
		this.quality=quality;
		this.type=type;
		this.temperature=temperature;
	}
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getShoppingMode() {
		return shoppingMode;
	}

	public void setShoppingMode(String shoppingMode) {
		this.shoppingMode = shoppingMode;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}

	public void weather() {
	 System.out.println("Condition of weather");
	}
	public String getresult(int temperature) {
		if(temperature<10) {
		 return "cool";
			}else if(temperature>10 && temperature<20) {
				return "medium";
			}else if(temperature>20 && temperature<30) {
				return "Moderate";
			}else if (temperature>30) {
				return "Hot";
			}else {
				return "Invaild";
	 }
 }
	public String getWeather(String weather) {
		if(weather=="cool") {
			return "Turn Off AirCooler";
		}else if(weather=="medium") {
			return "Don't turnoff AirCooler";
		}else if(weather=="Moderate") {
			return "Increase mode of AirCooler";
		}else if(weather=="Hot") {
			return "Change mode of AirCooler to High";
		}
		
		else {
			return "Invaild";
		}
	}

}
