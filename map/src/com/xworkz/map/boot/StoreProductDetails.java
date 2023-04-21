package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StoreProductDetails {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "sugar");
		map.put(103, "powder");
		map.put(122, "teapowder");
		map.put(109, "chocoo");
		map.put(99, "potato");
		map.put(110, "ghee");
		map.put(111, "milkpowder");
		map.put(787, "coffiepowder");
		map.put(989, "butter");
		map.put(765, "nuts");
		map.put(null, "payasaaa");

		System.out.println(map.get(101));
		System.out.println("______________________-");

		map.remove(101);
		System.out.println(map);

		System.out.println("__________remove_______________");
		boolean remove = map.remove(99, "potato");
		System.out.println(remove);
		System.out.println(map);

		System.out.println("_________replace_______________--");
		System.out.println(map.replace(765, "nuts", "manjula"));
		System.out.println(map);

		System.out.println("___________contains key____________");
		boolean b = map.containsKey(989);
		System.out.println(b);

		System.out.println("=========keys======");
		Set<Integer> set = map.keySet();
		System.out.println(set);

		System.out.println("=========values======");
		Collection<String> integers = map.values();
		System.out.println(integers);

		System.out.println("=====both keys and values=====");
		Set<java.util.Map.Entry<Integer, String>> set2 = map.entrySet();
		System.out.println(set2);

		System.out.println("_____________clear_____________----");
		map.clear();
		System.out.println(map);

	}
}
