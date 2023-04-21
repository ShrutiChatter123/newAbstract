package com.xworkz.collection.repository;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.functional.TrainDTO;

public class TrainRepositoryImp implements TrainRepository {

	private Collection<TrainDTO> traindtos;

	public TrainRepositoryImp() {

	}

	@Override
	public boolean save(TrainDTO dto) {
		return this.traindtos.add(dto);
	}

	@Override
	public Optional<TrainDTO> findById(int id) {
		for (TrainDTO trainDTO : traindtos) {
			if(trainDTO.getId()==id) {
				return Optional.of(trainDTO);
			}
		}
		return Optional.empty();
	}
	
	@Override
	public Optional<TrainDTO> findByName(String name) {
		for (TrainDTO trainDTO : traindtos) {
			if(trainDTO.getName()==name) {
				return Optional.of(trainDTO);
			}
		}
		return Optional.empty();
	}
	
	@Override
	public Optional<TrainDTO> findByNameAndPlace(String name, String place) {
		for (TrainDTO trainDTO : traindtos) {
			if(trainDTO.getName()==name&&trainDTO.getPlace()==place) {
				return Optional.of(trainDTO);
			}
		}
		return Optional.empty();
	}

}
