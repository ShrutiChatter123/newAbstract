package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedRunner {

	public static void main(String[] args) {
		Collection<String> mails = new ArrayList<>();
		mails.add("Shruchatter79136@gmail.com");
		mails.add("kavya@gmail.com");
		mails.add("shilpa123@gmail.com");
		mails.add("maliyappa77@gmail.com");
		mails.add("Nagammma988@gmail.com");
		mails.add("jane.doe@outlook.com");
		mails.add("shru.smc@outlook.com");
		mails.add("Kavy.xyz@outlook.com");
		mails.add("saksh.ytr@outlook.com");
		mails.add("ghty.sak@outlook.com");

		mails.forEach(e -> System.out.println(e));
		System.out.println("sorted ..");
		mails.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).
		forEach(e -> System.out.println(e));

		
		Stream.of(1, 99, 300, 45, 765, 89, 99, 34, 56, 78, 45, 33).collect(Collectors.toList()).stream()
				 .collect(Collectors.toSet())
				.stream()
				.sorted((ref1, ref2) -> ref2.compareTo(ref1))
				.forEach(e -> System.out.println(e));

	}

}
