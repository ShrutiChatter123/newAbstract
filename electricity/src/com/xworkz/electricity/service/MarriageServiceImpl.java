package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;

public class MarriageServiceImpl implements MarriageService {

	private MarriageRepository repo;

	public MarriageServiceImpl(MarriageRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(MarriageDTO dto) {
		System.out.println("Running validation in service:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<MarriageDTO>> constraint = valid.validate(dto);
			System.out.println("totalConstraints:" + constraint.size());
			constraint.forEach(cv -> System.out.println(cv.getPropertyPath() + " : " + cv.getMessage()));

			if (constraint.isEmpty()) {
				System.out.println("no constraintsViolation found:" + dto);
				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
