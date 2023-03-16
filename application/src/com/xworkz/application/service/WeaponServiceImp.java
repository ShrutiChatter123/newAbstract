package com.xworkz.application.service;

import java.awt.Window.Type;
import java.time.LocalDate;
import java.util.jar.Attributes.Name;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;

public class WeaponServiceImp implements WeaponService {

	@Override
	public boolean ValidateAndThenSave(WeaponDTO dto) {
		if (dto != null) {
			System.out.println("WeaponDTO is validating now");

			int id = dto.getId();
			String name = dto.getName();
			WeaponType type = dto.getType();
			double cost = -dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate date = dto.getManufactureedYear();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validManufacturedYear = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;

			if (id > 0 && id < 100) {
				System.out.println("id is valid");
				validId = true;

			} else {
				System.out.println("id is invalid");
			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.out.println("name is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType = true;
			} else {
				System.out.println("type is invalid");

			}
			if (cost < 100 && cost > 1000) {
				System.out.println("cost is valid");
				validCost = true;
			} else {
				System.out.println("cost is invalid");

			}
			if (material != null && !material.isEmpty() && material.length() > 2 && material.length() < 100) {
				System.out.println("material is valid");
				validMaterial = true;
			} else {
				System.out.println("materiual is invalid");

			}

			if (madeBy != null && madeBy.isEmpty() && madeBy.length() > 2 && madeBy.length() < 100) {
				System.out.println("madeBy is valid");
				validMadeBy = true;
			} else {
				System.out.println("madeBy is invalid");

			}
			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 2
					&& manufacturedBy.length() < 100) {
				System.out.println("manufacturedBy is valid");
				validManufacturedBy = true;
			} else {
				System.out.println("manufacturedBy is invalid");

			}

			LocalDate manufacturedyear = LocalDate.now();
			LocalDate past = LocalDate.of(1999, 5, 7);
			if (date != null && date.isBefore(manufacturedyear) && !date.isEqual(past)) {
				System.out.println("manufacturedyear is valid");
				validManufacturedYear = true;
			} else {
				System.out.println("manufacturedyear is invalid");

			}
			if (usedBy != null && !usedBy.isEmpty() && usedBy.length() > 2 && usedBy.length() < 100) {
				System.out.println("usedBy is valid");
				validUsedBy = true;
			} else {
				System.out.println("usedBy is invalid");

			}
			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 2 && usedFor.length() < 100) {
				System.out.println("usedFor is valid");
				validUsedFor = true;
			} else {
				System.out.println("usedFor is invalid");

			}

			if (weight > 0 && weight < 100) {
				System.out.println("weight is valid");
				validWeight = true;
			} else {
				System.out.println("weight is invalid");

			}
			if (validId && validName && validType && validCost && validMaterial && validMadeBy && validManufacturedBy
					&& validManufacturedYear && validUsedBy && validUsedFor && validWeight) {
				return true;
			}

		}

		return false;
	}

}
