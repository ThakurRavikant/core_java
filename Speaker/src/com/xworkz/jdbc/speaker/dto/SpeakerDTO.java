package com.xworkz.jdbc.speaker.dto;

public class SpeakerDTO  {
	private int id;
	private String brandName;
	private int price;
	private String quality;
	
	public SpeakerDTO() {
		System.out.println("No-args constructor");
	}

	public SpeakerDTO(int id, String brandName, int price, String quality) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "SpeakerDTO [id=" + id + ", brandName=" + brandName + ", price=" + price + ", quality=" + quality + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + price;
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
		SpeakerDTO other = (SpeakerDTO) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	

}
