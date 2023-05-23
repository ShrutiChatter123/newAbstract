package com.xworkz.oops.thing;

public class throwRunner {

	public static void main(String[] args) throws MyCustomException {

		int a = 10;

		if (a < 10 || a > 23) {
			throw new MyCustomException("a is greter than 10");
		}
		
		
		System.out.println("a:" + a);

	}
}