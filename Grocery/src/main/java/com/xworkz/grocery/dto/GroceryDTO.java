package com.xworkz.grocery.dto;

public class GroceryDTO {
	private String name;
	private double price ;
	private double qunatity ;
	private String type ;
	
	public GroceryDTO() {
	System.out.println("No-arg ");
	}

	public GroceryDTO(String name, String type , double price, double qunatity) {
		super();
		this.name = name;
		this.price = price;
		this.qunatity = qunatity;
		this.type = type;
	}
	

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", qunatity=" + qunatity + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQunatity() {
		return qunatity;
	}

	public void setQunatity(double qunatity) {
		this.qunatity = qunatity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
