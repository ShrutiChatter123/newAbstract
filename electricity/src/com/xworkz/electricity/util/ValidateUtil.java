package com.xworkz.electricity.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.AmbulanceDTO;

public class ValidateUtil<A> {

	public boolean validDTO(A t) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validat = factory.getValidator();
		Set<ConstraintViolation<A>> ref = validat.validate(t);
		ref.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));

		
		return ref.isEmpty();
		
		
		
		
		
	}
}
