package com.xworkz.collection.functional;
import java.io.Serializable;
import java.util.Objects;

import com.xworkz.collection.constants.Type;

public class SnakeDTO implements Serializable{

	private int id;
	private String name;
	private Type type;
	private String place;
	
	public SnakeDTO(int id, String name, Type type, String place) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
	}

	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, place, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnakeDTO other = (SnakeDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(place, other.place)
				&& type == other.type;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	

	
	
	
}
