package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class PercentageRunner {

	public static void main(String[] args) {

		Collection<Double> percentages = new ArrayList<>();
		percentages.add(45.5);
		percentages.add(63.3);
		percentages.add(88.5);
		percentages.add(35.5);
		percentages.add(87.3);
		percentages.add(91.5);
		percentages.add(90.0);
		percentages.add(56.9);
		percentages.add(59.9);

		percentages.forEach(e -> System.out.println(e));
		System.out.println("mapping everything above 60");
		percentages.stream().filter(element -> element > 60).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("filtering all percentages less than 60");
		percentages.stream().filter(e -> e < 60).forEach(e -> System.out.println(e));

	}

}
