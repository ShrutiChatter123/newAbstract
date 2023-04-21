package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Objects;

public class StationaryDTO implements Serializable {

	private int cost;
	private String name;
	private String location;
	private long ownerMobileNo;
	
	public StationaryDTO(int cost, String name, String location, long ownerMobileNo) {
		super();
		this.cost = cost;
		this.name = name;
		this.location = location;
		this.ownerMobileNo = ownerMobileNo;
	}

	@Override
	public String toString() {
		return "StationaryDTO [cost=" + cost + ", name=" + name + ", location=" + location + ", ownerMobileNo="
				+ ownerMobileNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, location, name, ownerMobileNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationaryDTO other = (StationaryDTO) obj;
		return cost == other.cost && Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& ownerMobileNo == other.ownerMobileNo;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
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

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	
	
	
	
	
	
	
	
}
