package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SambarPowder {

	public static void main(String[] args) {
		
		Collection<String>powder=new ArrayList<String>();
		powder.add("chakke");
		powder.add("lavanga");
		powder.add("haldi");
		powder.add("chiili");
		powder.add("sasve");
		powder.add("kotmiri");
		powder.add("garlic");
		powder.add("salt");
		powder.add("sugar");
		powder.add("katva");
		powder.add(null);
		powder.add(null);
		
		System.out.println("size of the sambarPowder:"+powder.size());
		
		System.out.println("for loop*************************");
		for(String loop:powder) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("iterator***************************");
		Iterator<String>SambarPowder=powder.iterator();
		while(SambarPowder.hasNext()) {
			String obj=SambarPowder.next();
			if(Objects.isNull(obj)) {
				SambarPowder.remove();
			}
		}
		System.out.println(powder);
		System.out.println("size of the:powder:"+powder.size());
	}
}
