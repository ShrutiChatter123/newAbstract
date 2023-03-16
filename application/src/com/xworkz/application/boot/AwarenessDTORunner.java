package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessDTORunner {
	public static void main(String[] args) {
		
		AwarenessDTO awarenessDTO=new AwarenessDTO();
		awarenessDTO.setAttLocalDate(LocalDate.of(2022, 5, 4));
		awarenessDTO.setMainTheom("educatePeople");
		awarenessDTO.setFunctionDate(4);
		awarenessDTO.setLocation("Banglore");
		awarenessDTO.setNoOfPeoplePresent(45678);
		System.out.println(awarenessDTO);
		System.out.println(awarenessDTO.hashCode());
		System.out.println(awarenessDTO.equals(awarenessDTO));
	}

	
}

