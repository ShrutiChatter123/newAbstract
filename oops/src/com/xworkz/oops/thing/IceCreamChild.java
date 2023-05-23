package com.xworkz.oops.thing;

public class IceCreamChild extends IceCreame {

	private String shopName;
	private int cost;

	public IceCreamChild(String name, String shopName, int cost) {
		super(name);
		this.shopName = shopName;
		this.cost = cost;
	}

	public void display() {
		super.display();
		System.out.println("shopName:" + shopName + " " + " cost:" + cost);
	}

}
