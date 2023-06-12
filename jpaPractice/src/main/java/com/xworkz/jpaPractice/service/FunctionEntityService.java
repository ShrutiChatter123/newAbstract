package com.xworkz.jpaPractice.service;

import java.util.List;

import com.xworkz.jpaPractice.entity.FunctionEntity;
import com.xworkz.jpaPractice.repository.FunctionEntityRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class FunctionEntityService {

	private FunctionEntityRepository repo;
	
	
	public FunctionEntityService() {
		System.out.println("No-org constructor for FunctionEntityService ");
	}
	
	public boolean validateAndSave(FunctionEntity entity) {
		
		if(entity!=null) {
			System.out.println("running validateAndSave in repository ");
		boolean save=	this.repo.onSave(entity);
		
		return save;
		
		}
		
		return false;
		
	}
	
	
	public FunctionEntity findById(int id) {
		System.out.println("findById");
	FunctionEntity entity=	this.repo.findById(id);
		return entity;
		
	}
	
	public List<FunctionEntity> findAll(){		
		return this.repo.findAll();
		
	}
	
	public List<FunctionEntity> findByName(String name){
		return this.repo.findByName(name);
		
	}
	
	public List<FunctionEntity> findByLocation(String location){
		return this.repo.findByLocation(location);
		
	}
	
	
	
	
	
	
	
	
}
