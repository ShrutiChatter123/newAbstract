package com.xworkz.springTime.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	private String name;
	private int exp;
	private long salary;
	private int age;
	private long contactNo;
	private String gender;
	
	public Barber(@Value("snip")String name,@Value("12") int exp,@Value("23423") long salary,@Value("29") int age, @Value("876534567")long contactNo, @Value("male")String gender) {
		super();
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", exp=" + exp + ", salary=" + salary + ", age=" + age + ", contactNo="
				+ contactNo + ", gender=" + gender + "]";
	}
	
	
	
	
	
}
