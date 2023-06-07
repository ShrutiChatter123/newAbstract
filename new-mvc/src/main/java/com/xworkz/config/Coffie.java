package com.xworkz.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Coffie extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling get root config...");
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getservlet config config...");
		return new 	Class[] {CoffieConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling get rservlet mapping ...");
		return new String[] {"/"};  
//		DS dynamic response
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		
//		its just indicate we dont want static response to DS
	}
}
