package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.repositry.DesertRepository;
import com.xworkz.application.utility.DesertUtil;

public class DesertServiceImp implements DesertService {

	private DesertRepository repo;

	public DesertServiceImp(DesertRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(DesertDTO dto) throws DesertInvalidException {
		System.out.println("dto is not null now validation");

		if (dto != null) {
			System.out.println("dto is not invalid");

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			int mintemp= dto.getMinTemp();
			int maxtemp =  dto.getMaxTemp();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			if (DesertUtil.validInt(id)) {
				System.out.println("id is valid");
				validId = true;
			} else {
				System.out.println("invalid id");
			}
			
		if(DesertUtil.validString(name)) {
			System.out.println("name is valid");
			validName=true;
		}else {
			System.out.println("invalid name");
		}
		
		if(DesertUtil.validDouble(area)) {
			System.out.println("area is valid");
			validArea=true;
		}else {
			System.out.println("invalid area");
		}
		
		if(DesertUtil.validInt(mintemp)) {
			System.out.println("mintemp is valid");
			validMinTemp=true;
		}else {
			System.out.println("mintemp is invalid");
		}
		
		if(DesertUtil.validInt(maxtemp)) {
			System.out.println("maxtemp is valid");
			validMaxTemp=true;
		}else {
			System.out.println("maxtemp is invalid");
		}

		
		if(DesertUtil.validFlags(validId,validName,validCountry,validArea,validMinTemp,validMaxTemp)) {
			System.out.println("dto is save");
			boolean exist = this.repo.isExist(dto );
			if (!exist) {
				boolean save = this.repo.save(dto);
				System.out.println("DTO is not duplicate save it");
				return save;
		}else {
			System.err.println("DTO is dupliacte so dont save ");
			throw new DesertInvalidException("data is invalid");
		}
		}else {
			System.err.println("Validation Not Done so dont save");
		}
	} else {
		System.err.println("Dto is null so dont validate");
	}
	return false;

	
	}
	
	@Override
	public DesertDTO find(DesertDTO dto) throws DesertInvalidException {
		if(dto!=null) {
			this.repo.find(dto);
		}
		throw new DesertInvalidException("passing null dto");
	}
	
	@Override
	public DesertDTO findByName(String name) throws DesertInvalidException {
		if(DesertUtil.validString(name)) {
			this.repo.finByName(name);
		}
		throw new DesertInvalidException("data valid exception:passing invalid name ");
	}
	
	@Override
	public double findAreaByName(String name) throws DesertInvalidException {
		if(DesertUtil.validDouble(0)&&DesertUtil.validString(name)) {
			this.repo.findByAreaByName(name);
			
		}
		throw new DesertInvalidException("data valid exception:passing inavalid name");
	}
	
	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area)
			throws DesertInvalidException {
		if(DesertUtil.validString(name)&&DesertUtil.validString(country)&&DesertUtil.validDouble(area)) {
			this.repo.findByNameAndCountryAndArea(name, country, area);
		}
		throw new DesertInvalidException("data invalid :passing invalid name country area");
	}
	
	@Override
	public int total() {
		return DesertService.super.total();
	}
	
	
	


}
