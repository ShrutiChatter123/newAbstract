package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class EmailIdsRunner {

	public static void main(String[] args) {

		Collection<String> mail = new ArrayList<>();
		mail.add("Shruchatter79136@gmail.com");
		mail.add("kavya@gmail.com");
		mail.add("shilpa123@gmail.com");
		mail.add("maliyappa77@gmail.com");
		mail.add("nagammma988@gmail.com");
		mail.add("jane.doe@outlook.com");
		mail.add("shru.smc@outlook.com");
		mail.add("kavy.xyz@outlook.com");
		mail.add("saksh.ytr@outlook.com");
		mail.add("ghty.sak@outlook.com");
		mail.add("shru.maliyappa@yahoo.com");
		mail.add("shri.shree@yahoo.com");
		mail.add("muttu.gyt@yahoo.com");
		mail.add("shreedhar.shree@yahoo.com");
		mail.add("shilpa.shree@yahoo.com");
		mail.add("shrutichatter@xworkz.com");
		mail.add("madhu.@Xworkz.com");
		mail.add("bhanu.123@xworkz.com");
		mail.add("sakshi.cg@xworkz.com");
		mail.add("manjulahuded@xworkz.com");
		mail.add("gayiss@xworkz.com");
		mail.add("abhi n.nayak@xworkz.com");
		mail.add("lacchi.sahki@xworkz.com");
		mail.add("mutturaj.chatter@xworkz.com");
		mail.add("kavya.kavya@xworkz.com");

		mail.stream().map(ref -> ref.toUpperCase()).forEach(ref -> System.out.println(ref));

		System.out.println("===================unique domain==============");
		mail.stream().map(e -> e.split("@")[1]).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		System.out.println("================without unique domain================");
		mail.stream().map(e -> e.split("@")[0]).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		System.out.println("=============only gmil id==============");
		mail.stream().filter(e -> e.contains("gmail.com")).forEach(e -> System.out.println(e));

		System.out.println("=============only xworkz====================");
		mail.stream().filter(ref -> ref.contains("xworkz.com")).forEach(ref -> System.out.println(ref));

		System.out.println("===========not gmail& not xworkz================");
		mail.stream().filter(ref -> !ref.contains("gmail.com") && !ref.contains("xworkz.com"))
				.forEach(ref -> System.out.println(ref));

	}

}
