package com.xworkz.shoeShowroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShoeShowRoomDTO implements Serializable, Comparable<ShoeShowRoomDTO> {

	@Max(value = 30, message="value not less than 30")
	@Min(value=20,message="value not grater than 20")
	private int id;
	
	@NonNull
	@NotEmpty
	private String name;

	
	@NonNull
	@NotEmpty
	private String address;
	
	@NotNull
	@NotEmpty
	private String gstNo;

	public ShoeShowRoomDTO() {
		System.out.println("creating showroom with no-org cosntructor");
	}

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
