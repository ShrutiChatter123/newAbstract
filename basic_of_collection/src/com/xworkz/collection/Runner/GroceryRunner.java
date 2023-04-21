package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import com.xworkz.collection.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {

		Set<GroceryDTO> gro = new HashSet<>();
		gro.add(new GroceryDTO(1, "coocking oil", 54, 500d));
		gro.add(new GroceryDTO(2, "sugar", 34, 600d));
		gro.add(new GroceryDTO(3, "lemonpowder", 14, 50d));
		gro.add(new GroceryDTO(4, "coffiepowder", 73, 250d));
		gro.add(new GroceryDTO(5, "nirma soap", 23, 270d));
		gro.add(new GroceryDTO(1, "milkpowder", 89, 180d));
		gro.forEach(s -> System.out.println(s));

		System.err.println("******************convert set to list using stream********************");
		List<GroceryDTO> list = gro.stream().collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));


		List<GroceryDTO> list1 = new ArrayList<>();
		list1.add(new GroceryDTO(0, "vanish powder", 77, 500d));
		list1.add(new GroceryDTO(1, " powder", 78, 501d));
		list1.add(new GroceryDTO(2, "potato", 87, 500d));
		list1.add(new GroceryDTO(3, "tomato", 55, 50d));
		list1.add(new GroceryDTO(4, "brinjal", 85, 52d));
		list1.add(new GroceryDTO(5, "bottle", 74, 65d));
		System.out.println("   ");

		System.out.println("Get method   ");
		GroceryDTO groceryDTO = list1.get(5);
		System.out.println(groceryDTO);
	

		System.out.println("***************Set method*****************");
		GroceryDTO set = list1.set(2, new GroceryDTO(6, "soap", 88, 56d));
		list1.forEach(s->System.out.println(s));

	
		System.out.println("******Addall************");

		List<GroceryDTO> list2 = new ArrayList<>();
		list2.add(new GroceryDTO(0, "vanish powder", 77, 500d));
		list2.add(new GroceryDTO(1, " powder", 78, 501d));
		list2.add(new GroceryDTO(2, "potato", 87, 500d));
		list2.add(new GroceryDTO(3, "tomato", 55, 50d));
		list2.add(new GroceryDTO(4, "brinjal", 85, 52d));
		list2.add(new GroceryDTO(5, "bottle", 74, 65d));
		System.out.println("   ");
		List<GroceryDTO> list3 = new ArrayList<>();
		list3.addAll(0, list1);
		list3.addAll(1, list2);
		list3.forEach(s -> System.out.println(s));

		System.out.println("*************remove with index***************");
		list2.remove(1);
		list2.forEach(s -> System.out.println(s));

		System.out.println("=================reverse direction+=====================");
		ListIterator<GroceryDTO> listit = list2.listIterator(list2.size());
		while (listit.hasPrevious()) {
			GroceryDTO groceryDTO2 = (GroceryDTO) listit.previous();
			System.out.println(groceryDTO2);

		}
		
		System.out.println("**********adding element over itoration*************");
//		making th
	
		ListIterator<GroceryDTO>listit1=list2.listIterator(2);
		listit1.add(new GroceryDTO(19,"palm oil",100,500d));list2.forEach(s->System.out.println(s));

		
		
	}

}
