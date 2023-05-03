package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NonVeg {

	private String name;
	private int cost;
	private String shop;
	private String location;
	private String state;
	private String district;
	private String serverName;
	private long ownerNo;
	private long serverNo;
	private String eaterName;
	private int listOfMenu;
	private int noOfVisiters;
	private int holidayInweek;
	private String cashierName;
	private int menulist;
	
	@Value("Haripriya")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("38")
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Value("rajanth")
	public void setShop(String shop) {
		this.shop = shop;
	}
	
	@Value("hubli")
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Value("Karnataka")
	public void setState(String state) {
		this.state = state;
	}
	
	@Value("hubli")
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Value("somanna")
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
	@Value("234567887")
	public void setOwnerNo(long ownerNo) {
		this.ownerNo = ownerNo;
	}
	
	@Value("987567847")
	public void setServerNo(long serverNo) {
		this.serverNo = serverNo;
	}
	
	@Value("Shruti")
	public void setEaterName(String eaterName) {
		this.eaterName = eaterName;
	}
	
	@Value("54")
	public void setListOfMenu(int listOfMenu) {
		this.listOfMenu = listOfMenu;
	}
	@Value("777")
	public void setNoOfVisiters(int noOfVisiters) {
		this.noOfVisiters = noOfVisiters;
	}
	
	@Value("11")
	public void setHolidayInweek(int holidayInweek) {
		this.holidayInweek = holidayInweek;
	}
	@Value("HARI")
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	@Value("12")
	public void setMenulist(int menulist) {
		this.menulist = menulist;
	}

	@Override
	public String toString() {
		return "NonVeg [name=" + name + ", cost=" + cost + ", shop=" + shop + ", location=" + location + ", state="
				+ state + ", district=" + district + ", serverName=" + serverName + ", ownerNo=" + ownerNo
				+ ", serverNo=" + serverNo + ", eaterName=" + eaterName + ", listOfMenu=" + listOfMenu
				+ ", noOfVisiters=" + noOfVisiters + ", holidayInweek=" + holidayInweek + ", cashierName=" + cashierName
				+ ", menulist=" + menulist + "]";
	}
	
	public String preparedBy() {
		System.out.println("calling non-veg");
		return "rahul-roa";
	}
	
	
	
	
	
	
}
