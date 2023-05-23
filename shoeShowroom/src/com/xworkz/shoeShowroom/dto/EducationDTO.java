package com.xworkz.shoeShowroom.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class EducationDTO implements Serializable,Comparable<EducationDTO> {

	
private	String name;
private int NoOfBranches;
private double donation;
public EducationDTO(@Value("VTU")String name, @Value("66") int noOfBranches,  @Value("12345") double donation) {
	super();
	this.name = name;
	NoOfBranches = noOfBranches;
	this.donation = donation;
}
@Override
public int compareTo(EducationDTO o) {
	return this.getName().compareTo(o.getName());
}



	
}
