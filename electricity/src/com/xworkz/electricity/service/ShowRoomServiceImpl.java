package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;
import com.xworkz.electricity.util.ValidateUtil;

public class ShowRoomServiceImpl implements ShowRoomService {

	private ShowRoomRepository repo;

	private ValidateUtil<ShowRoomDTO>ref=new ValidateUtil<>();
	public ShowRoomServiceImpl(ShowRoomRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ShowRoomDTO dto) {

		System.out.println("Running validation in service:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			
			if (ref.validDTO(dto)) {
				System.out.println("no constrains found in:" + dto);

				return this.repo.save(dto);
			}

		}
		System.out.println("dto is null");
		return false;
	}

}
