package com.xworkz.shoeShowroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.SalesManagerDTO;
import com.xworkz.shoeShowroom.repository.SalesManagerRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService {

	private SalesManagerRepository repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(SalesManagerDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<SalesManagerDTO>> violation = this.validator.validate(dto);

			if (!violation.isEmpty()) {
				System.out.println("no violation:" + violation.size());

				violation.forEach(s -> System.out.println(s.getPropertyPath() + " " + s.getMessage()));

			} else {
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null");
		}

		return false;
	}

}
