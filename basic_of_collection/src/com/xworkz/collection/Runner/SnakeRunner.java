package com.xworkz.collection.Runner;

import java.util.List;
import java.util.Optional;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.functional.SnakeDTO;
import com.xworkz.collection.repository.SnakeRepository;
import com.xworkz.collection.repository.SnakeRepositoryImp;
import com.xworkz.collection.service.SnakeService;
import com.xworkz.collection.service.SnakeServiceImp;

public class SnakeRunner {

	public static void main(String[] args) {

		
		SnakeDTO snake = new SnakeDTO(1, "king cobra", Type.POISON, "banglore");

		SnakeRepository repository = new SnakeRepositoryImp();

		SnakeService service = new SnakeServiceImp(repository);
		SnakeDTO snake1 = new SnakeDTO(1, "Balla python", Type.POISON, "haveri");
		SnakeDTO snake2 = new SnakeDTO(1, "viper", Type.POISON, "banglore");
		
		boolean validateAndSave = service.validateAndSave(snake);
		System.out.println(validateAndSave);

		Optional<SnakeDTO> optional1=service.findById(1);
		if(optional1.isPresent()) {
			System.out.println("snake is exist");
			SnakeDTO pres= optional1.get();
			System.out.println(pres);
		}else {
			System.err.println("snake does not exist");
		}
		
		Optional<SnakeDTO> optional2=service.findByName("king cobra");
		if(optional2.isPresent()) {
			System.out.println("snake is exist");
			SnakeDTO ref=optional2.get();
			System.out.println(ref);
		}else {
			System.err.println("snake doesnt exist");
		}
		
		Optional<SnakeDTO>optional3=service.findByNameAndPlace("Balla python", "haveri");
		if(optional3.isPresent()) {
			System.out.println("snake exist");
			SnakeDTO ref=optional3.get();
			System.out.println(ref);
		}else {
			System.err.println("snake does not exist");
		}
		System.out.println("===============================");
		Optional<List<SnakeDTO>>optional4=service.findByType(Type.NONPOISON);
		if(optional4.isPresent()) {
			System.out.println("snake exist");
			List<SnakeDTO> ref=optional4.get();
			System.out.println(ref);
		}else {
			System.err.println("snake is not exist");
		}
		
	}
}