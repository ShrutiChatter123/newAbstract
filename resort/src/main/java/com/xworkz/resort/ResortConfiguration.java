package com.xworkz.resort;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class ResortConfiguration implements WebMvcConfigurer {

	
	public ResortConfiguration() {
		System.out.println("No-org constructipon for ResortConfiguration");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("welcome.jsp");
	}
	
	
	
	
}
