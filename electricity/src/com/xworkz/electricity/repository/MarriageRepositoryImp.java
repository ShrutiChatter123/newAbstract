package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.MarriageDTO;

public class MarriageRepositoryImp implements MarriageRepository {

	private Collection<MarriageDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(MarriageDTO dto) {
		System.out.println("Saving is correct");

		return this.dtos.add(dto);
	}

}
