package com.xworkz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.controller")
public class HealthyConfiguration {

	public HealthyConfiguration() {
		System.out.println("HealthyConfiguration:" + getClass().getSimpleName());

	}
	
	
	
	
	
}
