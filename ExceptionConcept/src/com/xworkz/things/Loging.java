package com.xworkz.things;

public class Loging {
	private String name;
	private String email;
	
	
	public Loging(String name, String email) throws Exception {
		super();
		this.name = name;
		this.email = email;
		
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


	@Override
	public String toString() {
		return "Loging [name=" + name + ", emailString=" + email + "]";
	}
	
	
	

}
