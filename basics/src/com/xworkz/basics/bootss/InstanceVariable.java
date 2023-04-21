package com.xworkz.basics.bootss;

import java.io.PrintStream;

public class InstanceVariable {

//	int a=50;
//	String name="Shruti";
//	
	InstanceVariable(String name,int id){
		name=name;
		id=id;
	}
	
	public static void main(String[] args) {
		
		
		
//		literal method
//		System.out.println(new InstanceVariable().a  );  
//		System.out.println(new InstanceVariable().name);
//		
//		System.out.println("==================================");
////		referance method
//		InstanceVariable var=new InstanceVariable();
//		System.out.println(var.a);
//		System.out.println(var.name);
//		
//		System.out.println("____________________________--");
////		methods initialization
//		InstanceVariable val=new InstanceVariable();
//		InstanceVariable val1=new InstanceVariable();
//		
		InstanceVariable instanceVariable= new InstanceVariable("Kaveri", 12);
		System.out.println(instanceVariable);
		
		
		
		
			}
	
}
