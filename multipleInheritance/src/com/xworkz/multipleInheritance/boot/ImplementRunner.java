package com.xworkz.multipleInheritance.boot;

import com.xworkz.multipleInheritance.thing.implementer;

public class ImplementRunner {

	public static void main(String[] args) {

		implementer imp=new implementer();
	     String ref=imp.citizen();
		 System.out.println(ref);
		 
		System.out.println(imp.criminalRecord());
		System.out.println(imp.followStanderds());
		System.out.println(imp.jail());
		System.out.println(imp.maxGoldLimit());
		System.out.println(imp.minAmount());
		System.out.println(imp.stayinHotel());
		System.out.println(imp.underStandingConcepts());
	}

}
