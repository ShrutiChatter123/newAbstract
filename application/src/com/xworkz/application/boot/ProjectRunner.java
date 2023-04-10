package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.ProjectDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.MemoryFullException;
import com.xworkz.application.exception.ProjectMemoryFullException;
import com.xworkz.application.exception.ProjectValidException;
import com.xworkz.application.repositry.ProjectRepository;
import com.xworkz.application.repositry.ProjectRepositoryImp;
import com.xworkz.application.service.ProjectService;
import com.xworkz.application.service.ProjectServiceImp;

public class ProjectRunner {

	public static void main(String[] args) {

		ProjectDTO dto = new ProjectDTO(1, "tile", "india", LocalDate.of(2022, 3, 4), LocalDate.of(2023, 6, 7));

		ProjectRepository repository = new ProjectRepositoryImp();
		ProjectService service = new ProjectServiceImp(repository);

		ProjectDTO dto1 = new ProjectDTO(2, "water", "china", LocalDate.of(2022, 5, 6), LocalDate.of(2022, 9, 6));

		ProjectDTO dto2 = new ProjectDTO(23, "canteen", "india", LocalDate.of(2022, 8, 8), LocalDate.of(2023, 8, 9));

		try {
			boolean save = service.validateAndSave(dto);
			System.out.println("saving :" + save);
			System.out.println("****************************");

			boolean save1 = service.validateAndSave(dto1);
			System.out.println("saving:" + save1);
			System.out.println("*******************************");

			boolean save2 = service.validateAndSave(dto2);
			System.out.println("saving :" + save2);
			System.out.println("******************************");

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			System.out.println("findbyname");
			System.out.println(service.findByName("tile"));
			System.out.println("===================================");
			System.out.println("findByNameAndcountry");
			System.out.println(service.findByNameAndcountry("water", "china"));
			System.out.println("===================================");
			System.out.println("findByNameAndStartDateAndEndDate");
			System.out.println(service.findByNameAndStartDateAndEndDate("canteen", LocalDate.of(2022, 8, 8),
					LocalDate.of(2023, 8, 9)));
			System.out.println("===================================");
			System.out.println("findNameBycountryAndId");
			System.out.println(service.findNameBycountryAndId("india", 23));
			System.out.println("===================================");
			System.out.println("total");
			System.out.println(service.total());
			System.out.println("===================================");
			System.out.println("find");
			System.out.println(service.find(dto2));
			System.out.println("===================================");

			System.out.println("calling find all from runner");
			service.findAll();

		} catch (ProjectValidException e) {
			e.getMessage();
		} catch (ProjectMemoryFullException e) {
			e.getMessage();
		}

	}

}