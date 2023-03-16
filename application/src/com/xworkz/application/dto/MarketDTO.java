package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class MarketDTO {

	private String location;
	private int noOfPeoplesPresent;
	private int noOfShops;
	private LocalDate attLocalDate;
	private int rateStartFrom;
	
	public MarketDTO() {
		System.out.println("no-org constructor");
	}

	public String getLocation() {
		return location;
	}

	public int getNoOfPeoplesPresent() {
		return noOfPeoplesPresent;
	}

	public int getNoOfShops() {
		return noOfShops;
	}

	public LocalDate getAttLocalDate() {
		return attLocalDate;
	}

	public int getRateStartFrom() {
		return rateStartFrom;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNoOfPeoplesPresent(int noOfPeoplesPresent) {
		this.noOfPeoplesPresent = noOfPeoplesPresent;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public void setAttLocalDate(LocalDate attLocalDate) {
		this.attLocalDate = attLocalDate;
	}

	public void setRateStartFrom(int rateStartFrom) {
		this.rateStartFrom = rateStartFrom;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attLocalDate, location, noOfPeoplesPresent, noOfShops, rateStartFrom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(attLocalDate, other.attLocalDate) && Objects.equals(location, other.location)
				&& noOfPeoplesPresent == other.noOfPeoplesPresent && noOfShops == other.noOfShops
				&& rateStartFrom == other.rateStartFrom;
	}

	@Override
	public String toString() {
		return "MarketDTO [\nlocation=" + location + ", \nnoOfPeoplesPresent=" + noOfPeoplesPresent + ", \nnoOfShops="
				+ noOfShops + ", \nattLocalDate=" + attLocalDate + ", \nrateStartFrom=" + rateStartFrom + "]";
	}
	
	
	
	
	
}
