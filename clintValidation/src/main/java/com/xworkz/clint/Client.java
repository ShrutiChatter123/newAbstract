package com.xworkz.clint;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Client extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Excecuting getRootConfigClasses method in Client");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Excecuting getServletConfigClasses method in Client");
		return new Class[] {ClientConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Excecuting getServletMappings method in Client");
		return new String[] {"/"};
	}
	


}
