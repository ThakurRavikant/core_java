package com.xworkz.collection.dto;

public class ProductDTO {
	private Integer id;
	private String name;
	private Type type;
	private BrandDTO brandDTO;
	private Integer price;
	private Integer quantity;
	
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}


	public ProductDTO(Integer id, String name, Type type, BrandDTO brandDTO, Integer price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.brandDTO = brandDTO;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", type=" + type + ", brandDTO=" + brandDTO + ", price="
				+ price + ", quantity=" + quantity + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		ProductDTO other = (ProductDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
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


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public BrandDTO getBrandDTO() {
		return brandDTO;
	}


	public void setBrandDTO(BrandDTO brandDTO) {
		this.brandDTO = brandDTO;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	

}
