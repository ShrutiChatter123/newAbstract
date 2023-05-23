package com.xworkz.oops.thing;

public class NullpointerException {

	public static void main(String[] args) {

//		null pointer exception is nothing but a 
//		reference wich is not pointing to any memory hear that name 
//		ref not pointing to any memeory bcz is nt in string type 

		System.out.println("null pointer exce");
		String name = null;
		try {
			System.out.println(name.toUpperCase());

		} catch (NullPointerException n) {
			System.out.println(
					"The name ref not pointing to any memory but trying with try catch to resolve null pointerException");
		}

	}

}
