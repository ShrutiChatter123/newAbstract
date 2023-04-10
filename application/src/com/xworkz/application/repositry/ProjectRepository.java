package com.xworkz.application.repositry;

import java.time.LocalDate;

import com.xworkz.application.dto.FoodDTO;
import com.xworkz.application.dto.ProjectDTO;
import com.xworkz.application.exception.ProjectValidException;

public interface ProjectRepository {

	boolean isExist(ProjectDTO dto);
	
	boolean save(ProjectDTO dto);
	
	ProjectDTO find(ProjectDTO dto) ;
	
	ProjectDTO findByName(String name);
	
	ProjectDTO findByNameAndCountry(String name,String Country);
	
	ProjectDTO findNameByCountryAndId(String Country,int id);
	
	ProjectDTO findByNameAndStartDateAndEndDate(String name,LocalDate startdate,LocalDate endDate);
	
	ProjectDTO[] findAll();
	
	int total();
	
	
}
