package com.xworkz.iskonJdbc.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class IskonDTO implements Serializable,Comparable<IskonDTO> {

	
	@Size(min = 20,max = 45,message = "god name must be between 20 to 45")
	@NotEmpty
	@NotNull
	private String godName;
	
	@Min(value = 100000)
	@Max(value = 200908)
	private double area;
	
	@NotEmpty
	@NotNull
	private String location;
	
	private boolean open;
	
	@Size(min = 100,max = 200, message = "float value between 100 to 200")
	private float entryFee;
	
	@Override
	public int compareTo(IskonDTO o) {
		return this.getGodName().compareTo(o.godName);
	}

}
