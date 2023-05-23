package com.xworkz.oops.thing;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		System.out.println("airthmatic Exception started in main method");
		int a = 20, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println("the airthmatic exception is catch");
		}

		try {
			int m[] = { 10, 20, 30, 40 };
			System.out.println(m[1]+"this is arry value");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arry");
		}

		finally {
			System.out.println("This is the final block statement Closing the resource");
		}

	}

}
