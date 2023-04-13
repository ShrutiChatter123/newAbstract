package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.util.Util;

public class PoliticalRunner {

	public static void main(String[] args) {

		Collection<String> parties = new ArrayList<>();
		parties.add("Bjp");
		parties.add("Congress");
		parties.add("JDS");
		parties.add("JDU");
		parties.add("Aap");
		parties.add("UPP");

		// for each loop, for each method , iterator, stream or parallel

		System.out.println("for each method.....");

		Collection<String> convertedParties = new ArrayList<>();
		parties.forEach((element) -> {
			System.out.println(element.toUpperCase());
			convertedParties.add(element.toUpperCase());
		});

		System.out.println("Paries with upper case...");
		convertedParties.forEach(ref -> System.out.println(ref));

		// stream

		System.out.println("converion using streams...");
		parties
				.stream()
				.map(element -> element.toUpperCase())
				.collect(Collectors.toList())
				.forEach(e->System.out.println(e));

	}
}
