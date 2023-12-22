package com.xworkz.collection.dto;

import java.awt.List;
import java.time.LocalDate;
import java.util.Collection;

public class WarDTO {
	private String id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Collection<CountryDTO> countries;
	private String wonBy;

	public WarDTO() {
		System.out.println("No-arg Const");
	}

	public WarDTO(String id, LocalDate startDate, LocalDate endDate, Collection<CountryDTO> countries, String wonBy) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.countries = countries;
		this.wonBy = wonBy;
	}

	@Override
	public String toString() {
		return "WarDTO [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", countries=" + countries
				+ ", wonBy=" + wonBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((wonBy == null) ? 0 : wonBy.hashCode());
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
		WarDTO other = (WarDTO) obj;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (wonBy == null) {
			if (other.wonBy != null)
				return false;
		} else if (!wonBy.equals(other.wonBy))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Collection<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(Collection<CountryDTO> countries) {
		this.countries = countries;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}


}
