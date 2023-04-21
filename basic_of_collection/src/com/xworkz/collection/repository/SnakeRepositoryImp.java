package com.xworkz.collection.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.functional.SnakeDTO;

public class SnakeRepositoryImp implements SnakeRepository {

	private Collection<SnakeDTO> snakedtos = new ArrayList<>();

	@Override
	public boolean save(SnakeDTO dto) {

		return this.snakedtos.add(dto);
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		return this.snakedtos.stream().filter(s -> s.getId() == id).findFirst();
	}

	@Override
	public Optional<SnakeDTO> findByName(String name) {

		Optional<SnakeDTO> optional = this.snakedtos.stream().filter(s -> s.getName().equals(name)).findFirst();
		return optional;
	}

	@Override
	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {

		return this.snakedtos.stream().filter(s -> s.getName().equals(name) && s.getPlace().equals(place)).findFirst();

	}

	@Override
	public Optional<List<SnakeDTO>> findByType(Type type) {

		return Optional.of(this.snakedtos.stream().filter(e -> e.getType().equals(type)).collect(Collectors.toList()));

	}
}
