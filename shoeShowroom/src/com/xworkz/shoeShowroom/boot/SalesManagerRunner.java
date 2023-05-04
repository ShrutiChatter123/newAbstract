package com.xworkz.shoeShowroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowroom.configuration.ShoeShowroomConfiguration;
import com.xworkz.shoeShowroom.dto.SalesManagerDTO;
import com.xworkz.shoeShowroom.service.SalesManagerService;

public class SalesManagerRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfiguration.class);
		SalesManagerService service = spring.getBean(SalesManagerService.class);

		SalesManagerDTO dto = new SalesManagerDTO(21, "Varun");

		boolean save = service.ValidateAndSave(dto);
		System.out.println("saving :" + save);

	}

}
