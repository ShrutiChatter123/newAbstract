package com.xworkz.shoeShowroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.LaptopDTO;

@Component
public class LaptopRepositoryImpl implements LaptopRepository {

	Collection<LaptopDTO> dto = new ArrayList<>();
	
	public LaptopRepositoryImpl() {
		System.out.println("No-org consrructor to impl");

	}

	@Override
	public boolean save(LaptopDTO dto) {
		System.out.println("saving is correct");
		return this.dto.add(dto);
	}

}
