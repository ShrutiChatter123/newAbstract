package com.xworkz.basics.bootss;

public class StaticVariableWithRef {

	private static String name="shruti";
	private  static int age=10;
	
	
	public static void main(String[] args) {
		StaticVariableWithRef ref=new StaticVariableWithRef();
		System.out.println(StaticVariableWithRef.name);
		
		System.out.println(StaticVariableWithRef.age);
		
	}
	
}
