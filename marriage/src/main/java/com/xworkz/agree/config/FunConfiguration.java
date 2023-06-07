package com.xworkz.agree.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.agree")
public class FunConfiguration implements WebMvcConfigurer {

	public FunConfiguration() {
		System.out.println("No-org constructor for Fun Configuration...");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("Sucess.jsp");
	}
	
	
	
}
