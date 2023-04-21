package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SoftwareCourses {

	public static void main(String[] args) {

		Map<String, String> course = new HashMap<>();
		course.put("java", "shruti");
		course.put("phython", "manjula");
		course.put("webTechnology", "kavitha");
		course.put("Sql", "shanthanu");
		course.put("Map", "vinoda");
		course.put("Spring", "sakshi");
		course.put("development", "rakhi");
		course.put("Collection", "shubha");
		course.put("JDBC", "omkar");
		course.put("testing", "navaneetha");
		course.put(null, "raj");
		course.put(null, "swati");
		System.out.println(course);

		System.out.println("===============get method==============");
		String s1 = course.get("java");
		System.out.println(s1);

		System.out.println("===============remove===============");
		course.remove("java");
		System.out.println("course:" + course.size() + course);

		System.out.println("==============remove with key and value==============");
		boolean boo = course.remove("testing", "navaneetha");
		System.out.println(boo);
		System.out.println(course);

		System.out.println("===============Contains method==================");
		boolean contain = course.containsKey("JDBC");
		System.out.println(contain);

		System.out.println("============ only key Set================");
		Set<String> keyset = course.keySet();
		System.out.println(keyset);

		System.out.println("===============values================");
		Collection<String> value = course.values();
		System.out.println(value);
		
		System.out.println("==============replace method=================");
		course.replace("phython", "manjula", "shiv");
		System.out.println(course);
		
		System.out.println("============clear all===============");
		course.clear();
		System.out.println(course);
	}

}
