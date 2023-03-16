package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.WeaponType;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.service.WeaponService;
import com.xworkz.application.service.WeaponServiceImp;

public class WeaponRunner {

	public static void main(String[] args) {

		WeaponDTO weaponDTO = new WeaponDTO(78, "", WeaponType.RIFLE, 567845.2D, "metal", "engineer",
				"Bharath dynamics company", LocalDate.now(), "armypeople", "protect india", 880);

		System.out.println(weaponDTO);

		WeaponService weaponService = new WeaponServiceImp();
		boolean save = weaponService.ValidateAndThenSave(weaponDTO);
		System.out.println("saved:" + save);

	}

}
