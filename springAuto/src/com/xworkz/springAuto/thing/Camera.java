package com.xworkz.springAuto.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {

	@Autowired
	private Guide guide;
	
	
	//2 ways to initializse the value using constructor
		//1. by parameterized constuctor
		//2. by @AllArgsConstructor
		/*below is implicitly autowired 
		 * public Guide(Security security) { System.out.println("Guide is running...");
		 * this.security=security; }
		 */
		
	
	
	
}
