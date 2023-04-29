package com.xworkz.springTime.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springTime.configration.SpringConfigration;
import com.xworkz.springTime.thing.Scissor;

public class ScissorRunner {

	public static void main(String[] args) {
		ApplicationContext ref = new AnnotationConfigApplicationContext(SpringConfigration.class);

		Stream.of(ref.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(ref.getBeanDefinitionCount());
		Scissor scissor = ref.getBean(Scissor.class);
		Stream.of(scissor).forEach(System.out::println);

	}

}
