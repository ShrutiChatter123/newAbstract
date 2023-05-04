package com.xworkz.shoeShowroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SocksDTO implements Serializable,Comparable<SocksDTO> {

	
	@Max(value = 100,message="cost max 100")
	@Min(value = 40,message="cost min40")
	private int cost;
	
	@NotEmpty
	@NotNull
	private String name;
	

	
	@Override
	public int compareTo(SocksDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
