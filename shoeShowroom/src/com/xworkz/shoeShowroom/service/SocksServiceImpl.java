package com.xworkz.shoeShowroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.SocksDTO;
import com.xworkz.shoeShowroom.repository.SocksRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SocksServiceImpl implements SocksService {

	private SocksRepository repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(SocksDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<SocksDTO>> violation = this.validator.validate(dto);

			if (!violation.isEmpty()) {

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
