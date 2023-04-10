package com.xworkz.application.repositry;

import com.xworkz.application.dto.EventDTO;
import com.xworkz.application.exception.EventValidException;

public interface EventRepository {

	default boolean isExist(EventDTO dto) {
		return false;
	}

	boolean save(EventDTO dto) throws EventValidException;

	default EventDTO find(EventDTO dto) throws EventValidException {
		return null;
	}

	default EventDTO findFindByName(String name) throws EventValidException {
		return null;

	}

	default EventDTO findByNameAndLocation(String name, String location) throws EventValidException {
		return null;

	}

	default EventDTO findByNameOrAreaRentOrhallCost(int date, String name, double hallCost) throws EventValidException {
		return null;

	}

}
