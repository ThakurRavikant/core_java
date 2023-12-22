package com.xworkz.dto;

import java.io.Serializable;

public class MinisterDTO implements Serializable{
	private String name;
	private int exp;
	private String designation;
	private String partyName;
	
	public MinisterDTO() {
		
	}

	public MinisterDTO(String name, int exp, String designation, String partyName) {
		super();
		this.name = name;
		this.exp = exp;
		this.designation = designation;
		this.partyName = partyName;
	}

	@Override
	public String toString() {
		return "MinisterDTO [name=" + name + ", exp=" + exp + ", designation=" + designation + ", partyName="
				+ partyName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	

}
