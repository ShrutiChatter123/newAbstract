package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.val;

@ToString
@Component
public class Weekend {

	@Value("kodagu")
	private String name;
	@Value("4")
	private int days;
	@Value("Shruti")
	private String enjoyer;
	@Value("Coding")
	private String pendingWork;
	@Value("koimbthoor")
	private String visitingPlace;
	@Value("5")
	private int visitingplace;
	private String state;
	@Value("Karnataka")
	private String district;
	@Value("6")
	private int date;
	@Value("456787654")
	private Long headNo;
	@Value("spicy")
	private String planedFood;
	@Value("6")
	private String coffiTime;
	@Value("5")
	private int returnDate;
	@Value("345678654")
	private Long parentNo;
	@Value("yes")
	private boolean permission;
	
	
	public String Season() {
		System.out.println("calling season");
		return "Summer";
	}
	
	
}
