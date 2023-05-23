package com.xworkz.springcrud.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.CompanyDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class CompanyRepositoryImpl implements CompanyRepository {

	private Collection<CompanyDTO> dtos=new ArrayList();
	

	@Override
	public boolean save(CompanyDTO dto) {
		System.out.println("Saving is correct");
		return this.dtos.add(dto);
	}

	
	
}
