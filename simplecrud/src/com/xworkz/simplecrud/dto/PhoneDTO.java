package com.xworkz.simplecrud.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhoneDTO implements Serializable,Comparable<PhoneDTO> {
	
	@NotNull
	@NotEmpty
	private String name;
	
	@Min(value = 10,message = "id must be min ten")
	@Max(value = 20,message = "id must be max 20")
	private int id;
	
	@NotEmpty
	@NotNull
	private String shopName;
	
	
	
	@Override
	public int compareTo(PhoneDTO o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}
