package com.xworkz.jpaMethods.runner;

import java.util.List;

import com.xworkz.jpaMethods.entity.InformationEntity;
import com.xworkz.jpaMethods.repository.InformationRepository;
import com.xworkz.jpaMethods.service.InformationService;

public class InformationRunner {

	public static void main(String[] args) {

		InformationEntity info = new InformationEntity();
		info.setId(10);
		info.setName("shruti");
		info.setLocation("bagalkot");
		info.setAge(22);
		info.setHeight(5);
		info.setWeight(40);
		System.out.println("getting entity:" + info);

		InformationRepository repository = new InformationRepository();

		InformationService service = new InformationService(repository);

//		service.validateAndSave(info);

		service.findById(6);

		List<InformationEntity> list = service.findAll();
		for (InformationEntity e : list) {
			System.out.println("row:" + e);
		}

		List<InformationEntity> name = service.findByName("shruti");
		System.out.println(name);

	}

}
