

package com.xworkz.application.repositry;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.MemoryFullException;

public class DesertRepoImp implements DesertRepository {

	private DesertDTO[] dtos = new DesertDTO[21];
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
			throw new MemoryFullException("can not store beacuse memory is full");
		}
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
				if(temp!=null && temp.equals(dto)) {
					System.out.println("dto exist");
					return true;
				}
				
			
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
			if(temp.getName().equals(name)) {
				return temp;
			}
		}

		return DesertRepository.super.finByName(name);
	}
	

	@Override
	public double findAreaByName(String name) {
		for (int index = 0; index < this.index; index++) {
			DesertDTO element1 = this.dtos[index];
			if (name.equals(element1.getName())) {
				double area = element1.getArea();
				return area;
			}
		}
		return 0;
	}
	
	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		System.out.println("repo: findByNameAndCountryAndArea() started");
		for(int index=0;index<this.index;index++) {
			DesertDTO temp=this.dtos[index];
			if(temp.getName().equals(name)&&temp.getCountry().equals(country)&&temp.getArea()==area) {
				System.out.println("repo: findByNameAndCountryAndArea() ended");
				return temp;
			}
		}
		return DesertRepository.super.findByNameAndCountryAndArea(name, country, area);
		
		
	}
	@Override
	public int total() {
		return this.index;
	}
}
