package com.xworkz.basics.bootss;

public class StaticVariableWithConstruc {

	static String name;
	static int age;
	
	 StaticVariableWithConstruc(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		StaticVariableWithConstruc ref =new StaticVariableWithConstruc("shruti", 23);
		System.out.println(StaticVariableWithConstruc.name);
		System.out.println(StaticVariableWithConstruc.age);
	}
	
	
}
