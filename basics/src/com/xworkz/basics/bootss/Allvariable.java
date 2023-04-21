package com.xworkz.basics.bootss;

public class Allvariable {

	int id=12;
	
	static String names="Kaveri";
	
	
	public static void main(String[] args) {
		
		String name="Shruti";
		
		
		
		
//		instance variable
		Allvariable allvariable= new Allvariable();
		System.out.println(allvariable.id);    
		
//		local variable
		System.out.println(name);
		
//		Static variable
		System.out.println(names);
	}
	
	
	
}
