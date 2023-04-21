package com.xworkz.collection.Runner;

public class Student {

	int id;
	String name;
	
	static String collage="AITM";
	
	Student(int i,String n){
		this.id=i;
		this.name=n;
		
	}
	
	void display() {
		System.out.println(id+" " + name +" "+collage);
	}
	
		
	
	
	
	
	
	
}
