
package com.xworkz.shoeShowroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shoeShowroom.configuration.ShoeShowroomConfiguration;
import com.xworkz.shoeShowroom.dto.ShoeShowRoomDTO;
import com.xworkz.shoeShowroom.service.ShoeShowroomService;

public class ShoeShowroomRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowroomConfiguration.class);
		ShoeShowroomService service = spring.getBean(ShoeShowroomService.class);

		ShoeShowRoomDTO dto = new ShoeShowRoomDTO(22, "ganesh shoeshowroom", "Baglkot", "GST32456 ");
		boolean save = service.validateAndsave(dto);
		System.out.println("saved:" + save);

	}

}
