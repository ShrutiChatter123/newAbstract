//package com.xworkz.collection.Runner;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class PracticeRunner {
//
//	public static void main(String[] args) {
//		
//		Collection<String> mail=new ArrayList<>();
//		mail.add("Shruchatter79136@gmail.com");
//		mail.add("kavya@gmail.com");
//		mail.add("shilpa123@gmail.com");
//		mail.add("maliyappa77@gmail.com");
//		mail.add("nagammma988@gmail.com");
//		mail.add("jane.doe@outlook.com");
//		mail.add("shru.smc@outlook.com");
//		mail.add("kavy.xyz@outlook.com");
//		mail.add("saksh.ytr@outlook.com");
//		mail.add("ghty.sak@outlook.com");
//		mail.add("shru.maliyappa@yahoo.com");
//		mail.add("shri.shree@yahoo.com");
//		mail.add("muttu.gyt@yahoo.com");
//		mail.add("shreedhar.shree@yahoo.com");
//		mail.add("shilpa.shree@yahoo.com");
//		mail.add("shrutichatter@xworkz.com");
//		mail.add("madhu.@Xworkz.com");
//		mail.add("bhanu.123@xworkz.com");
//		mail.add("sakshi.cg@xworkz.com");
//		mail.add("manjulahuded@xworkz.com");
//		mail.add("gayiss@xworkz.com");
//		mail.add("abhi n.nayak@xworkz.com");
//		mail.add("lacchi.sahki@xworkz.com");
//		mail.add("mutturaj.chatter@xworkz.com");
//		mail.add("kavya.kavya@xworkz.com");
//		
//		mail.stream().map(element->element.toUpperCase()).forEach(element->System.out.println(element));
//		
//		Collection<String> uniquedomain=new ArrayList<>();
//		for(String loop:mail) {
//			String [] ref=loop.split("@");
//			if(ref.length>1) {
//				uniquedomain.add(ref[1]);
//			}
//		}
//		System.out.println("unique domain");
//		System.out.println(uniquedomain);
//		
//		System.out.println("***************no domain**********************");
//		List<String>noDomain=new ArrayList<>();
//		for(String loop:mail) {
//			noDomain.add(loop.split("@")[0]);
//		}
//		System.out.println("no domain");
//		System.out.println(noDomain);
//		
//		System.out.println("*******************only gmail*****************");
//		Collection<String>onlyGmail=new ArrayList<>();
//		for(String loop:mail) {
//			if(loop.endsWith("@gmail.com")) {
//				onlyGmail.add(loop);
//			}
//		}
//		System.out.println("only gmail.com");
//		System.out.println(onlyGmail);
//		
//		
//		Collection<String>onlyXworkz=new ArrayList<>();
//		for(String loop:mail) {
//			if(loop.endsWith("@xworkz.com")) {
//				onlyXworkz.add(loop);
//			}
//		}
//		System.out.println("onlyXworkz");
//		System.out.println(onlyXworkz);
//		
//		System.out.println("print not gmail and xworkz");
//		List<String>notgmailandxworkz=new ArrayList<>();
//		for(String loop:mail) {
//			if(!loop.endsWith("@gmail.com")&&!loop.endsWith("@xworkz.com")) {
//				notgmailandxworkz.add(loop);
//			}
//		}
//		System.out.println("notgmailandxworkz");
//		System.out.println(notgmailandxworkz);
//		
//	}
//}
