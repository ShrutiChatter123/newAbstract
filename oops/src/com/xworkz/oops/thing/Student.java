package com.xworkz.oops.thing;

public class Student {

	private String name;
	private int age;
	private int id;
	
	
	public Student(String name) {
		this.name=name;
	}
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Student(int id) {
		this.id=id;
	}
	
	public void show() {
		System.out.println("name:"+ name + "age: "+age+"id:"+id);
	}
	
	public static void main(String[] args) {
		Student s=new Student("shruti");
		Student s1=new Student(1);
		Student s2=new Student("shru", 22);
	}
	
	
	
	
}




