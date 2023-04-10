package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class FunctionDTO implements Serializable {

	private int date;
	private String name;
	private String location;
	private double areaRent;
	
	
	public FunctionDTO(int date, String name, String location, double areaRent) {
		super();
		this.date = date;
		this.name = name;
		this.location = location;
		this.areaRent = areaRent;
	}


	@Override
	public int hashCode() {
		return Objects.hash(areaRent, date, location, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionDTO other = (FunctionDTO) obj;
		return Double.doubleToLongBits(areaRent) == Double.doubleToLongBits(other.areaRent) && date == other.date
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public double getAreaRent() {
		return areaRent;
	}


	public void setAreaRent(double areaRent) {
		this.areaRent = areaRent;
	}


	@Override
	public String toString() {
		return "FunctionDTO [date=" + date + ", name=" + name + ", location=" + location + ", areaRent=" + areaRent
				+ "]";
	}
	
	
	
	
	
	
}
