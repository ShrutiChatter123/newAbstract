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
public class LaptopDTO implements Serializable,Comparable<LaptopDTO> {

	
	@Min(value = 12, message="min value is 12")
	@Max(value = 20, message="max value is 20")
	private int id;
	@NotEmpty
	@NotNull
	private String name;
	
	LaptopDTO(){
		System.out.println("No-org constructor to laptopDto");
	}
	
	@Override
	public int compareTo(LaptopDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
