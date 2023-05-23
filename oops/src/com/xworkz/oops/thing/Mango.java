package com.xworkz.oops.thing;

public class Mango extends Fruit {

	private String shopName;

	public Mango(String name, int cost, String shopName) {
		super(name, cost);
		this.shopName = shopName;

//		calling by concat
//		System.out.println("shopName:" + " " + shopName);

	}

//	calling by method
	public void display() {
		super.display();
		System.out.println("shopName:"+shopName);
	}

	public String getshopName() {
		return shopName;
	}

}
