package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;

public class ShowRoomServiceImpl implements ShowRoomService {

	private ShowRoomRepository repo;

	public ShowRoomServiceImpl(ShowRoomRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ShowRoomDTO dto) {

		System.out.println("Running validation in service:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();

			Set<ConstraintViolation<ShowRoomDTO>> ref = valid.validate(dto);
			System.out.println("totalconstraints:" + ref.size());

			ref.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			if (ref.isEmpty()) {
				System.out.println("no constrains found in:" + dto);

				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
