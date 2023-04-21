package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.GroceryDTO;
import com.xworkz.collection.dto.StationaryDTO;

public class StationaryRunner {

	public static void main(String[] args) {
		
		Set<StationaryDTO> set=new HashSet<>();
		set.add(new StationaryDTO(1,"nailpaint","banglore",95345678345L));
		set.add(new StationaryDTO(2,"bindi","bagalkot",23458678L));
		set.add(new StationaryDTO(3,"haiband","bilgi",234586008L));
		set.add(new StationaryDTO(4,"sareepin","gadag",2345023468L));
		set.add(new StationaryDTO(5,"powder","chikkmanglur",23409678L));
		set.forEach(s->System.out.println(s));
		
		System.out.println("*********converting set to list by stream************");
		List<StationaryDTO>list=set.stream().collect(Collectors.toList());list.forEach(s->System.out.println(s));
		
		System.err.println("*********Access element index at 3*****************");
		System.out.println("index:"+list.get(3));
		
		System.err.println("Access element index at 5***************8");
		System.out.println("index:"+list.get(4));
		
		List<StationaryDTO>list1=new ArrayList<>();
		list1.add(new StationaryDTO(0,"lakme","banglore",974567896L));
		list1.add(new StationaryDTO(1,"rosewater","chickpet",974888896L));
		list1.add(new StationaryDTO(2,"eyeshadow","bengali",979997896L));
		list1.add(new StationaryDTO(3,"eyelash","bannergatta",974500096L));

		
		System.out.println("****************Set method demo******************");
		StationaryDTO seteeee=list1.set(2, new StationaryDTO(4,"sunscreen","chikkmanglur",98625278L));
		list1.forEach(s->System.out.println(s));
		
		System.out.println("***********remove with index**************");
		list1.remove(1);list1.forEach(s->System.out.println(s));
		
		List<StationaryDTO>list2=new ArrayList<>();
		list2.add(new StationaryDTO(0,"foundation","banglore",974567896L));
		list2.add(new StationaryDTO(1,"eyebrowpencil","chickpet",974888896L));
		list2.add(new StationaryDTO(2,"touchpad","bengali",979997896L));
		list2.add(new StationaryDTO(3,"eyelash","bannergatta",974500096L));

		
		
		System.out.println("**************add all method**************8");
		list2.addAll(0, list);
		list2.addAll(1, list1);
		list2.forEach(s->System.out.println(s));
		
		System.err.println("************iterator from the reverse direction*********");
		ListIterator<StationaryDTO>ref=list2.listIterator(list2.size());
		while (ref.hasPrevious()) {
			StationaryDTO stationaryDTO = (StationaryDTO) ref.previous();
			System.out.println(stationaryDTO);
		}
		
		System.out.println("+++++++++++++set method++++++++++++++++++=");
		 StationaryDTO statioary=list2.set(3, new StationaryDTO(7,"ragi","hubballi",6789987654L));
		list2.forEach(s->System.out.println(s));
		
	
		System.out.println("******8remove*");
		list1.remove(2);list1.forEach(s->System.out.println(s));
			}
		
}
