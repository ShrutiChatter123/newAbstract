package com.xworkz.springTime.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springTime.configration.SpringConfigration;
import com.xworkz.springTime.thing.ShavingCream;

public class ShavingCreamRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(context.getBeanDefinitionCount());

		System.out.println(context.getBean(ShavingCream.class));
	}
}