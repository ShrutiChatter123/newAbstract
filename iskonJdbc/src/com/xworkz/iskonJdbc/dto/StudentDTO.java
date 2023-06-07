package com.xworkz.iskonJdbc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO implements Serializable, Comparable<StudentDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String name;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String qualification;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String stream;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String course;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String college;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String city;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String state;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50)
	private String country;

	@Override
	public int compareTo(StudentDTO o) {
		return this.getName().compareTo(o.getName());
	} 

}
