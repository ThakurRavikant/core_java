package com.xworkz.collection.dto;

public class BrandDTO implements Comparable<BrandDTO> {
	private String name;
	private String owner;
	private double revenue;
	private String country;

	public BrandDTO() {
		System.out.println("No-arg constuctor");

	}



	public BrandDTO(String name, String owner, double revenue, String country) {
		super();
		this.name = name;
		this.owner = owner;
		this.revenue = revenue;
		this.country = country;
	}



	@Override
	public String toString() {
		return "BrandDTO [name=" + name + ", owner=" + owner + ", revenue=" + revenue + ", country=" + country + "]";
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
		BrandDTO other = (BrandDTO) obj;
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



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public double getRevenue() {
		return revenue;
	}



	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public int compareTo(BrandDTO arg) {
		BrandDTO temp=this;
		return temp.getName().compareTo(arg.getName());



	}	
}
