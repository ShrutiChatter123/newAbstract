package com.xworkz.basic_of_collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Moviecast {

	public static void main(String[] args) {
		
		Collection<String>movie=new ArrayList<String>();
		movie.add("Karva");
		movie.add("patan");
		movie.add("yajamana");
		movie.add("Kranthi");
		movie.add("Kabja");
		movie.add("kiccha");
		movie.add("suryavamsha");
		movie.add("sankranthi");
		movie.add("sakshi");
		movie.add("parva");
		movie.add(null);
		movie.add(null);
		movie.add(null);
		
		System.out.println("size of the movie:"+movie.size());
		
		System.out.println("for loop***********************");
		for(String loop:movie) {
			if(Objects.nonNull(loop)) {
				System.out.println(loop);
			}
		}
		System.out.println("Iterator*********************");
		Iterator<String> Moviecast=movie.iterator();
		while(Moviecast.hasNext()) {
			String obj=Moviecast.next();
			if(Objects.isNull(obj)) {
				Moviecast.remove();
			}
		}
		System.out.println(movie);
		System.out.println("size of the:"+movie.size());
		
		
		
		
	}
}
