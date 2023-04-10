package com.xworkz.application.service;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.dto.FunctionDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.repositry.FunctionRepository;
import com.xworkz.application.utility.DesertUtil;

public class FunctionServiceImp implements FunctionService {

	private FunctionRepository repo;

	public FunctionServiceImp(FunctionRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validatAndSave(FunctionDTO dto) throws DesertInvalidException {

		if (dto != null) {
			System.out.println("dto is not null checking the data");

			int date = dto.getDate();
			String name = dto.getName();
			String location = dto.getLocation();
			double rent = dto.getAreaRent();

			boolean validDate = false;
			boolean validName = false;
			boolean validLocation = false;
			boolean validRent = false;

			if (DesertUtil.validInt(date)) {
				System.out.println("date is valid");
				validDate = true;
			} else {
				System.err.println("date invalid");
			}

			if (DesertUtil.validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name invalid");
			}

			if (DesertUtil.validString(location)) {
				System.out.println("location is valid");
				validLocation = true;
			} else {
				System.err.println("invalid location");
			}

			if (DesertUtil.validDouble(rent)) {
				System.out.println("rent is valid");
				validRent = true;
			} else {
				System.out.println("invalid rent");
			}

			if (DesertUtil.validFlags(validDate, validName, validLocation, validRent)) {
				System.out.println("all datas are valid, calling isExist to check duplicate");

				boolean Exist = this.repo.isExist(dto);
				if (!Exist) {
					System.out.println("srvcimpl: no duplicate found, calling repo.save()");
					boolean save = this.repo.save(dto);
					System.out.println("svrcimpl: status of save:"+save);
					return save;
					
				
				} 
				}else {
					System.out.println("data is invalid so not save");

				throw new DesertInvalidException("data is invalid");

			}
		
	}else {
		System.out.println("data is null");
		
	}
		return false;
	}
		
	@Override
	public FunctionDTO find(FunctionDTO dto) throws DesertInvalidException {
		if(dto!=null) {
			FunctionDTO find=this.repo.find(dto);
			System.out.println("svrc: find() ended");
			return find;
		}
	throw new DesertInvalidException("passing null dto");
	}
	
	@Override
	public FunctionDTO findByNameAndLocation(String name, String location) throws DesertInvalidException {
		if(DesertUtil.validString(name)&& DesertUtil.validString(location)) {
			FunctionDTO findByNameAndLocation =repo.findByNameAndLocation(name, location);
			return findByNameAndLocation;
			
		}
		throw new DesertInvalidException("passing invalid name and location");
	}
	
	
	
	
	
	
	}
