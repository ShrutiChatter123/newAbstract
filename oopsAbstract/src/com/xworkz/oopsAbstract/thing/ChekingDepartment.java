package com.xworkz.oopsAbstract.thing;

public abstract class ChekingDepartment implements Project {

	public abstract void process();

	
	public void endDate() {
		System.out.println("near date");	
	}

	public void investigation() {
	System.out.println("Running in investigation");		
	}

}
