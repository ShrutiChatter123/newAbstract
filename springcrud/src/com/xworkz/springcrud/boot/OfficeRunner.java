package com.xworkz.springcrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springcrud.configuration.SpringConfiguration;
import com.xworkz.springcrud.dto.OfficeDTO;
import com.xworkz.springcrud.service.OfficeService;

public class OfficeRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		OfficeService service = spring.getBean(OfficeService.class);

		OfficeDTO dto = new OfficeDTO(9989887L, "cogni");

		boolean save = service.validateAndSave(dto);
		System.out.println("saving:" + save);

	}

}
