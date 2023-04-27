package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationReository;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationReository repo;

	public PoliceStationServiceImpl(PoliceStationReository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {

		System.out.println("Running vlidation in in service:" + dto);
		if (dto != null) {
			System.out.println("Dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<PoliceStationDTO>> validate = validator.validate(dto);

			System.out.println("total constraints:" + " : " + validate.size());

			validate.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (validate.isEmpty()) {

				System.out.println("no contrainstsViolation found in: " + dto);

				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
