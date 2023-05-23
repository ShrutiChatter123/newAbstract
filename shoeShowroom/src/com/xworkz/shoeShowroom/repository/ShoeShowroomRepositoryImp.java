package com.xworkz.shoeShowroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.shoeShowroom.dto.ShoeShowRoomDTO;

@Component
public class ShoeShowroomRepositoryImp implements ShoeShowroomRepository {

	private Collection<ShoeShowRoomDTO> shoeShowroom = new ArrayList<>();

	public ShoeShowroomRepositoryImp(Collection<ShoeShowRoomDTO> shoeShowroom) {
		this.shoeShowroom = shoeShowroom;
	}

	public ShoeShowroomRepositoryImp() {
		System.out.println("creating no-org constructor to repoimpl");
	}

	@Override
	public boolean save(ShoeShowRoomDTO dto) {
		System.out.println("Saving is correct");
		return this.shoeShowroom.add(dto);
	}

}
