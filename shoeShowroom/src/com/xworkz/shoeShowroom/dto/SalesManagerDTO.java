package com.xworkz.shoeShowroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable,Comparable<SalesManagerDTO> {

	@Min(value = 20,message="min value is 20")
	@Max(value = 30,message="max value is 30")
	private int id;
	
	@NotNull
	@NotEmpty
	private String name;

	SalesManagerDTO(){
		System.out.println(" creating No-org constructor");
	}
	
	
	@Override
	public int compareTo(SalesManagerDTO o) {
		return this.getName().compareTo(o.getName());
	}
	
	
	
	
}
