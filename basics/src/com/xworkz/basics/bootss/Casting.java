package com.xworkz.basics.bootss;

public class Casting {

	public static void main(String[] args) {

//		implicit conversion of data

		short s = 10;
		int a = s;
		System.out.println(a);

		byte b = 20;
		int x = b;
		System.out.println(x);

		float c = 4.5f;
		double d = c;
		System.out.println(d);

//		explicit casting convering longer datatype to smaller data type;

		double e = 9.7d;
		int m = (int) e;
		System.out.println(m);

		long n = 123456l;
		double ref = (double) n;
		System.out.println(ref);

//		string conversion
		String name = "1234";
		int g = Integer.parseInt(name);
		System.out.println(g);

//		another way to convert string
		int h = Integer.valueOf(name);
		System.out.println(h);
		
		

	}

}
