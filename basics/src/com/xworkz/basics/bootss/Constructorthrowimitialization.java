package com.xworkz.basics.bootss;

public class Constructorthrowimitialization {

	private int id;
	private String name;

	Constructorthrowimitialization(int id, String name) {

		this.id = id;
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		
		Constructorthrowimitialization exmp=new Constructorthrowimitialization(1, "kaveri");
		Constructorthrowimitialization exmp1=new Constructorthrowimitialization(2, "mutturaj");
		System.out.println(exmp.id );
		System.out.println(exmp.name);
		
	}

}
