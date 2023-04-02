package com.xworkz.application.boot;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.DataValidException;
import com.xworkz.application.exception.MemoryFullException;
import com.xworkz.application.repositry.AddressRepoImp;
import com.xworkz.application.repositry.AddressRepository;
import com.xworkz.application.service.AddressService;
import com.xworkz.application.service.AddressServiceImp;

public class AddressRunner {
	public static void main(String[] args) {
		AddressDTO dto=new AddressDTO("ChamundiNagar", "bhashamcircle", 6, "Second floor", 6789, "banglore", "karnataka"); 
		System.out.println("Address DTO ");
		
		AddressRepository repository=new AddressRepoImp();
		
		
		AddressService service=new AddressServiceImp(repository);
		try {
			service.validateAndSave(dto);
		System.out.println("runner saved in repo");
		
		int totalDtos=service.getTotal();
		System.out.println("fetching dto by number:"+totalDtos);
		
		AddressDTO fech=service.findByNumber(0);
		System.out.println("fechby dto number:"+fech);
		
		boolean boo=service.find(dto);
		System.out.println("dto found by repo:"+boo);
		
		AddressDTO street=service.findByStreet("1st stage 5th main");
		System.out.println("street found by dto:"+street);
		
		AddressDTO pin=service.findByPincode(56784);
		System.out.println("dto by pincode:"+pin);
		
		AddressDTO SPA=service.findByStreetAndPincodeAndArea("5 th block", 56784, "bashamcircle");
		System.out.println("DTO by SPA:"+SPA);
		
		AddressDTO CS=service.findByCityAndState("banglore", "karnataka");
		System.out.println("dto by CS:"+CS);
		
		String no=service.findFloorByNumber(300);
		System.out.println("no dto in string:"+no);
		
		String CtNoFlpi=service.findCityByNumberAndFloorAndStreetAndPincode(350, 3, "4th block", 87655);
		System.out.println("city floor number pin street:"+CtNoFlpi);
		
		int pincode=service.findPincodeByNumber(400);
		System.out.println("pincode by no:"+pincode);
		
	}catch(DataValidException excep) {
		excep.printStackTrace();
	}catch(MemoryFullException memo) {
		memo.printStackTrace();
	}finally {
		System.out.println("main() ends");
	}
		
	}
	
	
	
	

}
