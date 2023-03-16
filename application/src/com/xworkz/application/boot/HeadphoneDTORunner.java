package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.Brand;
import com.xworkz.application.dto.Colore;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.dto.TypeAndWeight;
import com.xworkz.application.service.HeadphoneService;
import com.xworkz.application.service.HeadphoneServiceImp;

public class HeadphoneDTORunner {

	public static void main(String[] args) {
		
		HeadphoneDTO HeadphoneDTO =new HeadphoneDTO(Brand.APPLE, "appl5", 78989.7D, false, Colore.RED, TypeAndWeight.IPHONE1440, "raj", 7876, LocalDate.now(), 5);

		System.out.println(HeadphoneDTO);
		
		HeadphoneService HeadphoneService=new HeadphoneServiceImp();
		
		 boolean save=HeadphoneService.ValidateAndThenSave(HeadphoneDTO);
		 System.out.println("saved:"+save);
	}

}
