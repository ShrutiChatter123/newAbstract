package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamSchedule {

	public static void main(String[] args) {

		Collection<Integer> exam=new ArrayList<Integer>();
		exam.add(5);
		exam.add(7);
		exam.add(8);
		exam.add(10);
		exam.add(11);
		exam.add(17);
		exam.add(19);
		exam.add(21);
		exam.add(24);
		exam.add(29);
		exam.add(null);
		exam.add(null);
		
		System.out.println("size of the schedule element:"+exam.size());
		
		System.out.println("for ech loop********************************");
		for(Integer loop:exam) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("Using iterator+============================");
		Iterator<Integer>ExamSchedule=exam.iterator();
		while(ExamSchedule.hasNext()) {
			Integer obj=ExamSchedule.next();
			if(Objects.isNull(obj)) {
				ExamSchedule.remove();
			}
		}
		System.out.println(exam);
		System.out.println("exam sizes:"+exam.size());
	}

}
