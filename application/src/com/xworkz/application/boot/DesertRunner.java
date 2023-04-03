package com.xworkz.application.boot;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.repositry.DesertRepoImp;
import com.xworkz.application.repositry.DesertRepository;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImp;

public class DesertRunner {

	public static void main(String[] args) {
		DesertDTO dto = new DesertDTO(21, "Sahara", "Africa", 5366820d, 100, 104);
		DesertDTO dto1 = new DesertDTO(21, "Atacama", "Peru", 63645820d, 98, 100);
		DesertDTO dto2 = new DesertDTO(21, "Gobi", "China", 4378522d, 98, 100);
		DesertDTO dto3 = new DesertDTO(21, "Kalahari", "Africa", 65486623d, 90, 95);
		DesertDTO dto4 = new DesertDTO(21, "Mojave", "USA", 5988299d, 110, 120);
		DesertDTO dto5 = new DesertDTO(21, "Namib", "Namibia", 67554434d, 80, 95);
		DesertDTO dto6 = new DesertDTO(21, "Arabian", "Asia", 87677774d, 95, 100);
		DesertDTO dto7 = new DesertDTO(21, "Sonoran", "USA", 6366820d, 100, 104);
		DesertDTO dto8 = new DesertDTO(21, "Thar", "India", 578620d, 99, 105);
		DesertDTO dto9 = new DesertDTO(21, "Patagonian", "Chile", 6886903d, 89, 100);
		DesertDTO dto10 = new DesertDTO(21, "Taklamakan", "China", 5366820d, 100, 104);
		DesertDTO dto11 = new DesertDTO(21, "Chihuahuan", "Mexico", 5366820d, 100, 104);
		DesertDTO dto12 = new DesertDTO(21, "Syrian", "Egypt", 5366820d, 100, 104);
		DesertDTO dto13 = new DesertDTO(21, "Great Victoria", "Australia", 5366820d, 100, 104);
		DesertDTO dto14 = new DesertDTO(21, "Karakum", "Turkmenistan", 5366820d, 100, 104);
		DesertDTO dto15 = new DesertDTO(21, "EmptyQuarter", "Egypt", 5366820d, 100, 104);
		DesertDTO dto16 = new DesertDTO(21, "Kyzylkum", "Asia", 5366820d, 100, 104);
		DesertDTO dto17 = new DesertDTO(21, "Great Basin", "USA", 5366820d, 100, 104);
		DesertDTO dto18 = new DesertDTO(21, "Dasht-e Lut", "Afghanistan", 5366820d, 100, 104);
		DesertDTO dto19 = new DesertDTO(21, "Great Sandy", "Australia", 5366820d, 100, 104);
		DesertDTO dto20 = new DesertDTO(21, "Polar", "Egypt", 5366820d, 100, 104);
		DesertDTO dto21 = new DesertDTO(21, "Australia Desert", "Australia", 5366820d, 100, 104);
		DesertDTO dto22 = new DesertDTO(21, "Simpson", "Australia", 5366820d, 100, 104);

		DesertRepository desertRepository = new DesertRepoImp();

		DesertService service = new DesertServiceImp(desertRepository);
		DesertService service1 = new DesertServiceImp(desertRepository);
		DesertService service2 = new DesertServiceImp(desertRepository);
		DesertService service3 = new DesertServiceImp(desertRepository);
		DesertService service4 = new DesertServiceImp(desertRepository);
		DesertService service5 = new DesertServiceImp(desertRepository);
		DesertService service6 = new DesertServiceImp(desertRepository);
		DesertService service7 = new DesertServiceImp(desertRepository);
		DesertService service8 = new DesertServiceImp(desertRepository);
		DesertService service9 = new DesertServiceImp(desertRepository);
		DesertService service10 = new DesertServiceImp(desertRepository);
		DesertService service11 = new DesertServiceImp(desertRepository);
		DesertService service12 = new DesertServiceImp(desertRepository);
		DesertService service13 = new DesertServiceImp(desertRepository);
		DesertService service14 = new DesertServiceImp(desertRepository);
		DesertService service15 = new DesertServiceImp(desertRepository);
		DesertService service16 = new DesertServiceImp(desertRepository);
		DesertService service17 = new DesertServiceImp(desertRepository);
		DesertService service18 = new DesertServiceImp(desertRepository);
		DesertService service19 = new DesertServiceImp(desertRepository);
		DesertService service20 = new DesertServiceImp(desertRepository);
		DesertService service21 = new DesertServiceImp(desertRepository);
		DesertService service22 = new DesertServiceImp(desertRepository);

		try {
			boolean save = service.validateAndSave(dto);
			System.out.println("Save:" + save);
			boolean save1 = service1.validateAndSave(dto1);
			System.out.println("Save1:" + save1);
			boolean save2 = service2.validateAndSave(dto2);
			System.out.println("Save2:" + save2);
			boolean save3 = service3.validateAndSave(dto3);
			System.out.println("Save3:" + save3);
			boolean save4 = service4.validateAndSave(dto4);
			System.out.println("Save4:" + save4);
			boolean save5 = service5.validateAndSave(dto5);
			System.out.println("Save5:" + save5);
			boolean save6 = service6.validateAndSave(dto6);
			System.out.println("Save6:" + save6);
			boolean save7 = service7.validateAndSave(dto7);
			System.out.println("Save7:" + save7);
			boolean save8 = service8.validateAndSave(dto8);
			System.out.println("Save8:" + save8);
			boolean save9 = service9.validateAndSave(dto9);
			System.out.println("Save9:" + save9);
			boolean save10 = service10.validateAndSave(dto10);
			System.out.println("Save10:" + save10);
			boolean save11 = service11.validateAndSave(dto11);
			System.out.println("Save11:" + save11);
			boolean save12 = service12.validateAndSave(dto12);
			System.out.println("Save12:" + save12);
			boolean save13 = service13.validateAndSave(dto13);
			System.out.println("Save13:" + save13);
			boolean save14 = service14.validateAndSave(dto14);
			System.out.println("Save14:" + save14);
			boolean save15 = service15.validateAndSave(dto15);
			System.out.println("Save15:" + save15);
			boolean save16 = service16.validateAndSave(dto16);
			System.out.println("Save16:" + save16);
			boolean save17 = service17.validateAndSave(dto17);
			System.out.println("Save17:" + save17);
			boolean save18 = service18.validateAndSave(dto18);
			System.out.println("Save18:" + save18);
			boolean save19 = service19.validateAndSave(dto19);
			System.out.println("Save19:" + save19);
			boolean save20 = service20.validateAndSave(dto20);
			System.out.println("Save20:" + save20);
			boolean save21 = service21.validateAndSave(dto21);
			System.out.println("Save21:" + save21);
			boolean save22 = service22.validateAndSave(dto22);
			System.out.println("Save22:" + save22);

		} catch (DesertInvalidException e) {
			System.out.println("DesertDataInvalidException:" + e.getMessage());
		}

		try {
			DesertDTO dtos = service.find(dto);
			System.out.println("DTO:" + dtos);
			DesertDTO dtos1 = service1.find(dto1);
			System.out.println("DTO1:" + dtos1);
			DesertDTO dtos2 = service2.find(dto2);
			System.out.println("DTO2:" + dtos2);
			DesertDTO dtos3 = service3.find(dto3);
			System.out.println("DTO3:" + dtos3);
			DesertDTO dtos4 = service4.find(dto4);
			System.out.println("DTO4:" + dtos4);
			DesertDTO dtos5 = service5.find(dto5);
			System.out.println("DTO5:" + dtos5);
			DesertDTO dtos6 = service6.find(dto6);
			System.out.println("DTO6:" + dtos6);
			DesertDTO dtos7 = service7.find(dto7);
			System.out.println("DTO7:" + dtos7);
			DesertDTO dtos8 = service8.find(dto8);
			System.out.println("DTO8:" + dtos8);
			DesertDTO dtos9 = service9.find(dto9);
			System.out.println("DTO9:" + dtos9);
			DesertDTO dtos10 = service10.find(dto10);
			System.out.println("DTO10:" + dtos10);
			DesertDTO dtos11 = service11.find(dto11);
			System.out.println("DTO11:" + dtos11);
			DesertDTO dtos12 = service12.find(dto12);
			System.out.println("DTO12:" + dtos12);
			DesertDTO dtos13 = service13.find(dto13);
			System.out.println("DTO13:" + dtos13);
			DesertDTO dtos14 = service.find(dto14);
			System.out.println("DTO14:" + dtos14);
			DesertDTO dtos15 = service15.find(dto15);
			System.out.println("DTO15:" + dtos15);
			DesertDTO dtos16 = service16.find(dto16);
			System.out.println("DTO16:" + dtos16);
			DesertDTO dtos17 = service17.find(dto17);
			System.out.println("DTO17:" + dtos17);
			DesertDTO dtos18 = service18.find(dto18);
			System.out.println("DTO18:" + dtos18);
			DesertDTO dtos19 = service19.find(dto19);
			System.out.println("DTO19:" + dtos19);
			DesertDTO dtos20 = service20.find(dto20);
			System.out.println("DTO20:" + dtos20);
			DesertDTO dtos21 = service21.find(dto21);
			System.out.println("DTO21:" + dtos21);
			DesertDTO dtos22 = service22.find(dto22);
			System.out.println("DTO22:" + dtos22);
		} catch (DesertInvalidException e) {
			System.out.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			double area = service.findAreaByName("Sahara");
			System.out.println("Area:" + area);
			double area1 = service1.findAreaByName("Atacama");
			System.out.println("Area1:" + area1);
			double area2 = service2.findAreaByName("Gobi");
			System.out.println("Area2:" + area2);
			double area3 = service3.findAreaByName("Kalahari");
			System.out.println("Area3:" + area3);
			double area4 = service4.findAreaByName("Sahara");
			System.out.println("Area4:" + area4);
			double area5 = service5.findAreaByName("Sahara");
			System.out.println("Area5:" + area5);
			double area6 = service6.findAreaByName("Sahara");
			System.out.println("Area6:" + area6);
			double area7 = service7.findAreaByName("Sahara");
			System.out.println("Area7:" + area7);
			double area8 = service8.findAreaByName("Sahara");
			System.out.println("Area8:" + area8);
			double area9 = service9.findAreaByName("Sahara");
			System.out.println("Area9:" + area9);
			double area10 = service10.findAreaByName("Sahara");
			System.out.println("Area10:" + area10);
			double area11 = service11.findAreaByName("Sahara");
			System.out.println("Area11:" + area11);
			double area12 = service12.findAreaByName("Sahara");
			System.out.println("Area12:" + area12);
			double area13 = service13.findAreaByName("Sahara");
			System.out.println("Area13:" + area13);
			double area14 = service14.findAreaByName("Sahara");
			System.out.println("Area14:" + area14);
			double area15 = service15.findAreaByName("Sahara");
			System.out.println("Area15:" + area15);
			double area16 = service16.findAreaByName("Sahara");
			System.out.println("Area16:" + area16);
			double area17 = service17.findAreaByName("Sahara");
			System.out.println("Area17:" + area17);
			double area18 = service18.findAreaByName("Sahara");
			System.out.println("Area18:" + area18);
			double area19 = service19.findAreaByName("Sahara");
			System.out.println("Area19:" + area19);
			double area20 = service20.findAreaByName("Sahara");
			System.out.println("Area20:" + area20);
			double area21 = service21.findAreaByName("Sahara");
			System.out.println("Area21:" + area21);
			double area22 = service22.findAreaByName("Sahara");
			System.out.println("Area22:" + area22);
		} catch (DesertInvalidException e) {
			System.out.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			DesertDTO name = service.findByName("Sahara");
			System.out.println("Name:" + name);
			DesertDTO name1 = service1.findByName("Gobi");
			System.out.println("Name1:" + name1);
			DesertDTO name2 = service2.findByName("Atacama");
			System.out.println("Name2:" + name2);
			DesertDTO name3 = service3.findByName("Kalahari");
			System.out.println("Name3:" + name3);
			DesertDTO name4 = service4.findByName("Sahara");
			System.out.println("Name4:" + name4);
			DesertDTO name5 = service5.findByName("Sahara");
			System.out.println("Name5:" + name5);
			DesertDTO name6 = service6.findByName("Sahara");
			System.out.println("Name6:" + name6);
			DesertDTO name7 = service7.findByName("Sahara");
			System.out.println("Name7:" + name7);
			DesertDTO name8 = service8.findByName("Sahara");
			System.out.println("Name8:" + name8);
			DesertDTO name9 = service9.findByName("Sahara");
			System.out.println("Name9:" + name9);
			DesertDTO name10 = service10.findByName("Sahara");
			System.out.println("Name10:" + name10);
			DesertDTO name11 = service11.findByName("Sahara");
			System.out.println("Name11:" + name11);
			DesertDTO name12 = service12.findByName("Sahara");
			System.out.println("Name12:" + name12);
			DesertDTO name13 = service13.findByName("Sahara");
			System.out.println("Name13:" + name13);
			DesertDTO name14 = service14.findByName("Sahara");
			System.out.println("Name14:" + name14);
			DesertDTO name15 = service15.findByName("Sahara");
			System.out.println("Name15:" + name15);
			DesertDTO name16 = service16.findByName("Sahara");
			System.out.println("Name16:" + name16);
			DesertDTO name17 = service17.findByName("Sahara");
			System.out.println("Name17:" + name17);
			DesertDTO name18 = service18.findByName("Sahara");
			System.out.println("Name18:" + name18);
			DesertDTO name19 = service19.findByName("Sahara");
			System.out.println("Name19:" + name19);
			DesertDTO name20 = service20.findByName("Sahara");
			System.out.println("Name20:" + name20);
			DesertDTO name21 = service21.findByName("Sahara");
			System.out.println("Name21:" + name21);
			DesertDTO name22 = service22.findByName("Sahara");
			System.out.println("Name22:" + name22);
		} catch (DesertInvalidException e) {
			System.out.println("DesertDataInvalidException:" + e.getMessage());
		}
		try {
			DesertDTO detail = service.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail:" + detail);
			DesertDTO detail1 = service1.findByNameAndCountryAndArea("Arabian", "Asia", 87677774d);
			System.out.println("Detail1:" + detail1);
			DesertDTO detail2 = service2.findByNameAndCountryAndArea("Atacama", "Peru", 63645820d);
			System.out.println("Detail2:" + detail2);
			DesertDTO detail3 = service3.findByNameAndCountryAndArea("Gobi", "China", 4378522d);
			System.out.println("Detail3:" + detail3);
			DesertDTO detail4 = service4.findByNameAndCountryAndArea("Kalahari", "Africa", 65486623d);
			System.out.println("Detail4:" + detail4);
			DesertDTO detail5 = service5.findByNameAndCountryAndArea("Mojave", "USA", 5988299d);
			System.out.println("Detail5:" + detail5);
			DesertDTO detail6 = service6.findByNameAndCountryAndArea("Namib", "Namibia", 67554434d);
			System.out.println("Detail6:" + detail6);
			DesertDTO detail7 = service7.findByNameAndCountryAndArea("Arabian", "Asia", 87677774d);
			System.out.println("Detail7:" + detail7);
			DesertDTO detail8 = service8.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail8:" + detail8);
			DesertDTO detail9 = service9.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail9:" + detail9);
			DesertDTO detail10 = service10.findByNameAndCountryAndArea("Sonoran", "USA", 6366820d);
			System.out.println("Detail10:" + detail10);
			DesertDTO detail11 = service11.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail11:" + detail11);
			DesertDTO detail12 = service12.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail12:" + detail12);
			DesertDTO detail13 = service13.findByNameAndCountryAndArea("Gobi", "China", 4378522d);
			System.out.println("Detail13:" + detail13);
			DesertDTO detail14 = service14.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail14:" + detail14);
			DesertDTO detail15 = service15.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail15:" + detail15);
			DesertDTO detail16 = service16.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail16:" + detail16);
			DesertDTO detail17 = service17.findByNameAndCountryAndArea("Syrian", "Egypt", 5366820d);
			System.out.println("Detail17:" + detail17);
			DesertDTO detail18 = service18.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail18:" + detail18);
			DesertDTO detail19 = service19.findByNameAndCountryAndArea("Syrian", "Egypt", 5366820d);
			System.out.println("Detail19:" + detail19);
			DesertDTO detail20 = service20.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail20:" + detail20);
			DesertDTO detail21 = service.findByNameAndCountryAndArea("Gobi", "China", 4378522d);
			System.out.println("Detail21:" + detail21);
			DesertDTO detail22 = service22.findByNameAndCountryAndArea("Sahara", "Egypt", 5366820d);
			System.out.println("Detail22:" + detail22);

		} catch (DesertInvalidException e) {
			System.out.println("DesertDataInvalidException:" + e.getMessage());
		}

		int total = service.total();
		System.out.println(total);
		
		int total1 = service1.total();
		System.out.println(total1);
		
		int total2 = service2.total();
		System.out.println(total2);
		
		int total3 = service3.total();
		System.out.println(total3);
		
		int total4 = service4.total();
		System.out.println(total4);
		
		int total5 = service5.total();
		System.out.println(total5);
		
		int total6 = service6.total();
		System.out.println(total6);
		
		int total7 = service7.total();
		System.out.println(total7);
		
		int total8 = service8.total();
		System.out.println(total8);
		
		int total9 = service9.total();
		System.out.println(total9);
		
		int total10 = service10.total();
		System.out.println(total10);
		
		int total11 = service11.total();
		System.out.println(total11);
		
		int total12 = service12.total();
		System.out.println(total12);
		
		int total13 = service13.total();
		System.out.println(total13);

		int total14 = service14.total();
		System.out.println(total14);

		int total15 = service15.total();
		System.out.println(total15);
		
		int total16 = service16.total();
		System.out.println(total16);

		int total17 = service17.total();
		System.out.println(total17);

		int total18 = service18.total();
		System.out.println(total18);

		int total19 = service19.total();
		System.out.println(total19);

		int total20 = service20.total();
		System.out.println(total20);

		int total21 = service21.total();
		System.out.println(total21);
		int total22 = service22.total();
		System.out.println(total22);

	}

}
