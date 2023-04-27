package com.xworkz.basics.bootss;

public class Localvariable {

	public static String Localvariable() {
		String name="kavya";
		return name;
	}
	
	public static int show() {
		int age=20;
		return age;
		
		
	}
	
	public static void main(String[] args) {
		
//		non static and localvariable;
		String name ="shruti";
		int age=22;
		
		System.out.println(name);
		System.out.println(age);
		
		
		
		System.out.println(Localvariable());
		System.out.println(show());
	}
	
}
