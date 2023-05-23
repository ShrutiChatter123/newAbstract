package com.xworkz.springcrud.repository;

import com.xworkz.springcrud.dto.CompanyDTO;

public interface CompanyRepository {

	boolean save(CompanyDTO dto);
}
