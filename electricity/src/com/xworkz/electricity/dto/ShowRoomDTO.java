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
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ShowRoomDTO implements Serializable, Comparable<ShowRoomDTO> {

	@Min(value = 20, message = "id is greater than 20")
	@Max(value = 60, message = "id must lesser than 60 ")
	private int id;
	
	@NotEmpty(message = "name not be null or empty")
	private String name;
	
	@NotNull()
	private Location location;
	
	@Min(value = 25, message = "number is greater than 25")
	@Max(value = 55555555, message = "number is less than 55555555")
	private long number;
	
	@Past(message = "open date in formated ")
	private LocalDate openDate;
	
	@PastOrPresent(message = "closed date counted with the date")
	private LocalDate closedDate;

	

	@Override
	public int compareTo(ShowRoomDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
