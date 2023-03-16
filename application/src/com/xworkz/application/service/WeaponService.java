package com.xworkz.application.service;

import com.xworkz.application.dto.WeaponDTO;

public interface WeaponService {

	boolean ValidateAndThenSave(WeaponDTO dto);
}
