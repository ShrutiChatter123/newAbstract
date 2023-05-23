package com.xworkz.oops.thing;

public class PolymorphismOverLoading {
	
//	polymorphism single action in many forms means output
//	by providing different args and return type this is the 
//	clear exmpl for polyOverload method

	public void add(int a, int b) {
		System.out.println("getting first add method in poly:" + a + " " + b);
	}

	public int add(int a, int b, int c) {
		System.out.println("getting int args in add method:" + a + " "+ b + " "+c);
		return a + b + c;

	}

	public long add(long ref1, long ref2) {
		System.out.println("getting long by passing args:"+ref1 +" " +ref2);
		return ref2 + ref1;

	}

	public float add(float x, float y) {
		System.out.println("getting float by passing args:"  + x + " "+ " " +y);
		return x + y;
	}

	public double add(double d, double d1) {
		System.out.println("getting double method inadd method:"+ d +" "+d1);
		return d + d1;

	}

	public static void main(String[] args) {

		PolymorphismOverLoading ref=new PolymorphismOverLoading();
		ref.add(1, 2);
		ref.add(11, 21, 31);
		ref.add(123456L, 9876543L);
		ref.add(12.0f, 13.0f);
		ref.add(33.5D, 34.6D);
		
		
		
	}

}
