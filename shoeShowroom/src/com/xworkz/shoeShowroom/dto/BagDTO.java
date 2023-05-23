package com.xworkz.shoeShowroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BagDTO implements Serializable,Comparable<BagDTO> {

	@NotEmpty
	@NotNull
	private String name;
	
	@NotEmpty
	@NotEmpty
	private String brand;
	
	
	private long mobileNo;
	
	@Override
	public int compareTo(BagDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
