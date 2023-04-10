package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendanceSheet {

	public static void main(String[] args) {
		
		
		Collection<String> name=new ArrayList<String>();
		name.add("shruti");
		name.add("abhi");
		name.add("kaveri");
		name.add("mutturaj");
		name.add("shilpa");
		name.add("shreenidhi");
		name.add("pavan");
		name.add("sanidhi");
		name.add("karthik");
		name.add("sakshi");
		name.add(null);
		name.add(null);
		name.add(null);
		
		System.out.println("size of the element "+name.size());
		
		for(String loop:name) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("*****************************");
		Iterator<String>AttendanceSheet=name.iterator();
		while(AttendanceSheet.hasNext()) {
			String obj=AttendanceSheet.next();
			if(Objects.isNull(obj)) {
				AttendanceSheet.remove();
			}
		}
		System.out.println(name);
		System.out.println("name size:"+name.size());
		
	}
	
	
}
