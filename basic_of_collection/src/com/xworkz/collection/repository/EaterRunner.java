package com.xworkz.collection.Runner;

import com.xworkz.collection.functional.Eater;
import com.xworkz.collection.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {

		Eater eater = (item, quantity) -> {
			System.out.println("Item:" + item);
			System.out.println("Item in lowerCase:" + item.toLowerCase());
			System.out.println("Item in upperCase:" + item.toUpperCase());
			return null;
		};
		
		EaterUtil.show(eater);
	}
}
