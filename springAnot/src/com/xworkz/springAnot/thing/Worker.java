package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Worker {

	private String name;
	private int age;
	private String location;
	private long salary;
	private String dressCode;
	private int familyMemb;
	private String homeLocation;
	private String proper;
	private double homeRent;
	private long mobileNo;
	private int dressSize;
	private int noOfAttendence;
	private int absence;
	private String officeName;
	private String workingPost;

	public Worker(@Value("Rahul") String name, @Value("25") int age, @Value("Banglore") String location,
			@Value("23000") long salary, @Value("formal") String dressCode, @Value("5") int familyMemb,
			@Value("banglore") String homeLocation, @Value("Gadag") String proper, @Value("1800.78") double homeRent,
			@Value("56789943") long mobileNo, @Value("14") int dressSize, @Value("26") int noOfAttendence,
			@Value("4") int absence, @Value("wipro") String officeName, @Value("lead") String workingPost) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.salary = salary;
		this.dressCode = dressCode;
		this.familyMemb = familyMemb;
		this.homeLocation = homeLocation;
		this.proper = proper;
		this.homeRent = homeRent;
		this.mobileNo = mobileNo;
		this.dressSize = dressSize;
		this.noOfAttendence = noOfAttendence;
		this.absence = absence;
		this.officeName = officeName;
		this.workingPost = workingPost;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", location=" + location + ", salary=" + salary
				+ ", dressCode=" + dressCode + ", familyMemb=" + familyMemb + ", homeLocation=" + homeLocation
				+ ", proper=" + proper + ", homeRent=" + homeRent + ", mobileNo=" + mobileNo + ", dressSize="
				+ dressSize + ", noOfAttendence=" + noOfAttendence + ", absence=" + absence + ", officeName="
				+ officeName + ", workingPost=" + workingPost + "]";
	}
	
	public int dailyAttender() {
		System.out.println("calling daily attender");
		return 44;
	}
	
	
	
	
	
	
	

}
