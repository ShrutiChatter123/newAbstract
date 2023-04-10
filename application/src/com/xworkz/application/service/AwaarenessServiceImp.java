package com.xworkz.application.service;

import static com.xworkz.application.utility.DesertUtil.validDouble;
import static com.xworkz.application.utility.DesertUtil.validInt;
import static com.xworkz.application.utility.DesertUtil.validString;

import com.xworkz.application.dto.AwarenessDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.repositry.AwarenessRepository;
import com.xworkz.application.utility.DesertUtil;

public class AwaarenessServiceImp implements AwarenessService {

	private AwarenessRepository repo;

	public AwaarenessServiceImp(AwarenessRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(AwarenessDTO dto) throws DesertInvalidException {
		if (dto != null) {
			
			System.out.println("initializing dto");

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			int min = dto.getMinTemp();
			int max = dto.getMaxTemp();

			boolean validId=false;
			boolean validName=false;
			boolean validCountry=false;
			boolean validArea=false;
			boolean validMin=false;
			boolean validMax=false;
			
			if(DesertUtil.validInt(id)) {
				System.out.println("id is valid");
				validId=true;
			}else {
				System.out.println("id invalidAwaarenessServiceImp");
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

			if (validInt(min)) {
				System.out.println("mintemp is valid");
				validMin = true;
			} else {
				System.err.println("mintemp is invalid");
			}

			if (validInt(max)) {
				System.out.println("maxtemp is valid");
				validMax= true;
			} else {
				System.err.println("maxtemp is invalid");
			}
			
			if(DesertUtil.validFlags(validId,validName,validCountry,validArea,validMin,validMax)) {
				System.out.println("serviceimpl: all datas are valid, calling isexist() to check duplicate");
				
				boolean Exist=repo.isExist(dto);
				
				if(!Exist) {
					
					System.out.println("serviceimpl: no duplicate found hence calling repo.save() to save dto");
					boolean save=repo.save(dto);
				System.out.println("svrimpl: status of repo.save():"+save);
					System.out.println("serviceimpl exited");
					return save;
				}
			}else {
				System.out.println("data is invalid so dont save");
				throw new DesertInvalidException("invalid data");
			}
			
		}else {
			System.out.println("data is null");
		}

		return false;
	}
	
	@Override
	public AwarenessDTO find(AwarenessDTO dto) throws DesertInvalidException {
		if(dto!=null) {
			AwarenessDTO find=this.repo.find(dto);
			return find;
			
		}
		return AwarenessService.super.find(dto);
		
	
	}
	
	@Override
	public AwarenessDTO findByName(String name) throws DesertInvalidException {
		if(DesertUtil.validString(name)) {
			AwarenessDTO happy=this.repo.finByName(name);
			return happy;
		}
		return AwarenessService.super.findByName(name);
	}
	
	@Override
	public double findAreaByName(String name) throws DesertInvalidException {
		if(DesertUtil.validString(name)) {
			double arna=this.repo.findAreaByName(name);
			return arna;
		}
		return AwarenessService.super.findAreaByName(name);
	}
	
	@Override
	public AwarenessDTO findByNameAndCountryAndArea(String name, String country, double area)
			throws DesertInvalidException {
		if(DesertUtil.validString(name)&&DesertUtil.validString(country)&&DesertUtil.validDouble(area)) {
			AwarenessDTO NCA=this.repo.findByNameAndCountryAndArea(name, country, area);
			return NCA;
		}
		return AwarenessService.super.findByNameAndCountryAndArea(name, country, area);
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}

}
