package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Journey {

	private String season;
	private String location;
	private String leadName;
	private int totalLocation;
	private double totalBudget;
	private String firstLocation;
	private int roomRent;
	private int totalBoysStrength;
	private int girlsStrength;
	private String holtingLocation;
	private String lastVisit;
	private int perHeadExpense;
	private long leadNo;
	
	
	@Value("mansoon")
	public void setSeason(String season) {
		this.season = season;
	}
	
	@Value("Madikeri")
	public void setLocation(String location) {
		this.location = location;
	}
	@Value("Rajputh")
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	
	@Value("7")
	public void setTotalLocation(int totalLocation) {
		this.totalLocation = totalLocation;
	}
	
	@Value("7999.00")
	public void setTotalBudget(double totalBudget) {
		this.totalBudget = totalBudget;
	}
	@Value("hampi")
	public void setFirstLocation(String firstLocation) {
		this.firstLocation = firstLocation;
	}
	
	@Value("1700")
	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}
	@Value("9")
	public void setTotalBoysStrength(int totalBoysStrength) {
		this.totalBoysStrength = totalBoysStrength;
	}
	
	@Value("7")
	public void setGirlsStrength(int girlsStrength) {
		this.girlsStrength = girlsStrength;
	}
	@Value("Bagalkot")
	public void setHoltingLocation(String holtingLocation) {
		this.holtingLocation = holtingLocation;
	}
	@Value("Kodagu")
	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}
	
	@Value("1500")
	public void setPerHeadExpense(int perHeadExpense) {
		this.perHeadExpense = perHeadExpense;
	}
	@Value("7987654333")
	public void setLeadNo(long leadNo) {
		this.leadNo = leadNo;
	}

	@Override
	public String toString() {
		return "Journey [season=" + season + ", location=" + location + ", leadName=" + leadName + ", totalLocation="
				+ totalLocation + ", totalBudget=" + totalBudget + ", firstLocation=" + firstLocation + ", roomRent="
				+ roomRent + ", totalBoysStrength=" + totalBoysStrength + ", girlsStrength=" + girlsStrength
				+ ", holtingLocation=" + holtingLocation + ", lastVisit=" + lastVisit + ", perHeadExpense="
				+ perHeadExpense + ", leadNo=" + leadNo + "]";
	}
	
	public int headNo() {
		System.out.println("calling headNo");
		return 4;
	}
	
	
	
	
	
	
	
}
