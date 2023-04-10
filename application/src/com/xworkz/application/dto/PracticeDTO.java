package com.xworkz.application.dto;

import java.util.Objects;

public class PracticeDTO {
	
	private int id;
	private String name;
	private String location;

	
	
	public PracticeDTO(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}


	@Override
	public String toString() {
		return "PracticeDTO [id=" + id + ", name=" + name + ", location=" + location + "]";
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, location, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PracticeDTO other = (PracticeDTO) obj;
		return id == other.id && Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}
	
	
	
	

}
