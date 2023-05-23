package com.xworkz.springcrud.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.OfficeDTO;

@Component
public class OfficeRepositoryImpl implements OfficeRepository {

	private Collection<OfficeDTO>ref=new ArrayList();
	
	
	@Override
	public boolean save(OfficeDTO dto) {
		System.out.println("saving is correct");
		return this.ref.add(dto);
	}

	
	
}
