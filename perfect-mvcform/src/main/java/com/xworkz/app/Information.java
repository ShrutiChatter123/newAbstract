package com.xworkz.app;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Information extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
//this task based on request scope spring mvc
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Calling getRootConfigClasses in Information ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses in Information");
		return new Class[] {InformationConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMapping in information.. ");
		return new String[] {"/"};
			
	}

	
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
}
	
	
	
}
