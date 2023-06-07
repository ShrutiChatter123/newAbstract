package com.xworkz.simplecrudOnSpringMvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.simplecrudOnSpringMvc")
public class FilmConfiguration {

	public FilmConfiguration() {
		System.out.println("No-org constructor for FilmConfiguration ");
	}
	
	
}
