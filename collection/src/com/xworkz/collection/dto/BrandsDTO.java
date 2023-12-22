package com.xworkz.collection.dto;

import java.time.LocalDate;

public class BrandsDTO {
	private Integer id;
	private String name;
	private String gstNo;
	private AddressDTO addressDTO;
	private LocalDate estForm;
	  
	public BrandsDTO() {
		// TODO Auto-generated constructor stub
	}

	public BrandsDTO(Integer id, String name, String gstNo, AddressDTO addressDTO, LocalDate estForm) {
		super();
		this.id = id;
		this.name = name;
		this.gstNo = gstNo;
		this.addressDTO = addressDTO;
		this.estForm = estForm;
	}

	@Override
	public String toString() {
		return "BrandsDTO [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", addressDTO=" + addressDTO
				+ ", estForm=" + estForm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estForm == null) ? 0 : estForm.hashCode());
		result = prime * result + ((gstNo == null) ? 0 : gstNo.hashCode());
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
		BrandsDTO other = (BrandsDTO) obj;
		if (estForm == null) {
			if (other.estForm != null)
				return false;
		} else if (!estForm.equals(other.estForm))
			return false;
		if (gstNo == null) {
			if (other.gstNo != null)
				return false;
		} else if (!gstNo.equals(other.gstNo))
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

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public LocalDate getEstForm() {
		return estForm;
	}

	public void setEstForm(LocalDate estForm) {
		this.estForm = estForm;
	}
	
	

}
