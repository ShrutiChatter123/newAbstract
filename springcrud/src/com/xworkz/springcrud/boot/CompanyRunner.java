package com.xworkz.springcrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springcrud.configuration.SpringConfiguration;
import com.xworkz.springcrud.dto.CompanyDTO;
import com.xworkz.springcrud.service.CompanyService;

public class CompanyRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		CompanyService service = spring.getBean(CompanyService.class);

		CompanyDTO dto = new CompanyDTO("Wipro", 21);

		boolean save = service.validateAndSave(dto);
		System.out.println("saving:" + save);

	}
}
