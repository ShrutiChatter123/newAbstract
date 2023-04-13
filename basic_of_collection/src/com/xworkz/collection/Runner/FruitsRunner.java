package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FruitsRunner {

	public static void main(String[] args) {

		Collection<String> fruit = new ArrayList<>();
		fruit.add("banana");
		fruit.add("avocoda");
		fruit.add("apple");
		fruit.add("sapota");
		fruit.add("watermelon");
		fruit.add("dragan");
		fruit.add("mango");
		fruit.add("lemon");
		fruit.add("pomogranate");
		fruit.add("peach");
		fruit.add("orange");
		fruit.add("grape");
		fruit.add("Strawberry");
		fruit.add("Kiwi");
		fruit.add("Apricot");
		fruit.add("Figs");
		fruit.add("plum");
		fruit.add("GrapeFruit");
		fruit.add("BlueBerry");
		fruit.add("papaya");
		fruit.add("cherry");
		fruit.add("pineapple");
		fruit.add("Star");
		fruit.add("mulberry");
		fruit.add("cranberry");

		fruit.stream().map(element -> element.toUpperCase()).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		System.out.println("**************less than 5******************");
		fruit.stream().filter(element -> element.length() < 5).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		System.out.println("***************greater than 5*******************");
		fruit.stream().filter(element -> element.length() > 5).forEach(element -> System.out.println(element));

		System.out.println("**************grater than 10&less than 5************");
		fruit.stream().filter(element -> element.length() > 10 && element.length() < 15)
				.forEach(element -> System.out.println(element));

		
		
	}

}
