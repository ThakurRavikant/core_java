package com.xworkz.collection.dto;

public class PlayerDTO {
	private String id;
	private String country;
	private String sport;
	private int age;
	
	public PlayerDTO() {
		System.out.println("No-arg Construct");
	}

	public PlayerDTO(String id, String country, String sport, int age) {
		super();
		this.id = id;
		this.country = country;
		this.sport = sport;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PlayerDTO [id=" + id + ", country=" + country + ", sport=" + sport + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
