package com.xworkz.dto;

public class CustomerDTO {
	private String name;
	private String email;
	private String location;
	private boolean married;
	
	public CustomerDTO() {
		
	}

	public CustomerDTO(String name, String email, String location, boolean married) {
		super();
		this.name = name;
		this.email = email;
		this.location = location;
		this.married = married;
	}

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", email=" + email + ", location=" + location + ", married=" + married
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	

}
