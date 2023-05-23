package com.xworkz.springcrud.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springcrud")

public class SpringConfiguration {

	@Bean
	public Validator validator() {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator ref = factory.getValidator();

		return ref;

	}

}
