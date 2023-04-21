package com.xworkz.collection.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.functional.SnakeDTO;
import com.xworkz.collection.repository.SnakeRepository;

public class SnakeServiceImp implements SnakeService {

	private SnakeRepository snakeRepository;

	public SnakeServiceImp(SnakeRepository snakeRepository) {
		this.snakeRepository = snakeRepository;
	}

	@Override
	public boolean validateAndSave(SnakeDTO dto) {

		if (dto != null) {
			return this.snakeRepository.save(dto);

		}
		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		
		return this.snakeRepository.findById(id); 
	}

	@Override
	public Optional<SnakeDTO> findByName(String name) {
		return this.snakeRepository.findByName(name);
	}
	
	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return this.snakeRepository.findByNameAndPlace(name, place);
	}
	
	@Override
	public Optional<List<SnakeDTO>> findByType(Type type) {
		return this.snakeRepository.findByType(type);
	}
	

}
