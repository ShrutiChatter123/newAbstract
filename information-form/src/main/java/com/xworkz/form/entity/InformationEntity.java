package com.xworkz.form.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="informationentity")
public class InformationEntity {

	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id=0;
	private String fName;
	private String lName;
	private String email;
	private long mobileNo;
	private String address;
	
	
	
}
