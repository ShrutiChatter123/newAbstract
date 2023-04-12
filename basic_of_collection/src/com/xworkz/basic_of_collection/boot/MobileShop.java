package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class MobileShop {

	public static void main(String[] args) {

		Collection<Long> ref = new ArrayList<Long>();
		ref.add(9148187206L);
		ref.add(9880840998L);
		ref.add(7760594922L);
		ref.add(9876534569L);
		ref.add(3456786788L);
		ref.add(9148187206L);
		ref.add(9880840998L);
		ref.add(7760594922L);
		ref.add(9876534569L);
		ref.add(3456786788L);
		ref.add(9148187206L);
		ref.add(9880840998L);
		ref.add(7760594922L);
		ref.add(9876534569L);
		ref.add(3456786788L);
		ref.add(9148187206L);
		ref.add(9880840998L);
		ref.add(7760594922L);
		ref.add(9876534569L);
		ref.add(3456786788L);

		System.out.println("fetching size:" + ref.size());

		long mobile = 9148187206L;
		boolean contain = ref.contains(mobile);
		System.out.println(contain);

		boolean remove = ref.remove(mobile);
		System.out.println(remove);

		Collection<Long> set = new HashSet<>(ref);
		for (Long long1 : set) {
			int accurance = Collections.frequency(ref, long1);
			System.out.println("mobileNo:" + long1 + " " + accurance);

		}

		Collection<Long> adding = new ArrayList<Long>();
		adding.add(345678988L);
		adding.add(987654387L);
		adding.add(456123887L);
		adding.add(456789987L);
		adding.add(3456987890L);

		Collection<Long> temp = new ArrayList<Long>();
		temp.add(345678988L);
		temp.add(987654387L);
		temp.add(456123887L);
		temp.add(456789987L);
		temp.add(3456987890L);

		Collection<Long> all = new ArrayList<Long>();
		all.addAll(ref);
		all.addAll(adding);
		all.addAll(temp);
		System.out.println(all);

		System.out.println("***********retainall method******************");

		Set<String> retain = new HashSet<>();
		retain.add("test1");
		retain.add("Test2");
		retain.add("Test3");
		retain.add("Test4");
		retain.add("Test5");
		retain.add("Test6");
		System.out.println(retain);

		Set<String> retain1 = new HashSet<String>();
		retain1.add("Test3");
		retain1.add("Test4");
		retain1.add("Test7");

		System.out.println(retain.retainAll(retain1));
		System.out.println(retain);

		System.out.println("**************RemoveAll method***************");

		Collection<String> remove1 = new ArrayList<>();
		remove1.add("Car");
		remove1.add("taxi");
		remove1.add("Bicycle");
		remove1.add("airCraft");
		remove1.add("scooty");
		System.out.println(remove1);

		Collection<String> remove2 = new ArrayList<>();
		remove2.add("Car");
		remove2.add("taxi");
		remove2.add("Bicycle");
		remove2.add("truck");
		remove2.add("rail");
		System.out.println(remove2);

		remove1.removeAll(remove2);
		System.out.println(remove1);

//		remove2.removeAll(remove1);
//		System.out.println(remove2);
//		

		System.out.println("******ContainsAll method********");

		Set<Integer> contains = new HashSet<Integer>();
		contains.add(101);
		contains.add(103);
		contains.add(104);
		contains.add(107);
		contains.add(110);
		System.out.println(contains);

		Set<Integer> contains1 = new HashSet<>();
		contains1.add(101);
		contains1.add(103);
		contains1.add(104);
		contains1.add(107);
		contains1.add(110);
		System.out.println(contains1);

		System.out.println(contains.containsAll(contains1));

		System.out.println("*******************ToArray method****************");

		List<String> toarray = new ArrayList<String>();
		toarray.add("kaveri");
		toarray.add("shruti");
		toarray.add("mutturaj");
		toarray.add("shilpa");
		toarray.add("shrinidhi");

		Object[] array460 = toarray.toArray();
		System.out.println(array460[0]);
		System.out.println(array460[1]);
		System.out.println(array460[2]);
		System.out.println(array460[3]);
		System.out.println(array460[4]);

		System.out.println(Arrays.toString(array460));

//		toarray witch is nothing but presence of all the element
//		must be print from first to last element print in proper sequence
//		
		System.out.println("***************for each loop*******************");
		Collection<String> happy = new ArrayList<>();
		happy.add("school");
		happy.add("collage");
		happy.add("degree");

		for (String loop : happy) {
			
			if (Objects.nonNull(loop)) {
				System.out.println(loop);
			}

		}
		System.out.println("***************itertator*****************");
		Iterator<String> java = happy.iterator();
		while(java.hasNext()) {
			String obj=java.next();
			if(Objects.isNull(obj)) {
				java.remove();
			}
			
		}
		System.out.println(remove);
		System.out.println("size of the remove:"+happy.size());

	}

}
