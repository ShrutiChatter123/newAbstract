package com.xworkz.oops.boot;

import com.xworkz.oops.thing.AbstractAnimalDog;
import com.xworkz.oops.thing.AbstractAnimalLion;

public class AbstractAnimalRunner {

	public static void main(String[] args) {
		AbstractAnimalDog dog=new AbstractAnimalDog();
		dog.makingSound();
		
		AbstractAnimalLion lion=new AbstractAnimalLion();
		lion.makingSound();
		
		dog.alive();
	}
}
