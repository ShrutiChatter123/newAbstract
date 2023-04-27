package com.xworkz.collection.service;

import java.util.Optional;

import com.xworkz.collection.functional.SnakeDTO;
import com.xworkz.collection.functional.TrainDTO;

public interface TrainService {

	public boolean validateAndSave(SnakeDTO dto);

	
	
	
	
	
	
	Optional<TrainDTO> findById(int id);

	default Optional<TrainDTO> findByName(String name) {
		return Optional.empty();
	}

	default Optional<TrainDTO> findByNameAndPlace(String name, String place) {
		return Optional.empty();

	}

	

	
	
	
}
