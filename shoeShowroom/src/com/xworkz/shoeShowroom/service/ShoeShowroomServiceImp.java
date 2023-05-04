package com.xworkz.shoeShowroom.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.ShoeShowRoomDTO;
import com.xworkz.shoeShowroom.repository.ShoeShowroomRepository;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowroomServiceImp implements ShoeShowroomService {

	private ShoeShowroomRepository repo;
	private Validator validator;

	@Override
	public boolean validateAndsave(ShoeShowRoomDTO dto) {
		System.out.println("Running validationin service:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<ShoeShowRoomDTO>> violation = this.validator.validate(dto);

			if (!violation.isEmpty()) {
				System.out.println("Total no of violation:" + violation.size());
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
