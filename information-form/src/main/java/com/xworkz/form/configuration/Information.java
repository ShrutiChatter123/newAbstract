package com.xworkz.form.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Information extends  AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Excecuting getRootConfigClasses in Information");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Excecuting getServletConfigClasses in Information");
		return new Class[] {InformationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Excecuting getServletMappings in Information");
		return new String[] {"/"};
	}

	
	
	
	
}
