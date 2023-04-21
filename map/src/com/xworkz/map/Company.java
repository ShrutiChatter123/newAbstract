package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {

	public static void main(String[] args) {
		
		Map<String, String> cpompany = new HashMap<>();
		cpompany.put("Accenture", "banglore");
		cpompany.put("TCS", "bagalkot");
		cpompany.put("Amazon", "sell");
		cpompany.put("IBM", "luggins");
		cpompany.put("Delotte", "sitting chair");
		cpompany.put("Capgimini", "faicial");
		cpompany.put("wipro", "saree");
		cpompany.put("Infosys", "shoes");
		cpompany.put("Samsung", "soaps");
		cpompany.put("BMC Software", "jockets");
		cpompany.putIfAbsent(null, "String");
		cpompany.put(null, null);
		System.out.println(cpompany);

		System.out.println("=========get=========");
		String name = cpompany.get("Infosys");
		System.out.println(name);

		System.out.println("==========remove============");
		cpompany.remove("BMC Software");
		System.out.println(cpompany);

		System.out.println("=========set============");
		Set<String> set = cpompany.keySet();
		System.out.println(set);

		System.out.println("==========replace===========");
		boolean bee = cpompany.replace("Samsung", "soaps", "nailpaint");
		System.out.println("bee:" + bee);

		System.out.println("==========Contains===========");
		boolean contains = cpompany.containsKey("wipro");
		System.out.println(contains);

		System.out.println("=========clear all===========");
		cpompany.clear();
		System.out.println(cpompany);

	}
}
