package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import io.smallrye.common.constraint.NotNull;

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

	public MarriageDTO(int id, String brideName, String groomName, boolean arranged, LocalDate date, String hallName,
			int noOfPeopleInvited, double dowry) {
		super();
		this.id = id;
		this.brideName = brideName;
		this.groomName = groomName;
		this.arranged = arranged;
		this.date = date;
		this.hallName = hallName;
		this.noOfPeopleInvited = noOfPeopleInvited;
		this.dowry = dowry;
	}

	@Override
	public String toString() {
		return "MarriageDTO [id=" + id + ", brideName=" + brideName + ", groomName=" + groomName + ", arranged="
				+ arranged + ", date=" + date + ", hallName=" + hallName + ", noOfPeopleInvited=" + noOfPeopleInvited
				+ ", dowry=" + dowry + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(arranged, brideName, date, dowry, groomName, hallName, id, noOfPeopleInvited);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarriageDTO other = (MarriageDTO) obj;
		return arranged == other.arranged && Objects.equals(brideName, other.brideName)
				&& Objects.equals(date, other.date)
				&& Double.doubleToLongBits(dowry) == Double.doubleToLongBits(other.dowry)
				&& Objects.equals(groomName, other.groomName) && Objects.equals(hallName, other.hallName)
				&& id == other.id && noOfPeopleInvited == other.noOfPeopleInvited;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrideName() {
		return brideName;
	}

	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}

	public String getGroomName() {
		return groomName;
	}

	public void setGroomName(String groomName) {
		this.groomName = groomName;
	}

	public boolean isArranged() {
		return arranged;
	}

	public void setArranged(boolean arranged) {
		this.arranged = arranged;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getNoOfPeopleInvited() {
		return noOfPeopleInvited;
	}

	public void setNoOfPeopleInvited(int noOfPeopleInvited) {
		this.noOfPeopleInvited = noOfPeopleInvited;
	}

	public double getDowry() {
		return dowry;
	}

	public void setDowry(double dowry) {
		this.dowry = dowry;
	}

	@Override
	public int compareTo(MarriageDTO o) {

		return this.getBrideName().compareTo(o.getBrideName());
	}

}
