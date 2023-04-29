package com.xworkz.springTime.boot;

import java.util.stream.Stream;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springTime.configration.SpringConfigration;
import com.xworkz.springTime.thing.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {

		ApplicationContext ref = new AnnotationConfigApplicationContext(SpringConfigration.class);

		Stream.of(ref.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(ref.getBeanDefinitionCount());
		System.out.println(ref.getBean(Saloon.class));

	}
}
