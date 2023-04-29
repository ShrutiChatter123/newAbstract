package com.xworkz.springTime.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springTime.configration.SpringConfigration;
import com.xworkz.springTime.thing.Trimmer;

public class TrimmerRunner {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigration.class);
		Stream.of(context.getBeanDefinitionNames()).forEach(s->System.out.println(s));
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(context.getBean(Trimmer.class));
		
		
	}
	
	
}
