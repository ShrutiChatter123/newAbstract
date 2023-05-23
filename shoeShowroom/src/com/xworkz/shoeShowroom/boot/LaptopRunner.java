package com.xworkz.shoeShowroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowroom.configuration.ShoeShowroomConfiguration;
import com.xworkz.shoeShowroom.dto.LaptopDTO;
import com.xworkz.shoeShowroom.service.LaptopService;

public class LaptopRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfiguration.class);
		LaptopService service = spring.getBean(LaptopService.class);

		LaptopDTO dto = new LaptopDTO(16, "dell");

		boolean b = service.validateAndSave(dto);
		System.out.println(b);

	}
}
