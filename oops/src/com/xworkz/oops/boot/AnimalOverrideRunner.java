package com.xworkz.oops.boot;

import com.xworkz.oops.thing.AnimalsOverride;
import com.xworkz.oops.thing.Dog;
import com.xworkz.oops.thing.Lion;

public class AnimalOverrideRunner {
	
		public static void main(String[] args) {
			AnimalsOverride ref=new AnimalsOverride();
			AnimalsOverride ref1=new Dog();
			AnimalsOverride ref2=new Lion();
			
			ref.makeSound();
			ref1.makeSound();
			ref2.makeSound();
		}
}
