package com.xworkz.springAuto.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAuto.configuration.MuseumConfigration;
import com.xworkz.springAuto.thing.Musuem;
import com.xworkz.springAuto.thing.Thing;

public class MuseumRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(MuseumConfigration.class);
		System.out.println(spring.getBeanDefinitionCount());

		Musuem ref = spring.getBean(Musuem.class);
		System.out.println(ref);

		
	}

}
