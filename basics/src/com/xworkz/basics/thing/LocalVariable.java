package com.xworkz.basics.thing;

public class LocalVariable {
	
	public static String brand() {
		String brand="hight";
		return brand;
	}

	public static void main(String[] args) {
		
//		Non-Static 
		
		String name="shree";
		
		System.out.println(name);
		
		System.out.println(brand());
		
	}
}
