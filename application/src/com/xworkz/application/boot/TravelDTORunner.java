package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.TravelDTO;

public class TravelDTORunner {

	public static void main(String[] args) {
		
		TravelDTO travelDTO=new TravelDTO();
		travelDTO.setAttLocalDate(LocalDate.now());
		travelDTO.setDrivarName("Prabhas rao");
		travelDTO.setNoOfFriends(54);
		travelDTO.setNoOfPlacess(7);
		travelDTO.setTeamHead("Ajith askar");
		System.out.println(travelDTO);
		System.out.println(travelDTO.hashCode());
		System.out.println(travelDTO.equals(travelDTO));
		
	}
}
