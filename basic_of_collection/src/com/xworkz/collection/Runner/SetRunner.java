package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetRunner {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Rajkumar");
		names.add("Shivaraj RK");
		names.add("Ragavendra RK");// Vinod RK
		names.add("Puneeth RK");
		names.add("Rajkumar");
		names.add("Rajkumar");
		names.add("Rajkumar");
		names.add("Rajkumar");
		names.add("Puneeth RK");

		names.forEach(n -> System.out.println(n));

		String name = names.get(3);
		names.add(2, "Vinod RK");

		System.out.println(name);
		names.remove(0);

		names.set(1, "NEW SRK");
		System.out.println("add at index 2");
		names.forEach(n -> System.out.println(n));

		System.out.println("SSSSSSSSSSSSSSSSEEEEEEEEEEEEEEEEETTTTTTTTTTTTTTTTTT");
		
		Set<Integer> boysWaistSize=new HashSet<>();
		boysWaistSize.add(34);
		boysWaistSize.add(32);
		boysWaistSize.add(36);
		boysWaistSize.add(32);
		boysWaistSize.add(30);
		boysWaistSize.add(38);
		

		boysWaistSize.forEach(s->System.out.println(s));
		
	
	}

}
