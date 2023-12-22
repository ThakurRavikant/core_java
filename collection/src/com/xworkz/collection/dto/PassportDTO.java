package com.xworkz.collection.dto;

public class PassportDTO {
	private Integer id;
	private String name;
	private String issuedDate;
	private String issuedBy;
	private String expiryDate;
	private PassportType passporType;
	
	public PassportDTO() {
		System.out.println("No-arg const");
	}

	public PassportDTO(Integer id, String name, String issuedDate, String issuedBy, String expiryDate,
			PassportType passporType) {
		super();
		this.id = id;
		this.name = name;
		this.issuedDate = issuedDate;
		this.issuedBy = issuedBy;
		this.expiryDate = expiryDate;
		this.passporType = passporType;
	}

	@Override
	public String toString() {
		return "PassportDTO [id=" + id + ", name=" + name + ", issuedDate=" + issuedDate + ", issuedBy=" + issuedBy
				+ ", expiryDate=" + expiryDate + ", passporType=" + passporType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((issuedDate == null) ? 0 : issuedDate.hashCode());
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
		PassportDTO other = (PassportDTO) obj;
		if (issuedDate == null) {
			if (other.issuedDate != null)
				return false;
		} else if (!issuedDate.equals(other.issuedDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public PassportType getPassporType() {
		return passporType;
	}

	public void setPassporType(PassportType passporType) {
		this.passporType = passporType;
	}
	
	
}
