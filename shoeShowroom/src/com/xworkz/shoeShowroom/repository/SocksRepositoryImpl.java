package com.xworkz.shoeShowroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.SocksDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SocksRepositoryImpl implements SocksRepository {

	private Collection<SocksDTO> sock = new ArrayList();

	public SocksRepositoryImpl() {

		System.out.println("creating no-org constructor to imp");
	}

	@Override
	public boolean save(SocksDTO dto) {
		System.out.println("saving is correct");
		return this.sock.add(dto);
	}

}
