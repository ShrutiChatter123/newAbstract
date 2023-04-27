package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.PoliceStationDTO;

public class PoliceStationRepoImpl implements PoliceStationReository {

	private Collection<PoliceStationDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(PoliceStationDTO dto) {
		
		System.out.println("Saving is correct:"+dto);
		return this.dtos.add(dto);
	}

}
