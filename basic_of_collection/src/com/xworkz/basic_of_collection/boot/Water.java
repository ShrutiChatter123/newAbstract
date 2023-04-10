package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Water {

	public static void main(String[] args) {

	Collection<Integer> collection=new ArrayList<Integer>();
	collection.add(1234);
	collection.add(456);
	collection.add(987);
	collection.add(987);
	collection.add(6543);
	System.out.println("taking integer:"+collection);
	System.out.println(collection.size());
	
	collection.remove(987);
	System.out.println(collection);
	System.out.println(collection.size());
	collection.clear();
	System.out.println(collection);
	
	collection.addAll(collection);
	
	
	Collection<String> icecream=new LinkedList<String>();
	icecream.add("mango");
	icecream.add("chocolate");
	icecream.add("vennila");
	icecream.add("blackcurrent");
	icecream.add("pista");
	icecream.add("mango");
	System.out.println("taking icecream:"+icecream);

	System.out.println("before removing"+icecream.size());
	icecream.remove("mango");
	
	System.out.println("after removing"+icecream.size());
	System.out.println(icecream);
	icecream.clear();
	System.out.println(icecream);
	
	

	
	
	}

}
