package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ProjectDTO implements Serializable{
	
	private int id;
	private String name;
	private String country;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public ProjectDTO(int id, String name, String country, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProjectDTO [id=" + id + ", name=" + name + ", country=" + country + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, endDate, id, name, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectDTO other = (ProjectDTO) obj;
		return Objects.equals(country, other.country) && Objects.equals(endDate, other.endDate) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
	
	
	
	
	
}
