package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class PpRunner {

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

		System.out.println("**********************unique domain**********************");

		Collection<String> uniqueDomain = new HashSet<>();
		for (String emailCollection : mail) {
			String[] parts = emailCollection.split("@");
			if (parts.length > 1) {
				uniqueDomain.add(parts[1]);
			}
		}
		System.out.println("unique domai:");
		System.out.println(uniqueDomain);

		System.out.println("*******************without unique domain****************");
		List<String> noDomainEmails = new ArrayList<>();
		for (String emailCollection1 : mail) {
			noDomainEmails.add(emailCollection1.split("@")[0]);
		}
		System.out.println("Emails without domain");
		System.out.println(noDomainEmails);

		System.out.println("*****************only gmail******************");

		List<String> onlygmail = new ArrayList<>();
		for (String yesgmail : mail) {
			if (yesgmail.endsWith("@gmail.com")) {
				onlygmail.add(yesgmail);
			}
			
			
		}
		System.out.println("onlyg mail");
		System.out.println(onlygmail);

		System.out.println("***************only xworkz**********************");

		List<String> xworkz = new ArrayList<>();
		for (String onlyXworkz : mail) {
			if (onlyXworkz.endsWith("@xworkz.com")) {
				xworkz.add(onlyXworkz);
			}
		}
		System.out.println("xworkz");
		System.out.println(xworkz);

		System.out.println("*****************not gmail& not xworkz****************");
		List<String> notGmailandXwporkz = new ArrayList<>();
		for (String not : mail) {
			if (!not.endsWith("@gmail.com") && !not.endsWith("xworkz.com")) {
				notGmailandXwporkz.add(not);
			}
		}
		System.out.println("email that are not with gmail and xworkz");
		System.out.println(notGmailandXwporkz);
		
		
	}

}
