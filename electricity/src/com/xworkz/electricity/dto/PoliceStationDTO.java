package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import io.smallrye.common.constraint.NotNull;

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
	
	
	public PoliceStationDTO(int id, String name, String inspectorName, int cells, String area) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.cells = cells;
		this.area = area;
	}


	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", inspectorName=" + inspectorName + ", cells=" + cells
				+ ", area=" + area + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(area, cells, id, inspectorName, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Objects.equals(area, other.area) && cells == other.cells && id == other.id
				&& Objects.equals(inspectorName, other.inspectorName) && Objects.equals(name, other.name);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInspectorName() {
		return inspectorName;
	}


	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}


	public int getCells() {
		return cells;
	}


	public void setCells(int cells) {
		this.cells = cells;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	@Override
	public int compareTo(PoliceStationDTO o) {
	
		return this.name.compareTo(o.getName());
	}
	
	
	
	
	
}
