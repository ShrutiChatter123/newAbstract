package com.xworkz.application.repositry;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.DesertInvalidException;

public class DesertRepoImp implements DesertRepository {

	private DesertDTO[] dtos = new DesertDTO[20];
	private int index = 0;

	@Override
	public boolean save(DesertDTO dto) {
		if (this.index < this.dtos.length) {
			dtos[index] = dto;
			this.index++;
			System.out.println("saving is right");
			return true;
		} else {
			System.out.println("can not store beacuse memory is full");
		}

		return false;
	}
	
	@Override
	public boolean isExist(DesertDTO dto) {
		if(index==0) {
			System.out.println("can not count first element");
			return false;
		}else {
			System.out.println("first value onwards check");
		for(int index=0;index<dtos.length;index++) {
				DesertDTO temp=dtos[index];
				if(temp.equals(dto)) {
					System.out.println("dto exist");
					return true;
				}
				
				return false;
			}
		}
		return DesertRepository.super.isExist(dto);
	}
	
	@Override
	public DesertDTO find(DesertDTO dto) {
		for(int index=0;index<this.index;index++) {
			DesertDTO finds=this.dtos[index];
			if(finds.equals(dto)) {
				return finds;
			}
		}
		return DesertRepository.super.find(dto);
	}
	
	@Override
	public DesertDTO finByName(String name) {
		for(int index=0;index<this.index;index++) {
			DesertDTO temp=this.dtos[index];
			if(temp.equals(name)) {
				return temp;
			}
		}

		return DesertRepository.super.finByName(name);
	}
	

	@Override
	public double findByAreaByName(String name) {
		for (int index = 0; index < this.index; index++) {
			DesertDTO element1 = this.dtos[index];
			if (element1 != null && element1.getName().equals(name)) {
				double area = element1.getArea();
				return area;
			}
		}
		return 0;
	}
	
	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for(int index=0;index<dtos.length;index++) {
			DesertDTO temp=this.dtos[index];
			if(temp!=null&&temp.getName().equals(name)&&temp.getCountry().equals(country)&&temp.getArea()==area) {
				return temp;
			}
		}
		return DesertRepository.super.findByNameAndCountryAndArea(name, country, area);
	}
	@Override
	public int total() {
		return DesertRepository.super.total();
	}
}
