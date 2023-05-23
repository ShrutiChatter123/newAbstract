package com.xworkz.oops.thing;

public class NullPointerExceptionExpm {

	public static void main(String[] args) {
		String name= "abc123";
		try {
			
		
		int num=Integer.valueOf(name);
		System.out.println(name);
		
		}
		catch(NumberFormatException n) {
			System.out.println("method ended");
		}
	
	}
	
	
}
