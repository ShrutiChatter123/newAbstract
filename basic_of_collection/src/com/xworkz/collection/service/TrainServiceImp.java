package com.xworkz.collection.service;

import java.util.Optional;

import com.xworkz.collection.functional.SnakeDTO;
import com.xworkz.collection.functional.TrainDTO;
import com.xworkz.collection.repository.TrainRepository;

public class TrainServiceImp implements TrainService {

	private TrainRepository repo;

	public TrainServiceImp(TrainRepository repo) {
		this.repo = repo;
	}

	

	@Override
	public Optional<TrainDTO> findById(int id) {
		return repo.findById(id);
	}

	@Override
	public Optional<TrainDTO> findByName(String name) {
		return repo.findByName(name);
	}
	
	@Override
	public Optional<TrainDTO> findByNameAndPlace(String name, String place) {
		return repo.findByNameAndPlace(name, place);
	}



	@Override
	public boolean validateAndSave(SnakeDTO dto) {
		if(dto!=null) {
			return this.repo.save(dto);
		}
		return 
	}

	
	
	
}
