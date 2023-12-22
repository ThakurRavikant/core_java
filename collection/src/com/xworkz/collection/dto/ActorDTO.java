package com.xworkz.collection.dto;

public class ActorDTO implements Comparable<ActorDTO>{
	private Double id;
	private String name;
	private String langKnow;
	private String gender;
	private String country;


	public ActorDTO() {
		System.out.println("No-arg const");
	}


	public ActorDTO(Double id, String name, String langKnow, String gender, String country) {
		super();
		this.id = id;
		this.name = name;
		this.langKnow = langKnow;
		this.gender = gender;
		this.country = country;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActorDTO other = (ActorDTO) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ActorDTO [id=" + id + ", name=" + name + ", langKnow=" + langKnow + ", gender=" + gender + ", country="
				+ country + "]";
	}


	public Double getId() {
		return id;
	}


	public void setId(Double id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLangKnow() {
		return langKnow;
	}


	public void setLangKnow(String langKnow) {
		this.langKnow = langKnow;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public int compareTo(ActorDTO arg) {
		ActorDTO check=this;

		return arg.getName().compareTo(check.getName());
}
}
