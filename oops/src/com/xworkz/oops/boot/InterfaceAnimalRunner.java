package com.xworkz.oops.boot;

import com.xworkz.oops.thing.InterfaceAnimalLion;
import com.xworkz.oops.thing.InterfaceDog;

public class InterfaceAnimalRunner {

	public static void main(String[] args) {
		InterfaceDog dog =new InterfaceDog();
		dog.sound();
		dog.sleep();
		
		InterfaceAnimalLion lion=new InterfaceAnimalLion();
		lion.sound();
		lion.sleep();
	}
}
