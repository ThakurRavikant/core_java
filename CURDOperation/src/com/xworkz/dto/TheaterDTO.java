package com.xworkz.dto;

public class TheaterDTO {
	private String name;
	private String loctaion;
	private String ownerName;
	private String classes;
	private String facilities;
	
	public TheaterDTO() {
		
	}

	public TheaterDTO(String name, String loctaion, String ownerName, String classes, String facilities) {
		super();
		this.name = name;
		this.loctaion = loctaion;
		this.ownerName = ownerName;
		this.classes = classes;
		this.facilities = facilities;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", loctaion=" + loctaion + ", ownerName=" + ownerName + ", classes="
				+ classes + ", facilities=" + facilities + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoctaion() {
		return loctaion;
	}

	public void setLoctaion(String loctaion) {
		this.loctaion = loctaion;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	

}
