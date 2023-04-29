package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MarriageDTO implements Serializable, Comparable<MarriageDTO> {

	@Min(value = 20)
	@Max(value = 50)
	private int id;

	@NotEmpty
	@NotNull
	private String brideName;

	@NotEmpty
	@NotNull
	private String groomName;

	private boolean arranged;

	@PastOrPresent
	private LocalDate date;

	@NotEmpty(message = "hall identity not empty and not null ")
	@NotNull
	private String hallName;

	@Min(value = 100, message = "invited identity is lesser than 100")
	@Max(value = 120, message = "invited identity is greater than 120 ")
	private int noOfPeopleInvited;

	@Min(value = 2)
	@Max(value = 20)
	private double dowry;


	@Override
	public int compareTo(MarriageDTO o) {

		return this.getBrideName().compareTo(o.getBrideName());
	}

}
