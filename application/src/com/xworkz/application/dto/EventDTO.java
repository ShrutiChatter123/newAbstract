package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class EventDTO implements Serializable {
	
	private String name;
	private String location;
	private double hallCost;
	private int date;
	private int familymemeber;
	
		public EventDTO(String name, String location, double hallCost, int date, int familymemeber) {
		super();
		this.name = name;
		this.location = location;
		this.hallCost = hallCost;
		this.date = date;
		this.familymemeber = familymemeber;
	}
	@Override
	public String toString() {
		return "EventDTO [name=" + name + ", location=" + location + ", hallCost=" + hallCost + ", date=" + date
				+ ", familymemeber=" + familymemeber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, familymemeber, hallCost, location, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventDTO other = (EventDTO) obj;
		return date == other.date && familymemeber == other.familymemeber
				&& Double.doubleToLongBits(hallCost) == Double.doubleToLongBits(other.hallCost)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
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
	public double getHallCost() {
		return hallCost;
	}
	public void setHallCost(double hallCost) {
		this.hallCost = hallCost;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getFamilymemeber() {
		return familymemeber;
	}
	public void setFamilymemeber(int familymemeber) {
		this.familymemeber = familymemeber;
	}
	
	
}