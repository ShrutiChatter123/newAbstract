package com.xworkz.springTime.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springTime.configration.SpringConfigration;

public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext ref = new AnnotationConfigApplicationContext(SpringConfigration.class);

	}
}
