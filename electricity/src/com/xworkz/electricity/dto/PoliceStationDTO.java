package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
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
public class PoliceStationDTO implements Serializable,Comparable<PoliceStationDTO> {

	
	@Min(value=20, message="id value is lesser than 20 ")
	@Max(value=100, message="id value is greater than 100 ")
	private int id;
	@NotEmpty(message="name value must not be empty or null")
	@NotNull()
	private String name; 
	@NotEmpty(message="inspector name not be empty or null")
	@NotNull()
	private String inspectorName;
	@Min(value=12, message="cell value is less than 31")
	@Max(value=120, message="cell value must be greater than 120")
	private int cells;
	@NotEmpty(message="area must not be null and empty")
	@NotNull()
	private String area;
	private LocalDate startDate;
	
	


	@Override
	public int compareTo(PoliceStationDTO o) {
	
		return this.name.compareTo(o.getName());
	}
	
	
	
	
	
}
