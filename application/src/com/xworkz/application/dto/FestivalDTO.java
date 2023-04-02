package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class FestivalDTO implements Serializable {
	
	
	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String sweet;
	private String godName;
	
	public FestivalDTO() {
		System.out.println("no-org constructor");
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

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(endDate, godName, id, name, startDate, sweet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FestivalDTO other = (FestivalDTO) obj;
		return Objects.equals(endDate, other.endDate) && Objects.equals(godName, other.godName) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate)
				&& Objects.equals(sweet, other.sweet);
	}

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sweet=" + sweet + ", godName=" + godName + "]";
	}

	public FestivalDTO(int id, String name, LocalDate startDate, LocalDate endDate, String sweet, String godName) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sweet = sweet;
		this.godName = godName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
