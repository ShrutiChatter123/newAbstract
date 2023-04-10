package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.repositry.DesertRepository;
import static com.xworkz.application.utility.DesertUtil.*;

public class DesertServiceImp implements DesertService {

	private DesertRepository repo;

	public DesertServiceImp(DesertRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(DesertDTO dto) throws DesertInvalidException {
		System.out.println("ruuning save in dto ");

		if (dto != null) {
			System.out.println("dto is not null:"+dto);

			
			
			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			int mintemp = dto.getMinTemp();
			int maxtemp = dto.getMaxTemp();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			if (validInt(id)) {
				System.out.println("id is valid");
				validId = true;
			} else {
				System.err.println("invalid id");
			}

			if (validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("invalid name");
			}
			if(validString(country)) {
				System.out.println("country is valid");
				validCountry=true;
			}else {
				System.err.println("Invalid country");
			}

			if (validDouble(area)) {
				System.out.println("area is valid");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}

			if (validInt(mintemp)) {
				System.out.println("mintemp is valid");
				validMinTemp = true;
			} else {
				System.err.println("mintemp is invalid");
			}

			if (validInt(maxtemp)) {
				System.out.println("maxtemp is valid");
				validMaxTemp = true;
			} else {
				System.err.println("maxtemp is invalid");
			}

			if (validFlags(validId, validName, validCountry, validArea, validMinTemp, validMaxTemp)) {
				System.out.println("dto is save");
					boolean exist=this.repo.isExist(dto);
					if(!exist) {
						boolean save = this.repo.save(dto);
						return save;
					}
					
				}else {
					System.err.println("data is invalid so not save");
					throw new DesertInvalidException("data is invalid");

			}
		}
			else {
				System.err.println("dto is null");
			}
		return false;
		
	
	}
		



	@Override
	public DesertDTO find(DesertDTO dto) throws DesertInvalidException {
		if (dto != null) {
			DesertDTO finds=this.repo.find(dto);
			return finds;
		}
		throw new DesertInvalidException("passing null dto");
	}

	@Override
	public DesertDTO findByName(String name) throws DesertInvalidException {
		if (validString(name)) {
			DesertDTO names=this.repo.finByName(name);
			return names;
		}
		throw new DesertInvalidException("data valid exception:passing invalid name ");
	}

	@Override
	public double findAreaByName(String name) throws DesertInvalidException {
		if ( validString(name)) {
			double fnd =this.repo.findAreaByName(name);
			return fnd;

		}
		throw new DesertInvalidException("data valid exception:passing inavalid name");
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area)
			throws DesertInvalidException {
		System.out.println("svrimpl: findByNameAndCountryAndArea() started");
		if (validString(name) && validString(country) && validDouble(area)) {
			DesertDTO nand=this.repo.findByNameAndCountryAndArea(name, country, area);
			System.out.println("svrimpl: findByNameAndCountryAndArea() ended");
			return nand;
		}
		throw new DesertInvalidException("data invalid :passing invalid name country area");
	}

	@Override
	public int total() {
		return this.repo.total();
	}

}
