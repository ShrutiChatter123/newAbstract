package com.xworkz.springAuto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.springAuto.thing.Thing;

@Component
@ComponentScan("com.xworkz.springAuto")
public class MuseumConfigration {

	@Bean
	public String name() {
		System.out.println("registering living");
		return "Human";
		
	}
	
	@Bean
	public String name1() {
		System.out.println("registering living");
		return "pets";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
