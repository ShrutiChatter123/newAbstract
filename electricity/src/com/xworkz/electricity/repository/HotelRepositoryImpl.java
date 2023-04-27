package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.HotelDTO;

public class HotelRepositoryImpl implements HotelRepository {

	private Collection<HotelDTO> dtos=new ArrayList<>();
	
	@Override
	public boolean save(HotelDTO dto) {
		System.out.println("saving is correct");
		return this.dtos.add(dto);
	}

}
