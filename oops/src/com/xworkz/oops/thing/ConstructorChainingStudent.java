package com.xworkz.oops.thing;

public class ConstructorChainingStudent extends ConstructorChaining {

	 private String fatherName;

	public ConstructorChainingStudent(String name, int cost, String fatherName) {

		super(name,cost);
		this.fatherName = fatherName;
		System.out.println(fatherName);
	}

	public void display() {
		System.out.println("fatherName:"+fatherName);
	}
	
}
