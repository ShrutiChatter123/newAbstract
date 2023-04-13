package com.xworkz.collection.Runner;

import com.xworkz.collection.util.Util;

public class DeveloperRunner {

	public static void main(String[] args) {

		Util.test((name) -> {
			System.out.println("name " + name);
			if (name != null && name.length() > 3 && "Exception".equals(name)) {
				System.out.println("Task passed is exception");
				return true;
			}
			return false;
		});

	}

}
