package com.xworkz.collection.Runner;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.GroceryDTO;

public class AllRunner {

	public static void main(String[] args) {
// Un-ordered
		Set<GroceryDTO> gro = new TreeSet();
		gro.add(new GroceryDTO(1, "coocking oil", 54, 500d));
		gro.add(new GroceryDTO(2, "sugar", 34, 600d));
		gro.add(new GroceryDTO(3, "lemonpowder", 14, 50d));
		gro.add(new GroceryDTO(4, "coffiepowder", 73, 250d));
		gro.add(new GroceryDTO(5, "nirma soap", 23, 270d));
		gro.add(new GroceryDTO(1, "milkpowder", 89, 180d));
		gro.add(new GroceryDTO(1, "milkpowder", 89, 180d));

		gro.forEach(g -> System.out.println(g));
		
		//gro.stream().sorted().forEach(g->System.out.println(g));
	}

}
