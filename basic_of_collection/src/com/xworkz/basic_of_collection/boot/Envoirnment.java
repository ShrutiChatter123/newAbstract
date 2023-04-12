package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Envoirnment {

	public static void main(String[] args) {

		Collection<String> exam = new ArrayList<>();
		exam.add("khoKho");
		exam.add("kabaddi");
		exam.add("relay");
		exam.add("running");

		for (String loop : exam) {
			if (Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("********iterator***************");
		Iterator<String>temp=exam.iterator();
		while (temp.hasNext()) {
			String obj =  temp.next();
			if(Objects.isNull(obj)) {
				temp.remove();
			}
		}
		System.out.println(exam);
		System.out.println("size of theremove:"+exam.size());
		
		System.out.println("******************contains**************");
		
		Collection<Long> ref= new ArrayList<>();
		ref.add(456789876L);
		ref.add(987654345L);
		ref.add(45672898L);
		ref.add(923456987L);
		ref.add(456789876L);
		ref.add(987654345L);
		ref.add(45672898L);
		ref.add(923456987L);
		ref.add(456789876L);
		ref.add(987654345L);
		ref.add(45672898L);
		ref.add(923456987L);

		System.out.println("fetching size:"+ref.size());
		
		long mobile=456789876;
		boolean contain=ref.contains(mobile);
		System.out.println(contain);
		
		boolean remove=ref.remove(mobile);
		System.out.println(remove);
		
		Collection<Long>set=new HashSet<>(ref);
		for(Long long1:set) {
			int accurance=Collections.frequency(ref, long1);
			System.out.println("mobileNo:"+ long1 + " " + accurance);
		}
		
		System.out.println("******************addall method************");
		
		Collection<String> add=new ArrayList<>();
		add.add("shruti");
		add.add("kavita");
		add.add("nagamma");
		
		Collection<String> add1=new ArrayList<>();
		add1.add("ramesh");
		add1.add("maliyappa");
		add1.add("rachappa");
		
		System.out.println(add.addAll(add1));
		System.out.println(add);
		
		System.out.println("*************ContainsAll*****************");
		
		Collection<Long> temp1=new ArrayList<>(); 
		temp1.add(456789L);
		temp1.add(987698754L);
		temp1.add(45678098L);
		temp1.add(5678765L);
		
		Collection<Long> temp2=new ArrayList<>();
		temp2.add(456789L);
		temp2.add(987698754L);
		temp2.add(45678098L);
		
		
		System.out.println(temp1.containsAll(temp2));
		
		
		System.out.println("*************remove all method*****************");
		
		Set<String> move=new LinkedHashSet<>();
		move.add("khoko");
		move.add("kabaddi");
		move.add("relay");
		
		Set<String> move1=new HashSet<>();
		move1.add("kabaddi");
		move1.add("lagori");
		move1.add("hokey");
		
		move.removeAll(move1);
		System.out.println(move);
		
		System.out.println("***************retainAll****************");
		Set<String> r=new LinkedHashSet<>();
		r.add("khoko");
		r.add("kabaddi");
		r.add("relay");
		
		Set<String> r1=new HashSet<>();
		r1.add("kabaddi");
		r1.add("lagori");
		r1.add("hokey");
		System.out.println(r.retainAll(r1));
		System.out.println(r);
	
		System.out.println("*************toArray*****************");
		
		List<String>array=new ArrayList<>();
		array.add("shruti");
		array.add("swati");
		array.add("kshna");
		array.add("shreenidhi");
		
		Object[] obj= array.toArray();
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		
		System.out.println(Objects.toString(array));
		
		
		System.out.println("*************** another  arry*****************");
		List<String>nextArray=new ArrayList<>();
		nextArray.add("shruti");
		nextArray.add("swati");
		nextArray.add("kshna");
		nextArray.add("shreenidhi");
		
		Object[] obj1= array.toArray();
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		Object[] array2 = nextArray.toArray(obj1);
		System.out.println(array2);		
		
		
	}
	
	
	
	
	

}
