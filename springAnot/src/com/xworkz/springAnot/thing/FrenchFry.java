package com.xworkz.springAnot.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class FrenchFry {

	@Value("CHESS")
	private String name;
	@Value("cheesy")
	private String flever;
	@Value("55")
	private int cost;
	@Value("Banglore")
	private String location;
	@Value("rajath")
	private String preparedBy;
	@Value("quart")
	private String shopName;
	@Value("567865876")
	private long ownerNo;
	@Value("812654587")
	private long chefNo;
	@Value("Karnataka")
	private String state;
	@Value("spicy-peri peri")
	private String type;
	@Value("ramlu")
	private String chefName;
	@Value("44")
	private int listOfmenu;
	@Value("5")
	private int noOfWorkerInshop;
	@Value("100")
	private String visitar;
	@Value("5")
	private int groupOfMemb;
	
	public int lowBudgetMenu() {
		System.out.println("calling lowbudget ");
		return 30;
	}
	
	
	
	
}
