package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IFunction {

	@Value("NamingCermany")
	private String name;
	
	@Value("6")
	private int date;
	
	@Value("bagalkot")
	private String location;
	
	@Value("hasan")
	private String arragerName;
	
	@Value("3")
	private int startMonth;
	
	@Value("6")
	private int noOfDays;
	
	@Value("baglkot")
	private String district;
	
	@Value("karnataka")
	private String state;
	
	@Value("AnyKind")
	private String dressCode;
	
	@Value("150")
	private int minAttenders;
	
	@Value("200")
	private int maxAttender;
	
	@Value("shreedhar")
	private String familtOwnerName;
	
	@Value("8765234567")
	private long ownerNO;
	
	@Value("15")
	private int familyMembers;

	@Override
	public String toString() {
		return "Function [name=" + name + ", date=" + date + ", location=" + location + ", arragerName=" + arragerName
				+ ", startMonth=" + startMonth + ", noOfDays=" + noOfDays + ", district=" + district + ", state="
				+ state + ", dressCode=" + dressCode + ", minAttenders=" + minAttenders + ", maxAttender=" + maxAttender
				+ ", familtOwnerName=" + familtOwnerName + ", ownerNO=" + ownerNO + ", familyMembers=" + familyMembers
				+ "]";
	}
	
	public String FamilyFunction() {
		System.out.println("calling FamilyFunction ");
		return"namingCermoney";
	}
	
	
	
	
	
	
}
