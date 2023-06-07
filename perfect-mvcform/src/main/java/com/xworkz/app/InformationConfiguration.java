package com.xworkz.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class InformationConfiguration implements WebMvcConfigurer {

	public InformationConfiguration() {
		System.out.println("No-org constructor for InformationConfiguration");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/welcome.jsp");
	
	}
	
	
	
}
