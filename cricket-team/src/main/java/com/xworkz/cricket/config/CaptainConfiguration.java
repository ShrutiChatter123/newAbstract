package com.xworkz.cricket.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.cricket")
public class CaptainConfiguration {

	public CaptainConfiguration() {
		System.out.println("No-org constructor for CaptainConfiguration ");
	}
	
	
	
}
