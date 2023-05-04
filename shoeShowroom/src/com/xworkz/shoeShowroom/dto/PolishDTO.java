package com.xworkz.shoeShowroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable,Comparable<PolishDTO>{

	@Max(value = 20, message = "id value is max 20")
	@Min(value = 18, message = "id value is min 18")
	private int id;

	@NotNull
	@NotEmpty
	private String name;

	PolishDTO(){
		System.out.println("No-org constructor to polishDTO");
	}
	
	
	@Override
	public int compareTo(PolishDTO o) {
		return this.getName().compareTo(o.getName());
	}
	
	

}
