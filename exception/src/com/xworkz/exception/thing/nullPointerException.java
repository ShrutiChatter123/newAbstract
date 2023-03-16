package com.xworkz.exception.thing;

public class nullPointerException {
	public static void main(String[] args) {
		
			String name="shruti";
		try {
		System.out.println(name.toUpperCase());

		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
		System.out.println("main ended");
		
	}
	
	
	
	
	
	
	
}
