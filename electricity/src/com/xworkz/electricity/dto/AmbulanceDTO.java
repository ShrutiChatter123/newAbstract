package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 20, message = "id not less than 20")
	@Max(value = 50, message = "value not less than 50")
	private int id;
	@Min(value = 1)
	@Max(value = 1000, message = "regNo not less than 100")
	private long regNo;
	@Min(value = 1, message = "chasis no not less than 15")
	@Max(value = 999999999)
	private long chasisNo;
	@NotEmpty()
	@NotNull()
	private String ownerName;
	@PastOrPresent
	private LocalDate insuranceExpired;
	@NotNull()
	@NotEmpty()
	private String driverName;
	@Past()
	private LocalDate taxStartDate;
	
	
	@Override
	public int compareTo(AmbulanceDTO o) {
		
		return this.driverName.compareTo(o.getDriverName());
	}


	

}
