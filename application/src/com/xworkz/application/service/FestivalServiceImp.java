package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repositry.FestivalRepository;

public class FestivalServiceImp implements FestivalService {
	private FestivalRepository repo;

	public FestivalServiceImp(FestivalRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(FestivalDTO dto) throws InvalidFestivalException {
		System.out.println("Running valid then save method in implements");

		if (dto != null) {
			System.out.println("dto is not valid");

			int id = dto.getId();
			String name = dto.getName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String sweet = dto.getSweet();
			String god = dto.getGodName();

			boolean validId = false;
			boolean validName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;
			boolean validGodName = false;

			if (id > 0) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.out.println("invalid id");
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("v=invalid Name");
			}

			LocalDate start = LocalDate.of(2023, 1, 1);
			if (startDate != null && startDate.isAfter(start)) {
				System.out.println("valid start date");
				validStartDate = true;
			} else {
				System.err.println("invalid Start date");
			}

			if (endDate != null && endDate.isAfter(start)) {
				System.out.println("valid endDate");
				validEndDate = true;
			} else {
				System.err.println("invalid endDate");
			}

			if (sweet != null && !sweet.isEmpty() && sweet.length() > 3 && sweet.length() < 30) {
				System.out.println("sweet is valid");
				validSweet = true;
			} else {
				System.err.println("sweet is invalid");
			}

			if (god != null && !god.isEmpty() && god.length() > 3 && god.length() < 30) {
				System.out.println("god is valid");
				validGodName = true;
			} else {
				System.out.println("god is invalid");
			}

			if (validId && validName && validStartDate && validEndDate && validSweet && validGodName) {
				System.out.println("valid data then save");
				boolean save = this.repo.save(dto);
				return save;
			} else {
				System.out.println("invalid data");
				throw new InvalidFestivalException("handle the exception");
			}

		} else {
			System.out.println("dto is null");
		}

		return false;
	}

}
