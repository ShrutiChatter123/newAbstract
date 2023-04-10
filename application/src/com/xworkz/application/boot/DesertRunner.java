package com.xworkz.application.boot;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.EducationInvalidException;
import com.xworkz.application.exception.EducationMemoryFullException;
import com.xworkz.application.repositry.DesertRepoImp;
import com.xworkz.application.repositry.DesertRepository;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImp;

public class DesertRunner {

	public static void main(String[] args) {
		DesertDTO dto = new DesertDTO(1, "Sahara", "Africa", 40, 45, 58);
		DesertRepository repository = new DesertRepoImp();
		DesertService service = new DesertServiceImp(repository);
		DesertDTO dto2 = new DesertDTO(2, "Desert", "India", 45, 25, 38);
		DesertDTO dto3 = new DesertDTO(3, "tardesert", "rajasthan", 76, 88, 80);
		DesertDTO dto4 = new DesertDTO(4, "arctic", "europ", 55, 70, 90);
		DesertDTO dto5 = new DesertDTO(5, "greate", "australia", 80, 87, 99);
		DesertDTO dto6 = new DesertDTO(6, "Arabian", "Subtropic", 11, 45, 56);
		DesertDTO dto7 = new DesertDTO(6, "Gobi desert", "colowinter", 12, 66, 67);
		DesertDTO dto8 = new DesertDTO(7, "Kalhari", "subtropical", 50, 65, 66);
		DesertDTO dto9 = new DesertDTO(8, "patagonian", "colombo", 57, 10, 11);
		DesertDTO dto10 = new DesertDTO(9, "Patagonian", "colo winter", 33, 90, 70);
		DesertDTO dto11 = new DesertDTO(11, "DSairiyan", "subtropic", 30, 61, 71);
		DesertDTO dto12 = new DesertDTO(11, "chihuhaun", "subttop", 43, 73, 80);
		DesertDTO dto13 = new DesertDTO(13, "karkum", "wintercolo", 24, 56, 67);
		DesertDTO dto14 = new DesertDTO(14, "greatva", "subtropic", 58, 63, 76);
		DesertDTO dto15 = new DesertDTO(15, "ogden", "rajasthan", 44, 89, 90);
		DesertDTO dto16 = new DesertDTO(16, "dashet", "chinaa", 54, 66, 89);
		DesertDTO dto17=new DesertDTO(17, "colombo", "coloindi", 32, 59, 77);
		DesertDTO dto18=new DesertDTO(18, "chalibi", "subtropical", 90, 67,100);
		DesertDTO dto19=new DesertDTO(19, "Danakil", "sblouy", 90, 70, 98);
		DesertDTO dto20=new DesertDTO(20, "sonran", "comppiv", 70, 67, 93);
		DesertDTO dto21=new DesertDTO(21, "kokke", "india", 97, 73, 89);

		
		try {
			boolean save = service.validateAndSave(dto);
			System.out.println(save);
			System.out.println("*****************************************************");

			boolean save1 = service.validateAndSave(dto2);
			System.out.println(save);
			System.out.println("*******************************************************");

			boolean save2 = service.validateAndSave(dto3);
			System.out.println(save2);
			System.out.println("*****************************************************");

			boolean save3 = service.validateAndSave(dto4);
			System.out.println(save3);
			System.out.println("***********************");

			boolean save4 = service.validateAndSave(dto5);
			System.out.println(save4);
			System.out.println("****************************");

			boolean save5 = service.validateAndSave(dto6);
			System.out.println(save5);
			System.out.println("**********************");

			boolean save6 = service.validateAndSave(dto7);
			System.out.println(save6);
			System.out.println("*************************");

			boolean save7 = service.validateAndSave(dto8);
			System.out.println(save7);
			System.out.println("*********************");

			boolean save8 = service.validateAndSave(dto9);
			System.out.println(save8);
			System.out.println("****************");

			boolean save9 = service.validateAndSave(dto10);
			System.out.println(save9);
			System.out.println("*********************");

			boolean save10 = service.validateAndSave(dto11);
			System.out.println(save10);
			System.out.println("*******************");

			boolean save11 = service.validateAndSave(dto12);
			System.out.println(save11);
			System.out.println("***********************");

			boolean save12 = service.validateAndSave(dto13);
			System.out.println(save12);
			System.out.println("************************");

			boolean save13 = service.validateAndSave(dto14);
			System.out.println(save13);
			System.out.println("********************************");

			boolean save14 = service.validateAndSave(dto15);
			System.out.println(save14);
			System.out.println("********************************");

			boolean save15 = service.validateAndSave(dto16);
			System.out.println(save15);
			System.out.println("**********************");
			
			boolean save16=service.validateAndSave(dto17);
			System.out.println(save15);
			System.out.println("****************************");
			
			boolean save17=service.validateAndSave(dto18);
			System.out.println(save17);
			System.out.println("*****************************");
			
			boolean save18=service.validateAndSave(dto19);
			System.out.println(save18);
			System.out.println("********************");
			
			boolean save19=service.validateAndSave(dto20);
			System.out.println(save19);
			System.out.println("********************************");
			
			boolean save20=service.validateAndSave(dto21);
			System.out.println(save20);
			System.out.println("************************");
			
			
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		      System.out.println( service.findByName("arctic"));
			System.out.println(service.find(dto15));
			System.out.println(service.findAreaByName("Desert"));
			System.out.println(service.total());
			DesertDTO fnca= service.findByNameAndCountryAndArea("Desert", "India",45 );
			System.err.println("runner: findByNameAndCountryAndArea :"+fnca);
			
			System.out.println(service.findByName("arctic"));
			System.out.println(service.find(dto4));
			System.out.println(service.findAreaByName("tardesert"));
			System.out.println(service.total());
			System.out.println(service.findByNameAndCountryAndArea("tardesert", "rajasthan", 76));
			
			
		} catch (DesertInvalidException e) {
			e.printStackTrace();
		}catch(EducationMemoryFullException e) {
			e.getMessage();
		}

	}

}





