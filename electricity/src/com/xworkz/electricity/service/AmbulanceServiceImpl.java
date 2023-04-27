package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.util.ValidateUtil;

public class AmbulanceServiceImpl implements AmbulanceService {

	private AmbulanceRepository repo;
	private ValidateUtil<AmbulanceDTO> validateUtil = new ValidateUtil<>();

	public AmbulanceServiceImpl(AmbulanceRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(AmbulanceDTO dto) {

		System.out.println("Running validation in service:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			if (validateUtil.validDTO(dto)) {
				return this.repo.save(dto);
			}
		}

		return false;
	}

}
