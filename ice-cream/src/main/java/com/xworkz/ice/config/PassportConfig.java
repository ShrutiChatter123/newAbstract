package com.xworkz.ice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.ice")
public class PassportConfig {

	public PassportConfig() {
		System.out.println("No-org constructor for PassportConfig");
	}
	
	
}
