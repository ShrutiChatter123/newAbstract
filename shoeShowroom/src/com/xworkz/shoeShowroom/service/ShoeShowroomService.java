package com.xworkz.shoeShowroom.service;

import com.xworkz.shoeShowroom.dto.ShoeShowRoomDTO;
import com.xworkz.shoeShowroom.repository.ShoeShowroomRepository;

public interface ShoeShowroomService {

		boolean validateAndsave(ShoeShowRoomDTO dto);
	
	
}
