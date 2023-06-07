package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Festival {

	@Value("ugadi")
	private String name;
	@Value("12")
	private int date;
	@Value("bagalkot")
	private String location;
	@Value("bagalkot")
	private String distict;
	@Value("Karnataka")
	private String state;
	@Value("pongal")
	private String splSweet;
	@Value("4")
	private int noOfItem;
	@Value("5")
	private int noOfGod;
	@Value("ganesha")
	private String paryGod;
	@Value("holge")
	private String favFood;
	@Value("Nagamma")
	private String motherName;
	@Value("4")
	private int holidays;
	@Value("monday")
	private String clsAttenDay;
	@Value("1")
	private int yearCount;
	@Value("Eshwara")
	private String headGod;

	public String culture() {
		System.out.println("Calling culture..");
		return "Indian";
	}

}
