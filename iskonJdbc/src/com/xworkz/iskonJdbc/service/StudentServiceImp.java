package com.xworkz.iskonJdbc.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.iskonJdbc.dto.StudentDTO;
import com.xworkz.iskonJdbc.repository.StudentRepository;

public class StudentServiceImp implements StudentService {

	private StudentRepository repo;
	private Validator validator;

	public StudentServiceImp(StudentRepository repo) {
		this.repo = repo;
	}

	
		@Override
		public boolean validThenSave(StudentDTO dto) throws ClassNotFoundException {
			System.out.println("Running validThenSave in StudentServiceImp");

			if (dto != null) {
				System.out.println("dto is not null");

				ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<StudentDTO>> cv = validator.validate(dto);
				
				if (cv != null && !cv.isEmpty()) {
					System.out.println("no of violations:" + cv.size());
					cv.forEach(c -> System.out.println(c.getPropertyPath() + " " + c.getMessage()));
					return false;
				} else {
					boolean status = this.repo.save(dto);
					System.out.println("repo status in service:" + status);
					return status;
				}
			} else {
				System.out.println("dto is null");
			}
			return false;
		}

	


}
