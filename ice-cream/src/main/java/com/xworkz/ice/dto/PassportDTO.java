package com.xworkz.ice.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassportDTO implements Serializable {

	private String fName;
	private String lName;
	private String address;
	private String mobileNo;
	
	
}
