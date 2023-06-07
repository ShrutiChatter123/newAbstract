package com.xworkz.donate;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BloodWebinit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("Runnig getRootConfigClasses in initi ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	System.out.println("Runnig getServletConfigClasses in initi ");
		return new Class[] {BloodConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runnig getServletMappings in initi ");
//		this is to handle dynamic response to dispatcher servlet
		return new String[] {"/"};
	}
	
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize=800000000; MultipartConfigElement MultipartConfigElement=new MultipartConfigElement("C:\\Users\\tomcat-files\\SHRUTI CHATTER",maxSize,maxSize* 2,maxSize / 2 );
		registration.setMultipartConfig(MultipartConfigElement);
			
	}

}
