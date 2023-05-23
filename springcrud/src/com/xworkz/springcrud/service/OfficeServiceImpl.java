package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.OfficeDTO;
import com.xworkz.springcrud.repository.OfficeRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class OfficeServiceImpl implements OfficeService {

	private OfficeRepository repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(OfficeDTO dto) {
		System.out.println("running validation in officeserviceImpl");

		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<OfficeDTO>> violation = this.validator.validate(dto);
			if (!violation.isEmpty()) {
				System.out.println("no-violation found:" + violation.size());

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
