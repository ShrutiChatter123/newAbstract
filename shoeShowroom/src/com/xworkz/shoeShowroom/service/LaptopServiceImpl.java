package com.xworkz.shoeShowroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.LaptopDTO;
import com.xworkz.shoeShowroom.repository.LaptopRepository;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class LaptopServiceImpl implements LaptopService {

	private LaptopRepository reposiory;
	
	public Validator validator;
	
	
	@Override
	public boolean validateAndSave(LaptopDTO dto) {
		
		if(dto!=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<LaptopDTO>> violation=this.validator.validate(dto);
			if(violation.isEmpty()) {
				System.out.println("No violation:"+violation.size());
				
				violation.forEach(s->System.out.println(s.getPropertyPath()+ " "+s.getMessage()));
				
			}else {
				return this.reposiory.save(dto);
			}
		}else {
			System.err.println("dto is null");
		}
		
		
		return false;
	}

}
