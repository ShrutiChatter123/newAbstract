package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SplitMethodsbyUsingForeachloop {

	public static void main(String[] args) {

		Collection<String> mail = new ArrayList<>();
		mail.add("Shruchatter79136@gmail.com");
		mail.add("kavya@gmail.com");
		mail.add("shilpa123@gmail.com");
		mail.add("maliyappa77@gmail.com");
		mail.add("nagammma988@gmail.com");
		mail.add("jane.doe@outlook.com");
		mail.add("shru.smc@outlook.com");
		mail.add("kavya.kavya@xworkz.com");

		mail.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		System.out.println("-------------unique domain by using forloop--------------------");
		Collection<String> unique = new ArrayList<>();
		for (String loop : mail) {
			String[] ref = loop.split("@");
			if (ref.length > 1) {
				unique.add(ref[1]);
			}
		}
		System.out.println(unique);

		System.out.println("-------unique way to fetch the split---------");
		mail.stream().map(s -> s.split("@")[1]).collect(Collectors.toList()).forEach(s -> System.out.println(s));

		System.out.println("-----------without unique domain------------------");
		Collection<String> nonunique = new ArrayList<>();
		for (String loop : mail) {
			String[] ref = loop.split("@");
			if (ref.length > 1) {
				nonunique.add(ref[0]);
			}

		}
		System.out.println(nonunique);

		System.out.println("----------unique way to fetch the split----------------");
		mail.stream().map(s -> s.split("@")[0]).collect(Collectors.toList()).forEach(s -> System.out.println(s));

		System.out.println("----------onlu gmail--------------");
		Collection<String> onlygmail = new ArrayList<>();
		for (String loop : mail) {
			if (loop.endsWith("gmail.com")) {
				onlygmail.add(loop);
			}
		}
		System.out.println(onlygmail);

		System.out.println("-----------unique way--------------------");
		mail.stream().filter(s -> s.contains("gmail.com")).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));

		System.out.println("-----------only outlook----------------------");
		Collection<String> onlyout = new ArrayList<>();
		for (String loop : mail) {
			if (loop.endsWith("outlook.com")) {
				onlyout.add(loop);
			}
		}
		System.out.println(onlyout);

		System.out.println("----------unique wat--------------");
		mail.stream().filter(s -> s.contains("outlook.com")).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));

		System.out.println("==========not gmail&& not outlook===============");
		Collection<String> notgmailout = new ArrayList<>();
		for (String loop : mail) {
			if (!loop.endsWith("gmail.com") && !loop.endsWith("outlook.com")) {
				
			notgmailout.add(loop);
		}
		}
		System.out.println(notgmailout);

		System.out.println("--------------unique way------------------");
		mail.stream().filter(s->!s.contains("gmail.com")&&!s.contains("outlook.com")).forEach(s->System.out.println(s));
		
		
		
		
		
		
	}
}
