package com.xworkz.oops.thing;

public class InterfaceDog implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("the Dog is barking");
		
	}

	@Override
	public void sleep() {
		System.out.println("the dog is slept");
		
	}

}
