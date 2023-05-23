package com.xworkz.shoeShowroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowroom.configuration.ShoeShowroomConfiguration;
import com.xworkz.shoeShowroom.dto.EducationDTO;
import com.xworkz.shoeShowroom.service.EducationService;

public class EducationRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfiguration.class);
		EducationService service = spring.getBean(EducationService.class);

		EducationDTO dto = new EducationDTO("Collage", 22, 123445);

		boolean b = service.validateAndSave(dto);
		System.out.println(b);

	}
}
