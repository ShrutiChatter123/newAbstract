package com.xworkz.shoeShowroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.EducationDTO;
@Component
public class EducationRepositoryImpl implements EducationRepository {
Collection<EducationDTO> dto=new ArrayList<>();
	
	@Override
	public boolean save(EducationDTO dto) {
		System.out.println("saving is correct");
		return this.dto.add(dto);
	}

}
