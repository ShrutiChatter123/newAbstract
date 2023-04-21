package com.xworkz.collection.repository;

import java.util.Optional;

import com.xworkz.collection.functional.SnakeDTO;
import com.xworkz.collection.functional.TrainDTO;

public interface TrainRepository {

boolean save(TrainDTO dto);
	
	Optional<TrainDTO>findById(int id);
	
	default Optional<TrainDTO>findByName(String name){
		return Optional.empty();	
	}
	
	default Optional<TrainDTO> findByNameAndPlace(String name,String place){
		return Optional.empty();
		
	}
}
