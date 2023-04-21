package com.xworkz.collection.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.functional.SnakeDTO;

public interface SnakeService {

	public boolean validateAndSave(SnakeDTO dto);

	Optional<SnakeDTO> findById(int id);

	default Optional<SnakeDTO> findByName(String name) {
		return Optional.empty();
	}

	default Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return Optional.empty();

	}

	default Optional<List<SnakeDTO>> findByType(Type type) {
		return Optional.empty();

	}

}
