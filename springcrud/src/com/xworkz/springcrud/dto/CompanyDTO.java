package com.xworkz.springcrud.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyDTO implements Serializable, Comparable<CompanyDTO> {

	@NotEmpty
	@NotNull
	private String name;

	@Min(value = 20, message = "id is min 20")
	@Max(value = 30, message = "id is at least 30")
	private int id;

	@Override
	public int compareTo(CompanyDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
