package com.xworkz.simplecrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.simplecrud.config.PhoneConfig;
import com.xworkz.simplecrud.dto.PhoneDTO;
import com.xworkz.simplecrud.service.PhoneService;

public class PhoneRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(PhoneConfig.class);
		PhoneService service = spring.getBean(PhoneService.class);
		
		PhoneDTO dto=new PhoneDTO("samsung",17,"sangeetha");
		
		boolean save= service.validateAndSave(dto);
		System.out.println("saving:"+save);
	}
	
}
