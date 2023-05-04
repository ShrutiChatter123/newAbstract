package com.xworkz.shoeShowroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.SalesManagerDTO;

@Component
public class SalesManagerRepositoryImpl implements SalesManagerRepository {

	private Collection<SalesManagerDTO> sale = new ArrayList();

	public SalesManagerRepositoryImpl(Collection<SalesManagerDTO> sale) {
		this.sale = sale;
	}

	SalesManagerRepositoryImpl() {
		System.out.println("No-org constructor to repoImp");
	}

	@Override
	public boolean save(SalesManagerDTO dto) {
		System.out.println("saving is right true");
		return this.sale.add(dto);
	}

}
