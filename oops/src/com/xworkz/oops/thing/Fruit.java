package com.xworkz.oops.thing;

public class Fruit {

	private String name;
	private int cost;

	public Fruit(String name, int cost) {
		this.name = name;
		this.cost = cost;

//		System.out.println("name:"+ " "+ name + " "+ "/ncost:"+" "+cost);

	}

//	calling by method
	public void display() {
		System.out.println("name:" + " " + name + " " + " cost:" + " " + cost);
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}

	

}
