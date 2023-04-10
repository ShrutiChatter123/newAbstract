package com.xworkz.application.boot;

import com.xworkz.application.dto.AwarenessDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.MemoryFullException;
import com.xworkz.application.repositry.AwarenessRepository;
import com.xworkz.application.repositry.AwarenessRepositoryImp;
import com.xworkz.application.service.AwaarenessServiceImp;
import com.xworkz.application.service.AwarenessService;

public class AwarenessRunner {

	public static void main(String[] args) {
		AwarenessDTO dto=new AwarenessDTO(1, "rest", "india", 67, 86, 90);
		
		AwarenessRepository repository=new AwarenessRepositoryImp();
		AwarenessService service=new AwaarenessServiceImp(repository);
		
		AwarenessDTO dto1=new AwarenessDTO(2, "plant", "india", 45, 60, 70);
		AwarenessDTO dto2=new AwarenessDTO(3, "education", "china", 23, 56, 70);
		
//		System.out.println(dto);
		try {
			boolean save=service.validateAndSave(dto);
			System.out.println("saved dto:"+save);
			System.out.println("*******************");
			
			boolean save1=service.validateAndSave(dto1);
			System.out.println("saved:"+save1);
			System.out.println("*****************************");
		
			System.out.println("**************************************************");
			System.out.println(service.find(dto2));
			System.out.println(service.findByName("plant"));
			System.out.println(service.findAreaByName("plant"));
			System.out.println(service.findByNameAndCountryAndArea("plant", "india", 45));
			System.out.println(service.total());
			
			
			
		}catch(DesertInvalidException e) {
			e.printStackTrace();
		}catch(MemoryFullException e) {
			e.printStackTrace();
		}
		
	}
}
