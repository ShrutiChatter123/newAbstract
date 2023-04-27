package com.xworkz.basics.bootss;

public class InstanceVariableWithConstructor {

	private String dogName;
	private int age;
	
	public InstanceVariableWithConstructor(String dogName, int age) {
		this.dogName = dogName;
		this.age = age;
	}
	
public static void main(String[] args) {
	 InstanceVariableWithConstructor constructor = new InstanceVariableWithConstructor("Shru", 23);
	 System.out.println(constructor.dogName);
	 System.out.println(constructor.age);
}
	
	
	
}
