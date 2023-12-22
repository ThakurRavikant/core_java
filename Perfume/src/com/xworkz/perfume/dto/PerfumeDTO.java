package com.xworkz.perfume.dto;

import java.io.Serializable;

public class PerfumeDTO implements Serializable{
	private String brandName;
	private int price;
	private String originCountry;
	private int quantity;
	private String perfumeNote;
	
	public PerfumeDTO() {
		System.out.println("no-arg const");
	}
	
	public PerfumeDTO(String brandName, int price, String originCountry, int quantity, String perfumeNote) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.originCountry = originCountry;
		this.quantity = quantity;
		this.perfumeNote = perfumeNote;
	}

	@Override
	public String toString() {
		return "PerfumeDTO [brandName=" + brandName + ", price=" + price + ", originCountry=" + originCountry
				+ ", quantity=" + quantity + ", perfumeNote=" + perfumeNote + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((originCountry == null) ? 0 : originCountry.hashCode());
		result = prime * result + ((perfumeNote == null) ? 0 : perfumeNote.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
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
		PerfumeDTO other = (PerfumeDTO) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (originCountry == null) {
			if (other.originCountry != null)
				return false;
		} else if (!originCountry.equals(other.originCountry))
			return false;
		if (perfumeNote == null) {
			if (other.perfumeNote != null)
				return false;
		} else if (!perfumeNote.equals(other.perfumeNote))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPerfumeNote() {
		return perfumeNote;
	}

	public void setPerfumeNote(String perfumeNote) {
		this.perfumeNote = perfumeNote;
	}

	
}


