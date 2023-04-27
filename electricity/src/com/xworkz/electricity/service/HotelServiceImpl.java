package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.HotelDTO;
import com.xworkz.electricity.repository.HotelRepository;
import com.xworkz.electricity.util.ValidateUtil;

public class HotelServiceImpl implements HotelService {

	private HotelRepository repo;
	
	private ValidateUtil<HotelDTO> ref=new ValidateUtil<>();

	public HotelServiceImpl(HotelRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(HotelDTO dto) {
		System.out.println("Running validation in service");
		if (dto != null) {
			System.out.println("dto is not null");

			
			if (ref.validDTO(dto)) {
				System.out.println("no contraints found in:" + dto);
				return this.repo.save(dto);

			}

		}
		System.out.println("dto is null");
		return false;
	}

}
