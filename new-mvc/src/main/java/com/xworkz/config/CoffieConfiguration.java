package com.xworkz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.controller")
public class CoffieConfiguration {

	public CoffieConfiguration() {
		System.out.println("Calling:"+getClass().getSimpleName());
	}
}
