package com.xworkz.shoeShowroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowroom.configuration.ShoeShowroomConfiguration;
import com.xworkz.shoeShowroom.dto.SocksDTO;
import com.xworkz.shoeShowroom.service.SocksService;

public class SocksRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfiguration.class);
		SocksService service = spring.getBean(SocksService.class);

		SocksDTO dto = new SocksDTO(56, "Nike");

		boolean save = service.validateAndSave(dto);
		System.out.println("saving:" + save);
	}
}
