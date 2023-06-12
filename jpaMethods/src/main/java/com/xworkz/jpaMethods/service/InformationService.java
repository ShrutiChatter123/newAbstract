package com.xworkz.jpaMethods.service;

import java.util.List;

import com.xworkz.jpaMethods.entity.InformationEntity;
import com.xworkz.jpaMethods.repository.InformationRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InformationService {

	private InformationRepository repo;

	public InformationService() {
		System.out.println("Creaating No-org constructor to InformationService ");
	}

	public boolean validateAndSave(InformationEntity entity) {

		boolean save = false;
		if (entity != null) {
			save = this.repo.onSave(entity);

			return save;
		}

		return save;
	}

	public InformationEntity findById(int id) {
		System.out.println("Getting findById throught service");
		InformationEntity ref = this.repo.findById(id);
		return ref;

	}
	
	public  List<InformationEntity> findAll() {
		return this.repo.findAll();
		
	}
	
	public List<InformationEntity> findByName(String name){
		return this.repo.findByName(name);
	}

	

}
