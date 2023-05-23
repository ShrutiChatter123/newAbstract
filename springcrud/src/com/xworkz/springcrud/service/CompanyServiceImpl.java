package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.CompanyDTO;
import com.xworkz.springcrud.repository.CompanyRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

	private CompanyRepository repo;
	private Validator validator;

	@Override
	public boolean validateAndSave(CompanyDTO dto) {
		System.out.println("running valdation in impl");

		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<CompanyDTO>> violation = this.validator.validate(dto);
			
			if (!violation.isEmpty()) {
				System.out.println("total violation:" + violation.size());
				
			violation.forEach(s->System.out.println(s.getPropertyPath()+" "+s.getMessage()));	

			} else {
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null");
		}

		return false;
	}

}
