package com.xworkz.application.repositry;

import com.xworkz.application.dto.AwarenessDTO;
import com.xworkz.application.dto.DesertDTO;

public interface AwarenessRepository {

	default boolean isExist(AwarenessDTO dto) {
		return false;

	}

	default boolean save(AwarenessDTO dto) {
		return false;
	}

	default AwarenessDTO find(AwarenessDTO dto) {
		return null;
		

	}

	default AwarenessDTO finByName(String name) {
		return null;
	}

	default double findAreaByName(String name) {
		return 0;

	}

	default AwarenessDTO findByNameAndCountryAndArea(String name, String country, double area) {
		return null;

	}

	default int total() {
		return 0;

	}

}
