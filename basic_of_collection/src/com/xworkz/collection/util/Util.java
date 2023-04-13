package com.xworkz.collection.util;

import java.util.function.Consumer;

import com.xworkz.collection.functional.Developer;
import com.xworkz.collection.functional.Hunter;

public class Util {

	public static void test(Hunter hunter) {
		hunter.hunt(32);
	}
	
	public static void test(Developer developer)
	{
		//abstraction
		boolean value=developer.taskCompleted("Exception");
		System.out.println("value of taskCompleted"+value);
	}
	
	public static void loop(Consumer<String> consumer)
	{
		for(int i=0;i<5;i++)
		{
			consumer.accept("X-workz"+i);
		}
	}
	
	
}
