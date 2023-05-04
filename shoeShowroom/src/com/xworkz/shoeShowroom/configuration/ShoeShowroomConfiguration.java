package com.xworkz.shoeShowroom.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.shoeShowroom")
public class ShoeShowroomConfiguration {

	@Bean
	public Validator validator() {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator ref = factory.getValidator();

		return ref;

	}

}
