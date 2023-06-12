package com.xworkz.adhar_card.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdharDTO implements Serializable,Comparable<AdharDTO> {

	@NotNull
	@Size(min = 5, max = 20, message = "f name between 12 to 20")
	private String fName;
	
	@NotNull
	@Size(min = 6, max = 20, message = "lName between 15 to 20")
	private String lName;
	
	private long mobile;
	
	@NotNull
	@Size(min = 140, max = 150, message = "address between 15 to 20")

	
	@Email(message = "enter valid email")
	private String email;
	
	@NotNull
	@Size(min = 15, max = 20, message = "state between 15 to 20")

	private String state;
	
	private String gender;
	
	private String address;

	
	
	@Override
	public int compareTo(AdharDTO o) {
		return this.fName.compareTo(o.fName);
	}
	
	
	
	
}
