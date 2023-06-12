package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BloodDonationDTO implements Serializable,Comparable<BloodDonationDTO> {

	private String donatorName;
	private long donatorMobileNo; 
	private String bloodGroupType;
	private String gender;
	private String email;
	private String address;
	private int weight;
	private String haveyoudonatedpreviously;
	
	private String fileName;
	private String contentType;
	private long fileSize;
	
	
	
	@Override
	public int compareTo(BloodDonationDTO o) {
		return this.getDonatorName().compareTo(o.getDonatorName());
	}
	
	
	
	
	
	
}
