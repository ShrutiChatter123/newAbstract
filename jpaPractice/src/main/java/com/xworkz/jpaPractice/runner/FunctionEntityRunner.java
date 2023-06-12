package com.xworkz.jpaPractice.runner;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xworkz.jpaPractice.entity.FunctionEntity;
import com.xworkz.jpaPractice.repository.FunctionEntityRepository;
import com.xworkz.jpaPractice.service.FunctionEntityService;

public class FunctionEntityRunner {

	public static void main(String[] args) {
		
		FunctionEntity name = new FunctionEntity();
		
		name.setId(6);
		name.setName("naming");
		name.setLocation("Banglore");
		name.setDate(12);
		name.setAddress("rajajinagar banglore");
		System.out.println("getting entitys:"+ name);
		
	
		FunctionEntityRepository repository = new FunctionEntityRepository();
		
		FunctionEntityService service=new FunctionEntityService(repository);
//		service.validateAndSave(name);
		
		service.findById(3);
		
		
	List<FunctionEntity> entity=	service.findAll();
		
	for(FunctionEntity ref:entity) {
		System.out.println("row"+ ref);
	}
	

	List<FunctionEntity> ref=service.findByName("shruti");
	System.out.println(ref);
	
	
	List<FunctionEntity> loca=service.findByLocation("Banglore");
	System.out.println(loca);
	
	
	}
	
	
	
	
}
