package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.ShowRoomDTO;

public class ShowRoomRepositoryImpl implements ShowRoomRepository {

	private Collection<ShowRoomDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(ShowRoomDTO dto) {
		System.out.println("Saving is correct");
		return this.dtos.add(dto);
	}

}
