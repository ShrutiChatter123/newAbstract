package com.xworkz.oops.thing;

public class EarthmaticException {

	public static void main(String[] args) {

		System.out.println("main method started");
		int a = 20, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println("Earthmatic exception can not devide by 0");
		}

	}
}
