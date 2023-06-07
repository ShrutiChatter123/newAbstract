package com.xworkz.simplecrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.simplecrud.dto.PhoneDTO;
import com.xworkz.simplecrud.repository.PhoneRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
public class PhoneServiceImpl implements PhoneService {

	private PhoneRepo repo;
	private Validator validator;
	
	@Override
	public boolean validateAndSave(PhoneDTO dto) {
		System.out.println("Excecuting validateandaSave method in impl");
		if(dto!=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<PhoneDTO>> violation=this.validator.validate(dto);
			
			if(!violation.isEmpty()) {
				System.out.println("TotalViolations"+violation.size());
				
		violation.forEach(s->System.out.println(s.getPropertyPath()+" " +s.getMessage()));

		}else {
			return this.repo.save(dto);
		
		}
		
		}else {
			System.out.println("Dto is null");
		}
		return false;

	}
	
}
