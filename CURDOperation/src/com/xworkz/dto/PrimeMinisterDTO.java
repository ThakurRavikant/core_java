package com.xworkz.dto;

public class PrimeMinisterDTO {
	private int id;
	private String name;
	private String country;
	private String partyName;
	
	public PrimeMinisterDTO() {
		
	}

	public PrimeMinisterDTO(int id, String name, String country, String partyName) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.partyName = partyName;
	}

	@Override
	public String toString() {
		return "PrimeMinisterDTO [id=" + id + ", name=" + name + ", country=" + country + ", partyName=" + partyName
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	

}
