package com.xworkz.application.repositry;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessRepositoryImp implements AwarenessRepository {

	private AwarenessDTO[]dtos=new AwarenessDTO[4];
	private int index=0;
	
	
	@Override
	public boolean save(AwarenessDTO dto) {
		//int i=0;
		if(index<dtos.length) {
			dtos[index]=dto;
			System.out.println("repo: dtos["+index+"]: "+dtos[index]);
			index++;
			return true;
			
		}else {
			System.out.println("memory full cannot store");
		}
		return false;
	}
	
	@Override
	public boolean isExist(AwarenessDTO dto) {
		if(index==0) {
			System.out.println("can not check first element");
			return false;
		}else {
			System.out.println("onward first element");
			for(int index=0;index<dtos.length;index++) {
				AwarenessDTO Exist=dtos[index];
				if(Exist!=null&& Exist.equals(dto)) {
					System.out.println("dto exist");
					return true;
				}
			}
		}

		return false;
	}
	
	@Override
	public AwarenessDTO find(AwarenessDTO dto) {
		for(int index=0;index<this.index;index++) {
			AwarenessDTO find=dtos[index];
			if(find!=null&& find.equals(dto)) {
				System.out.println("invalid dto");
				return find;
			}
		}
		return AwarenessRepository.super.find(dto);
	}
	
	@Override
	public AwarenessDTO finByName(String name) {
		for(int index=0;index<this.index;index++) {
			AwarenessDTO namee=dtos[index];
			if(namee!=null&& namee.getName().equals(namee)) {
				System.out.println("passing invalid name");
				return namee;
			}
		}
		return AwarenessRepository.super.finByName(name);
	}
	
	@Override
	public double findAreaByName(String name) {
		for(int index=0;index<this.index;index++) {
			AwarenessDTO An=dtos[index];
			if(An!=null&& An.getName().equals(name)) {
				double area=An.getArea();
				return area;
			}
		}
		return AwarenessRepository.super.findAreaByName(name);
	}
	
	@Override
	public AwarenessDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for(int index=0;index<dtos.length;index++) {
			AwarenessDTO happy=dtos[index];
			if(happy!=null&& happy.getName().equals(name)&& happy.getCountry().equals(country)&&happy.getArea()==area) {
				return happy;
			}
		}
		return AwarenessRepository.super.findByNameAndCountryAndArea(name, country, area);
	}
	
	@Override
	public int total() {
		return this.index;
	}
	
}
