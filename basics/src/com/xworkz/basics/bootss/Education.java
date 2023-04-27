package com.xworkz.basics.bootss;

public class Education {

	private static String name;
	private static int age;
	
	public static String staticmethod() {
		return "muttu";
		
	}
	
	public static int show() {
		return 23;
		
		
	}
	
	public static void main(String[] args) {
		Education education=new Education();
		System.out.println(Education.staticmethod());
		System.out.println(Education.show());
	}
	
}
