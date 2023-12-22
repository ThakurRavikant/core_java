package com.xworkz.dto;

public class MetroStaffDTO {
	private String name;
	private int age;
	private String gender;
	private String location;
	private String contactNumber;

	public MetroStaffDTO() {

	}

	public MetroStaffDTO(String name, int age, String gender, String location, String contactNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "MetroStaffDTO [name=" + name + ", age=" + age + ", gender=" + gender + ", location=" + location
				+ ", contactNumber=" + contactNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


}
