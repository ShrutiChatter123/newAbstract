package com.xworkz.springcrud.service;

import com.xworkz.springcrud.dto.CompanyDTO;

public interface CompanyService {

	boolean validateAndSave(CompanyDTO dto);
}
