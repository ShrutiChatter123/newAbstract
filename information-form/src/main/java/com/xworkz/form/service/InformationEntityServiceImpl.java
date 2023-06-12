package com.xworkz.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.form.entity.InformationEntity;
import com.xworkz.form.repository.InformationRepo;

@Service
public class InformationEntityServiceImpl implements InformationEntityService {

	@Autowired
	private InformationRepo repo;
	
	@Override
	public boolean validateAndSave(InformationEntity entity) {
		boolean save=repo.save(entity);
		return save;
	}

}
