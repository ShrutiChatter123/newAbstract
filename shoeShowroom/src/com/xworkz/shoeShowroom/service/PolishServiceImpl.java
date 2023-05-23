package com.xworkz.shoeShowroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.PolishDTO;
import com.xworkz.shoeShowroom.repository.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {

	private PolishRepository repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(PolishDTO dto) {

		System.out.println("Running validation in service:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");

//			violation empty edre mathra save agli annodakke ee line/
			Set<ConstraintViolation<PolishDTO>> violations = this.validator.validate(dto);

			if (!violations.isEmpty()) {
				System.out.println("no violations:" + violations.size());

				violations.forEach(s -> System.out.println(s.getPropertyPath() + "" + s.getMessage()));

			} else {
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null");
		}

		return false;
	}

}
