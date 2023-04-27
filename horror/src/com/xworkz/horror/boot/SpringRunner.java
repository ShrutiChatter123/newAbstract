package com.xworkz.horror.boot;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.horror.configration.SpringConfigration;

public class SpringRunner {

	
	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfigration.class);
		
	}
}
