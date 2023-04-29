package com.xworkz.electricity.service;

import java.util.Collection;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;
import com.xworkz.electricity.util.ValidateUtil;

public class MarriageServiceImpl implements MarriageService {

	private MarriageRepository repo;

	private ValidateUtil<MarriageDTO> ref=new ValidateUtil<>();
	public MarriageServiceImpl(MarriageRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(MarriageDTO dto) {
		System.out.println("Running validation in service:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");

			
			if (ref.validDTO(dto)) {
				System.out.println("no constraintsViolation found:" + dto);
				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
