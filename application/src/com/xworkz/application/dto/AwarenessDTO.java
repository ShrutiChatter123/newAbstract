package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO implements Serializable {
	
	private int id;
	private String name;
	private String country;
	private double area;
	private int minTemp;
	private int maxTemp;
	
	AwarenessDTO() {
	}
	
	public AwarenessDTO(int id, String name, String country, double area, int minTemp, int maxTemp) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.area = area;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
	}
	@Override
	public String toString() {
		return "AwarenessDTO [id=" + id + ", name=" + name + ", country=" + country + ", area=" + area + ", minTemp="
				+ minTemp + ", maxTemp=" + maxTemp + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, country, id, maxTemp, minTemp, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AwarenessDTO other = (AwarenessDTO) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(country, other.country) && id == other.id && maxTemp == other.maxTemp
				&& minTemp == other.minTemp && Objects.equals(name, other.name);
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}
	public int getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	

}
