package com.xworkz.collection.functional;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.collection.constants.Type;

public class TrainDTO implements Serializable  {

	private int id;
	private String name;
	private String place;
	
	public TrainDTO(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}

	@Override
	public String toString() {
		return "TrainDTO [id=" + id + ", name=" + name + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainDTO other = (TrainDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(place, other.place);
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
	
}
