package com.xworkz.simplecrud.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.simplecrud.dto.PhoneDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PhoneRepoImpl implements PhoneRepo {

	Collection<PhoneDTO>dtos=new ArrayList();
	
	@Override
	public boolean save(PhoneDTO dto) {
		System.out.println("Saving is currect..");
		return this.dtos.add(dto);
	}

	
	
	
}
