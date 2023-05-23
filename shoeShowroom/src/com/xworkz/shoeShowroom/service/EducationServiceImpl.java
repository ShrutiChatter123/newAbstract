package com.xworkz.shoeShowroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.EducationDTO;
import com.xworkz.shoeShowroom.dto.PolishDTO;
import com.xworkz.shoeShowroom.repository.EducationRepository;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class EducationServiceImpl implements EducationService {

	private EducationRepository repo;
	public Validator validator;
	
	@Override
	public boolean validateAndSave(EducationDTO dto) {
		if(dto!=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<EducationDTO>> violations = this.validator.validate(dto);

			if(violations.isEmpty()) {
				System.out.println("Total violation"+violations.size());
			}
			violations.forEach(s->System.out.println(s.getPropertyPath()+" "+ s.getMessage()));
			return this.repo.save(dto);
			
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}

}
