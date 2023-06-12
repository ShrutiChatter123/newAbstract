package com.xworkz.bloodDonation.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.bloodDonation.entity.BloodDonationEntity;
import com.xworkz.dto.BloodDonationDTO;

@Service
public class BloodDonationServiceImpl implements BloodDonationService {

	public BloodDonationServiceImpl() {
		System.out.println("Running" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BloodDonationDTO dto) {
		System.out.println("Excecuting validate and save method...");
		BloodDonationEntity entity = new BloodDonationEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(entity);

		return true;
	}

}
