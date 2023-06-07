package com.xworkz.agree.config;

import javax.servlet.Servlet;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Fun extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" Excecuting getRootConfigClasses FunClass.. ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println(" Excecuting getServletConfigClasses FunClass.. ");
		return new Class[] {FunConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" Excecuting getServletMappings FunClass.. ");
//		this method is for dynamic response.....to dispatcher Servlet.
		return new String[] {"/"};
//		this above slash is for it can take many no of resourcess like jsp html etc...
		
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		
//		this configdefaultservlethandling is for to say dispatcher servlet  static response is handle yourself  
	}
	
	

}
