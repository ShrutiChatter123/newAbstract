package com.xworkz.collection.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.collection.dto.AnimalDTO;

public class AnimalRunner {

	public static void main(String[] args) {

		AnimalDTO animalDTO = new AnimalDTO("Tiger");
		AnimalDTO animalDTO1 = new AnimalDTO("Lion");
		AnimalDTO animalDTO2 = new AnimalDTO("Dog");
		AnimalDTO animalDTO3 = new AnimalDTO("Dinosaur");
		AnimalDTO animalDTO4 = new AnimalDTO("Giraffee");

		List<AnimalDTO> animalDTOs = new ArrayList<>();
		animalDTOs.add(animalDTO);
		animalDTOs.add(animalDTO1);
		animalDTOs.add(animalDTO2);
		animalDTOs.add(animalDTO3);
		animalDTOs.add(animalDTO4);
		animalDTOs.add(new AnimalDTO("Camel"));
		
		ListIterator<AnimalDTO> listItr = animalDTOs.listIterator(animalDTOs.size());
		
		while(listItr.hasPrevious())
		{
			AnimalDTO ele= listItr.previous();
			System.out.println(ele);
			if(ele.getName().equals("Camel"))
			{
				listItr.add(new AnimalDTO("Snake"));
			}
		}
		
		
		animalDTOs.forEach(d->System.out.println(d.getName()));

	}

}
