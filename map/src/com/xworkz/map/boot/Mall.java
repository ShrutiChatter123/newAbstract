package com.xworkz.map.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mall {

	public static void main(String[] args) {

		Map<String, String> mall = new HashMap<>();
		mall.put("manthri Square", "cloth");
		mall.put("Orion", "pants");
		mall.put("Park Square mall", "toys");
		mall.put("Garuda mall", "luggins");
		mall.put("Forum mall", "sitting chair");
		mall.put("Banglore city mall", "faicial");
		mall.put("Inorbit", "saree");
		mall.put("Pheonix", "shoes");
		mall.put("lulu", "soaps");
		mall.put("Dubai mall", "jockets");
		mall.putIfAbsent(null, "String");
		mall.put(null, null);
		System.out.println(mall);

		System.out.println("=========get=========");
		String name = mall.get("lulu");
		System.out.println(name);

		System.out.println("==========remove============");
		mall.remove("Orion");
		System.out.println(mall);

		System.out.println("=========set============");
		Set<String> set = mall.keySet();
		System.out.println(set);

		System.out.println("==========replace===========");
		boolean bee = mall.replace("Inorbit", "saree", "nailpaint");
		System.out.println("bee:" + bee);

		System.out.println("==========Contains===========");
		boolean contains = mall.containsKey("Pheonix");
		System.out.println(contains);

		System.out.println("=========clear all===========");
		mall.clear();
		System.out.println(mall);

	}

}
