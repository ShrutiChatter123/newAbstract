package com.xworkz.application.boot;

import com.xworkz.application.dto.EventDTO;
import com.xworkz.application.exception.EventMemoryFullException;
import com.xworkz.application.exception.EventValidException;
import com.xworkz.application.repositry.EventRepository;
import com.xworkz.application.repositry.EventRepositoryImp;
import com.xworkz.application.service.EventServiceImp;

public class EventRunner {

	public static void main(String[] args) {
		
		EventDTO dto=new EventDTO("babysh", "banglore", 8765, 7, 87);
		
		EventRepository repository=new EventRepositoryImp();
		EventServiceImp service=new EventServiceImp(repository);
		
		EventDTO dto1=new EventDTO("naming", "bagalkot", 8086, 8, 56);
		EventDTO dto2=new EventDTO("opening", "gadag", 3000, 7, 76);
		
		try {
		 boolean save=service.validatAndSave(dto);
		System.out.println("saved:"+save);
		System.out.println("*************************");
		
		boolean save1=service.validatAndSave(dto1);
		System.out.println("saved:"+save1);
		System.out.println("*****************");
		
		boolean save2=service.validatAndSave(dto2);
		System.out.println("saved:"+save);
		System.out.println("*********************");
		
//		methods in doubt
		EventDTO event=service.find(dto1);
		System.out.println("event:"+event);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println(service.findByNameAndLocation("babysh", "banglore"));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
	
		
		}catch(EventValidException e) {
			e.getMessage();
		}catch(EventMemoryFullException e) {
			e.getMessage();
		}
	}
}
