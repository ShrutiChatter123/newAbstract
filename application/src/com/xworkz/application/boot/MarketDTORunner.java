package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {
		
		MarketDTO marketDTO=new MarketDTO();
		marketDTO.setAttLocalDate(LocalDate.now());
		marketDTO.setLocation("Bagakot");
		marketDTO.setNoOfPeoplesPresent(578);
		marketDTO.setNoOfShops(40);
		marketDTO.setRateStartFrom(45);
		System.out.println(marketDTO);
		System.out.println(marketDTO.equals(marketDTO));
		System.out.println(marketDTO.hashCode());

	}

}
