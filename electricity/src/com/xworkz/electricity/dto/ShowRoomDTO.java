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
	public String toString() {
		return "ShowRoomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closedDate=" + closedDate + "]";
	}

	public ShowRoomDTO(int id, String name, Location location, long number, LocalDate openDate, LocalDate closedDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closedDate = closedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(closedDate, id, location, name, number, openDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShowRoomDTO other = (ShowRoomDTO) obj;
		return Objects.equals(closedDate, other.closedDate) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& number == other.number && Objects.equals(openDate, other.openDate);
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public LocalDate getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(LocalDate closedDate) {
		this.closedDate = closedDate;
	}

	@Override
	public int compareTo(ShowRoomDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
