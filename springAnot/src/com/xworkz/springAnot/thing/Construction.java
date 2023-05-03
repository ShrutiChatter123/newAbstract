package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Construction {

	
	private String buildingLocation;
	private String ownerName;
	private double minBudget;
	private long OwnerNo;
	private long EnggNo;
	private String SiteMangerName;
	private long siteEnggNo;
	private int minDays;
	private int maxMonths;
	private String name;
	private int startdate;
	private int noOfWorkerPerDay;
	private String EnggName;
	private String ownerProper;
	
	@Value("Bagalkot")
	public void setBuildingLocation(String buildingLocation) {
		this.buildingLocation = buildingLocation;
	}
	
	@Value("Haripriya")
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Value("1345642.99")
	public void setMinBudget(double minBudget) {
		this.minBudget = minBudget;
	}
	@Value("7982345672")
	public void setOwnerNo(long ownerNo) {
		OwnerNo = ownerNo;
	}
	@Value("7123464568")
	public void setEnggNo(long enggNo) {
		EnggNo = enggNo;
	}
	@Value("Abhishek")
	public void setSiteMangerName(String siteMangerName) {
		SiteMangerName = siteMangerName;
	}
	@Value("8456723856")
	public void setSiteEnggNo(long siteEnggNo) {
		this.siteEnggNo = siteEnggNo;
	}
	
	@Value("540")
	public void setMinDays(int minDays) {
		this.minDays = minDays;
	}
	@Value("760")
	public void setMaxMonths(int maxMonths) {
		this.maxMonths = maxMonths;
	}
	
	@Value("hari")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("7")
	public void setStartdate(int startdate) {
		this.startdate = startdate;
	}
	
	@Value("17")
	public void setNoOfWorkerPerDay(int noOfWorkerPerDay) {
		this.noOfWorkerPerDay = noOfWorkerPerDay;
	}
	@Value("Rajkumar")
	public void setEnggName(String enggName) {
		EnggName = enggName;
	}
	
	@Value("haidrabad")
	public void setOwnerProper(String ownerProper) {
		this.ownerProper = ownerProper;
	}
	@Override
	public String toString() {
		return "Construction [buildingLocation=" + buildingLocation + ", ownerName=" + ownerName + ", minBudget="
				+ minBudget + ", OwnerNo=" + OwnerNo + ", EnggNo=" + EnggNo + ", SiteMangerName=" + SiteMangerName
				+ ", siteEnggNo=" + siteEnggNo + ", minDays=" + minDays + ", maxMonths=" + maxMonths + ", name=" + name
				+ ", startdate=" + startdate + ", noOfWorkerPerDay=" + noOfWorkerPerDay + ", EnggName=" + EnggName
				+ ", ownerProper=" + ownerProper + "]";
	}
	
	public long budget() {
		System.out.println("calling budget");
		return 456776L;
		
	}
	
	
	
	
	
}
