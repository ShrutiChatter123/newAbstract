package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Whiskey {

	public static void main(String[] args) {
		
		Collection<String> temp=new ArrayList<String>();
		temp.add("Lagavulin");
		temp.add("Glenfiddich");
		temp.add("Ardbeg");
		temp.add("Talisker");
		temp.add("Monkey");
		temp.add("Laphroaig");
		temp.add("Jameson");
		temp.add("Glenmorangie");
		temp.add("Dalwhinnie");
		temp.add("ChivasRegal");
		temp.add(null);
		temp.add(null);
		
		System.out.println("taking size of whiskey element size:"+temp.size());
		
		System.out.println("For each loop***********************");
		for(String loop:temp) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("data Using iterator****************************");
		Iterator<String>Whiskey=temp.iterator();
		while(Whiskey.hasNext()) {
			String obj=Whiskey.next();
			if(Objects.isNull(obj)) {
				Whiskey.remove();
			}
		}
		System.out.println(temp);
		System.out.println("temp sizes:"+temp.size());
	}
	
}
