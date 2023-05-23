package com.xworkz.oops.thing;

public abstract class AbstractAnimal {

	public AbstractAnimal() {
		System.out.println("all animal sound...!");
	}

	public abstract void makingSound();

//	hear in this example we are providede concrete method as  
//	alive but that method we can not unimplement in dog and lion 
//	class  but in runner we are calling this method.soo what is the use of making 
//	this methods thats why we can not achive 100% abstraction
	public void alive() {
		System.out.println("animals are alive for a period");
	}
}
