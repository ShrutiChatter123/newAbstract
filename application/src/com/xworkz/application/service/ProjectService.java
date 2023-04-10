package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FoodDTO;
import com.xworkz.application.dto.ProjectDTO;
import com.xworkz.application.exception.FoodValidException;
import com.xworkz.application.exception.ProjectValidException;

public interface ProjectService {

	boolean validateAndSave(ProjectDTO dto) throws ProjectValidException;
	
	ProjectDTO find(ProjectDTO dto) throws ProjectValidException;
	
	ProjectDTO findByName(String name)throws ProjectValidException;
	
	ProjectDTO findByNameAndcountry(String name,String country)throws ProjectValidException;
	
	ProjectDTO findNameBycountryAndId(String country,int id)throws ProjectValidException;
	
	ProjectDTO findByNameAndStartDateAndEndDate(String name,LocalDate startdate,LocalDate endDate)throws ProjectValidException;
	
	int total()throws ProjectValidException;
	
	ProjectDTO[] findAll();
	
}
