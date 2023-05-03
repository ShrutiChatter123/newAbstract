package com.xworkz.springAuto.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Thing {

	@Autowired
	@Qualifier("name1")
	private String name;
	
	


}
