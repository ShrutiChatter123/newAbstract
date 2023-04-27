package com.xworkz.basics.bootss;

public class InstanceVariableWithMethod {

	private String name;
	private int age;

	public static String instancemethod() {
		return "shree";
	}

	public static int show() {
		return 23;

	}

	public static void main(String[] args) {

		InstanceVariableWithMethod ref = new InstanceVariableWithMethod();
		System.out.println(ref.instancemethod());
		System.out.println(ref.show());
	}

}
