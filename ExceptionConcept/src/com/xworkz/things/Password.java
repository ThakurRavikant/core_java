package com.xworkz.things;

public class Password {
	private String password;

	public Password(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}
	
	

}
