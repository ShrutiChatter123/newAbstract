package com.xworkz.collection.dto;

import java.io.Serializable;

public class AnimalDTO implements Serializable {

	private String name;

	public AnimalDTO(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :" + this.name;
	}

	
	public String getName() {
		return name;
	}
}
