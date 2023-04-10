package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FoodDTO;
import com.xworkz.application.dto.ProjectDTO;
import com.xworkz.application.exception.FoodValidException;
import com.xworkz.application.exception.ProjectValidException;
import com.xworkz.application.repositry.ProjectRepository;
import com.xworkz.application.utility.DesertUtil;

public class ProjectServiceImp implements ProjectService {

	private ProjectRepository repo;

	public ProjectServiceImp(ProjectRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ProjectDTO dto) throws ProjectValidException {
		if (dto != null) {
			System.out.println("dto is not null :" + dto);

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			LocalDate startdate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validStartDate = false;
			boolean validEndDate = false;

			if (DesertUtil.validInt(id)) {
				System.out.println("id is valid");
				validId = true;
			} else {
				System.out.println("id invalid");
			}
			if (DesertUtil.validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.out.println("name is invalid");
			}
			if (DesertUtil.validString(country)) {
				System.out.println("country is valid");
				validCountry = true;
			} else {
				System.out.println("country invalid");
			}
			if (DesertUtil.validLocalDate(startdate)) {
				System.out.println("Startdate is valid");
				validStartDate = true;
			} else {
				System.out.println("Startdate invalid");
			}
			if (DesertUtil.validLocalDate(endDate)) {
				System.out.println("enddate valid");
				validEndDate = true;
			} else {
				System.out.println("enddate invalid");
			}

			if (DesertUtil.validFlags(validId, validName, validCountry, validStartDate, validEndDate)) {
				System.out.println(" all data is valid ");

				boolean temp = this.repo.isExist(dto);
				if (!temp) {
					boolean save = this.repo.save(dto);
					return save;
				}

			} else {
				System.out.println("data is invalid so dont save");
			}

		}
		return false;
	}

	@Override
	public ProjectDTO find(ProjectDTO dto) throws ProjectValidException {
		if (validateAndSave(dto)) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public ProjectDTO findByName(String name) {
		if (DesertUtil.validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public ProjectDTO findByNameAndcountry(String name, String country) throws ProjectValidException {

		if (DesertUtil.validString(name) && DesertUtil.validString(country)) {
			return this.repo.findByNameAndCountry(name, country);
		}
		return null;

	}

	@Override
	public ProjectDTO findNameBycountryAndId(String country, int id) throws ProjectValidException {
		if (DesertUtil.validString(country) && DesertUtil.validInt(id)) {
			return this.repo.findNameByCountryAndId(country, id);
		}

		return null;
	}

	@Override
	public ProjectDTO findByNameAndStartDateAndEndDate(String name, LocalDate startdate, LocalDate endDate)
			throws ProjectValidException {
		if (DesertUtil.validString(name) && DesertUtil.validLocalDate(startdate)
				&& DesertUtil.validLocalDate(endDate)) {
			return this.repo.findByNameAndStartDateAndEndDate(name, startdate, endDate);
		}

		return null;
	}

	@Override
	public ProjectDTO[] findAll() {

		ProjectDTO[] repoArray = repo.findAll();

		for (int i = 0; i < repoArray.length; i++) {
			if (repoArray[i] != null) {
				System.out.println(repoArray[i]);
			}
		}
		return repoArray;
	}

	@Override
	public int total() throws ProjectValidException {
		return this.repo.total();
	}

}
