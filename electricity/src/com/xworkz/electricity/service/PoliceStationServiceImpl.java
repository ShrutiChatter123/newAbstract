package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationReository;
import com.xworkz.electricity.util.ValidateUtil;

public class PoliceStationServiceImpl implements PoliceStationService {

	private PoliceStationReository repo;

	private ValidateUtil<PoliceStationDTO> ref=new ValidateUtil<>();
	public PoliceStationServiceImpl(PoliceStationReository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {

		System.out.println("Running vlidation in in service:" + dto);
		if (dto != null) {
			System.out.println("Dto is not null");

			
			if (ref.validDTO(dto)) {

				System.out.println("no contrainstsViolation found in: " + dto);

				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
