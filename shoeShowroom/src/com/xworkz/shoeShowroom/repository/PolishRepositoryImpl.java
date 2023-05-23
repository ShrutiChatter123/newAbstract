package com.xworkz.shoeShowroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.PolishDTO;

@Component
public class PolishRepositoryImpl implements PolishRepository {

	private Collection<PolishDTO> polish=new ArrayList();
	
//	public PolishRepositoryImpl(Collection<PolishDTO> polish) {
//		this.polish=polish;
//	}
//	
	PolishRepositoryImpl(){
		System.out.println("Creating no-org constructor to the impl");
	}

	
	@Override
	public boolean save(PolishDTO dto) {
		System.out.println("Saving is correct");
		return this.polish.add(dto);
	}


	

	
	
}
