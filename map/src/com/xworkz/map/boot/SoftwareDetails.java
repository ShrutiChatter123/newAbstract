package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SoftwareDetails {

	public static void main(String[] args) {

		Map<String, String> software = new HashMap<>();
		software.put("wipro", "manjula");
		software.put("accenture", "shruti");
		software.put("apple", "abhi");
		software.put("google", "renu");
		software.put("pounds", "kavya");
		software.put("MI", "basavraj");
		software.put("Hp", "sheetal");
		software.put("dell", "rohini");
		software.put("crome", "akshata");
		software.put("TCS", "sakshi");
		software.put(null, null);
		software.put("yooo", null);
		System.out.println("software:" + software.size() + software);

		System.out.println("________get method____________");
		String string = software.get("apple");
		System.out.println(string);

		System.out.println("_______remove___________");
		software.remove("yooo");
		System.out.println("software:" + software.size() + software);

		System.out.println("remove with both key value");
		software.remove("dell", "rohini");
		System.out.println("software:" + software.size() + software);

		System.out.println("___________contains____________--");
		boolean b = software.containsKey("TCS");
		System.out.println(b);

		System.out.println("_________onlu key____---");
		Set<String> ref = software.keySet();
		System.out.println(ref);

		System.out.println("__________only values_____________");
		Collection<String> ref1 = software.values();
		System.out.println(ref1);
		
		
	}

}
