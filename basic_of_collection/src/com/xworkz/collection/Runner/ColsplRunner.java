package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.CollectionAllSplMethods;

public class ColsplRunner {

	public static void main(String[] args) {
		
		Collection<CollectionAllSplMethods> list=new ArrayList<>();
		
		list.add(new CollectionAllSplMethods("pradip havldar", 53, "Nippani", "BJP", false, "Male"));
		list.add(new CollectionAllSplMethods("Shashi", 67, "Nippani", "INC", false, "Female"));
		list.add(new CollectionAllSplMethods("Salshi", 46, "gadag", "JDS", false, "Female"));
		list.add(new CollectionAllSplMethods("Shashikala jolle", 30, "Bagalkot", "BJP", false, "Male"));

		System.out.println(list.size());
		
		list.stream().filter(s->s.getAge()>50).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		System.out.println("-----------less than 50--------------------");
		
		list.stream().filter(s->s.getAge()<50).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		System.out.println("-----------contains female-----------------");
		list.stream().filter(e->e.getGender().contains("Female")).collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println("---------------contains male-----------------");
		list.stream().filter(s->s.getGender().contains("Male")).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		System.out.println("-----------shortning in desc-----------------");
		
		list.stream().sorted((ref2,ref1)->ref2.getName().compareTo(ref1.getName())).forEach(ref->System.out.println(ref));
		
		System.out.println("------------sortning in ascending-----------------");
		
		list.stream().sorted((ref1,ref2)->ref1.getParty().compareTo(ref2.getParty())).forEach(e->System.out.println(e));
		
		System.out.println("------------unique party-----------------");
		list.stream().map(s->s.getParty()).collect(Collectors.toList()).forEach(s->System.out.println(s));
	
	
	}
}
