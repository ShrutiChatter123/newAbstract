package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class CollectionAllMethods {

	public static void main(String[] args) {

		Collection<Long> ref = new ArrayList<>();
		ref.add(1234567L);
		ref.add(9876543L);
		ref.add(745678890L);
		ref.add(789009234L);
//		System.out.println(ref);
		System.out.println("size:" + ref.size() + ref);

		System.out.println("-------------contains method--------------");
//		contains and remove methods internally check the equal method
		long mobile = 1234567L;
		boolean contain = ref.contains(mobile);
		System.out.println(contain);

		System.out.println("---------------remove method----------------");
		boolean remove = ref.remove(mobile);
		System.out.println(remove);

		System.out.println("----------accurance method-------------");
		Collection<Long> sys = new HashSet<>(ref);
		for (Long long1 : sys) {
			int value = Collections.frequency(ref, long1);
			System.out.println("mobileNo:" + " : " + long1 + " : " + value);
		}

		System.out.println("--------------Add all method-------------------");
		Collection<String> string = new ArrayList<>();
		string.add("shruti");
		string.add("kavita");
		string.add("muttu");

		Collection<String> name = new ArrayList<>();
		name.add("nagamma");
		name.add("maliyappa");
		name.add("Shilpa");
		name.add("shreenidhi");
		name.add("shreedhar");

		Collection<String> addall = new ArrayList<>();
		addall.addAll(string);
		addall.addAll(name);
		System.out.println(addall);

		System.out.println("----------retain all method-----------------");

		Set<String> retain = new HashSet<>();
		retain.add("swwet");
		retain.add("lemon");
		retain.add("pepper");
		System.out.println(retain);

		Set<String> retain1 = new HashSet<>();
		retain1.add("coffie");
		retain1.add("tea");
		retain1.add("chaha");
		retain1.add("lemon");
		System.out.println(retain1);

		System.out.println(retain.retainAll(retain1));
		System.out.println(retain);

//		ref 1 allirod 2 alli eddiddanna mathra tagiyatte

		System.out.println("-----------remove all-----------------");

		Set<String> remo = new HashSet<>();
		remo.add("swwet");
		remo.add("lemon");
		remo.add("pepper");
		System.out.println(remo);

		Set<String> remo1 = new HashSet<>();
		remo1.add("coffie");
		remo1.add("tea");
		remo1.add("chaha");
		retain1.add("lemon");
		System.out.println(remo1);

		remo.removeAll(remo1);
		System.out.println(remo);

//		remove method ref nallirod element erodanna mathata tagiyaatte

		System.out.println("------------contains all method--------------------");

		Set<String> contains = new HashSet<>();
		contains.add("swwet");
		contains.add("lemon");
		contains.add("pepper");
		System.out.println(contains);

		Set<String> contains1 = new HashSet<>();
		contains1.add("swwet");
		contains1.add("lemon");
		contains1.add("pepper");
		System.out.println(contains1);

		System.out.println(contains.containsAll(contains1));
		System.out.println(contains);

//		all the element both ref nalli presence eddaga true agaatte otherwise no

		System.out.println("-------------to arry-------------------");
		Collection<String> arry = new ArrayList<>();
		arry.add("shreenidhi");
		arry.add("pavan");
		arry.add("sannidhi");
		arry.add("basu");
		arry.add("laxmi");

		Object[] toarrya = arry.toArray();
		System.out.println(toarrya[0]);
		System.out.println(toarrya[1]);
		System.out.println(toarrya[2]);
		System.out.println(toarrya[3]);
		System.out.println(toarrya[4]);

		System.out.println(Arrays.toString(toarrya));

		System.out.println("--------------for each loop in arry-------------------");

		Collection<String> happy = new ArrayList<>();
		happy.add("smily");
		happy.add("sady");
		happy.add("queen");

		Object[] obj = happy.toArray();

		for (String loop : happy) {

			if (Objects.nonNull(loop)) {

				System.out.println(loop);
			}
		}
		System.out.println("====================iterator method ====================");

		Iterator<String> java = happy.iterator();
		while (java.hasNext()) {
			String type =  java.next();
			if (Objects.isNull(type)) {
				java.remove();
			}
		}
		System.out.println(remove);
		System.out.println("size of the remove:"+happy.size());
	}
	

}
