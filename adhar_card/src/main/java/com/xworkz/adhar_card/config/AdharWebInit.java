package com.xworkz.adhar_card.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AdharWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses in webInti ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses in webInti ");
		return new Class[] {AdharConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings in webInti ");
		return new String[] {"/"};
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		
		int maxSize=800000000;
		MultipartConfigElement multipartConfigElement=new MultipartConfigElement("E:\\tom-cat\\shruti chatter\\", maxSize ,maxSize*2,maxSize/2);
		registration.setMultipartConfig(multipartConfigElement);
	
	}
		
	
	
}
