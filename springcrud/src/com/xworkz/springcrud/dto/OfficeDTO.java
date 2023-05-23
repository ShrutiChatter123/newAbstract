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
public class OfficeDTO implements Serializable, Comparable<OfficeDTO> {

	@Min(value = 12, message = "no is min 12")
	@Max(value = 10000000, message = "No is at least 10000000")
	private long landLineNo;

	@NotEmpty
	@NotNull
	private String name;

	@Override
	public int compareTo(OfficeDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
