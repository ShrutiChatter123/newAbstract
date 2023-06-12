package com.xworkz.bloodDonation.service;

import com.xworkz.dto.BloodDonationDTO;

public interface BloodDonationService {

	boolean validateAndSave(BloodDonationDTO dto);
	
}
