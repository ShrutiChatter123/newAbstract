package com.xworkz.vehicals.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class LandConfiguration {

	public LandConfiguration() {
		System.out.println(" No-org constructor for LandConfiguration");	
		
	}
	
}
