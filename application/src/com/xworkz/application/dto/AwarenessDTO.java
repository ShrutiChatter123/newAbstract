package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO {
	
	private String mainTheom;
	private int functionDate;
	private String location;
	private long noOfPeoplePresent;
	private LocalDate attLocalDate;
	
	public AwarenessDTO() {
		System.out.println("no org constructor to AwarenessDTO");
	}

	public String getMainTheom() {
		return mainTheom;
	}

	public int getFunctionDate() {
		return functionDate;
	}

	public String getLocation() {
		return location;
	}

	public long getNoOfPeoplePresent() {
		return noOfPeoplePresent;
	}

	public LocalDate getAttLocalDate() {
		return attLocalDate;
	}

	public void setMainTheom(String educatePeople) {
		this.mainTheom = mainTheom;
	}

	public void setFunctionDate(int functionDate) {
		this.functionDate = functionDate;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNoOfPeoplePresent(long noOfPeoplePresent) {
		this.noOfPeoplePresent = noOfPeoplePresent;
	}

	public void setAttLocalDate(LocalDate attLocalDate) {
		this.attLocalDate = attLocalDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attLocalDate, mainTheom, functionDate, location, noOfPeoplePresent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AwarenessDTO other = (AwarenessDTO) obj;
		return Objects.equals(attLocalDate, other.attLocalDate) && Objects.equals(mainTheom, other.mainTheom)
				&& functionDate == other.functionDate && Objects.equals(location, other.location)
				&& noOfPeoplePresent == other.noOfPeoplePresent;
	}

	@Override
	public String toString() {
		return "AwarenessDTO [educatePeople=" + mainTheom + ", \nfunctionDate=" + functionDate + ", \nlocation="
				+ location + ", \nnoOfPeoplePresent=" + noOfPeoplePresent + ", \nattLocalDate=" + attLocalDate + "]";
	}
	
	
	
	
	
	

}
