package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;

import com.xworkz.electricity.constance.Location;

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
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class HotelDTO implements Serializable, Comparable<HotelDTO> {

	@Min(value=20,message="id is greater than 20")
	@Max(value=30,message="id is less than 50")
	private int id;
	@NotEmpty(message="name is not null and empty")
	@NotNull
	private String name;
	@NotNull
	private Location location;
	@Min(value=35,message="number not less than 33")
	@Max(value=55,message="no is not greater than 55")
	private long number;
	@PastOrPresent
	private LocalDate openDate;
	@Past
	private LocalDate taxStartDate;
	
	private boolean arranged;

	

	@Override
	public int compareTo(HotelDTO o) {
		return this.name.compareTo(o.getName());
	}

}
