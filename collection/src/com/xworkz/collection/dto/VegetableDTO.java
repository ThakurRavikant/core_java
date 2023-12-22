package com.xworkz.collection.dto;

public class VegetableDTO {
	private String id;
	private String name;
	private double weight;
	private double price;
	
	public VegetableDTO() {
		// TODO Auto-generated constructor stub
	}

	public VegetableDTO(String id, String name, double weight, double price) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vegetable [id=" + id + ", name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
