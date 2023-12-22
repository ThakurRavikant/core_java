package com.xworkz.collection.dto;

public class CountryDTO {
	private String id;
	private String name;
	private PresidentDTO presidentDTO;
	private String continent;
	  
	
	public CountryDTO() {
		System.out.println("No-arg constructor");
	}


	public CountryDTO(String id, String name, PresidentDTO presidentDTO, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.presidentDTO = presidentDTO;
		this.continent = continent;
	}


	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", presidentDTO=" + presidentDTO + ", continent=" + continent
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PresidentDTO getPresidentDTO() {
		return presidentDTO;
	}


	public void setPresidentDTO(PresidentDTO presidentDTO) {
		this.presidentDTO = presidentDTO;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
}
