package com.xworkz.shoeShowroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowroom.configuration.ShoeShowroomConfiguration;
import com.xworkz.shoeShowroom.dto.PolishDTO;
import com.xworkz.shoeShowroom.service.PolishService;

public class PolishRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfiguration.class);
		PolishService service = spring.getBean(PolishService.class);

		PolishDTO dto = new PolishDTO(20, "plain");

		boolean save = service.ValidateAndSave(dto);
		System.out.println("saving:" + save);

	}

}
