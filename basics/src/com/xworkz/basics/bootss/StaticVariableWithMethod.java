package com.xworkz.basics.bootss;

public class StaticVariableWithMethod {

	static String name = "manjula";
	static int age = 10;

	public static String show(String name) {

		return name;
	}

	public static int setAge(int age) {
		return age;

	}

	public static void main(String[] args) {
		System.out.println(show("shruti"));
		System.out.println(setAge(23));

	}

}
