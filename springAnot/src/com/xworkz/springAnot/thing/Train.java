package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Train {

	private int cost;
	private String name;
	private long trainNo;
	private String trainName;
	private int flatformNo;
	private String coachName;
	private String lastDestiny;
	private int noOfPassengers;
	private String travelFrom;
	private String passagerName;
	private int noOfJoints;
	private String district;
	private String state;
	private int ticketCost;
	private int bookingdate;
	
	@Value("76")
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Value("Shruti")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("5566565")
	public void setTrainNo(long trainNo) {
		this.trainNo = trainNo;
	}
	@Value("golgumbaj")
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	@Value("5")
	public void setFlatformNo(int flatformNo) {
		this.flatformNo = flatformNo;
	}
	@Value("raj")
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	@Value("hubli")
	public void setLastDestiny(String lastDestiny) {
		this.lastDestiny = lastDestiny;
	}
	
	@Value("222")
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	@Value("banglore")
	public void setTravelFrom(String travelFrom) {
		this.travelFrom = travelFrom;
	}
	@Value("SHRUUUI")
	public void setPassagerName(String passagerName) {
		this.passagerName = passagerName;
	}
	@Value("12")
	public void setNoOfJoints(int noOfJoints) {
		this.noOfJoints = noOfJoints;
	}
	@Value("karnataka")
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Value("karnataka")
	public void setState(String state) {
		this.state = state;
	}
	
	@Value("300")
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	@Value("12")
	public void setBookingdate(int bookingdate) {
		this.bookingdate = bookingdate;
	}

	@Override
	public String toString() {
		return "Train [cost=" + cost + ", name=" + name + ", trainNo=" + trainNo + ", trainName=" + trainName
				+ ", flatformNo=" + flatformNo + ", coachName=" + coachName + ", lastDestiny=" + lastDestiny
				+ ", noOfPassengers=" + noOfPassengers + ", travelFrom=" + travelFrom + ", passagerName=" + passagerName
				+ ", noOfJoints=" + noOfJoints + ", district=" + district + ", state=" + state + ", ticketCost="
				+ ticketCost + ", bookingdate=" + bookingdate + "]";
	}
	
	
	public String finalDestiny() {
		System.out.println("calling finalDestiny");
		return "hubli";
	}
	
	
	
	
	
	
	
}
