package com.xworkz.application.repositry;

import java.time.LocalDate;

import com.xworkz.application.dto.ProjectDTO;

public class ProjectRepositoryImp implements ProjectRepository {
	
	public ProjectDTO[] dtos=new ProjectDTO[4];
	
	private int ProjectIndex=0;
	
	@Override
	public boolean save(ProjectDTO dto) {
		if(this.ProjectIndex<dtos.length) {
			dtos[ProjectIndex]=dto;
			this.ProjectIndex++;
			System.out.println("saving is correct");
			return true;
		}else {
			System.out.println("can not store bcz memory is full");
		}
		return false;
	}

	@Override
	public boolean isExist(ProjectDTO dto) {
		if(ProjectIndex==0) {
			System.out.println("can not check first element");
			return false;
		}else {
			System.out.println("onwards first element");
			for(int i=0;i<this.ProjectIndex;i++) {
				ProjectDTO temp=dtos[i];
				if(temp!=null &&temp.equals(dto)) {
					System.out.println("dto is alreday exist");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public ProjectDTO find(ProjectDTO dto) {
		for(int i=0;i<this.ProjectIndex;i++) {
			ProjectDTO find=dtos[i];
			if(find.equals(dto)) {
				return find;
			}
		}
		return null;
	}

	@Override
	public ProjectDTO findByName(String name) {
		for(int i=0;i<this.ProjectIndex;i++) {
			ProjectDTO namee=dtos[i];
			if(namee.getName().equals(name)) {
				return namee;
			}
		}
		return null;
	}

	@Override
	public ProjectDTO findByNameAndCountry(String name, String Country) {
		for(int i=0;i<this.ProjectIndex;i++) {
			ProjectDTO count=dtos[i];
			if(count.getName().equals(name)&&count.getCountry().equals(Country)) {
				return count;
			}
		}
		return null;
	}

	@Override
	public ProjectDTO findNameByCountryAndId(String Country, int id) {
		for(int i=0;i<this.ProjectIndex;i++) {
			ProjectDTO yes=dtos[i];
			if(yes.getCountry().equals(Country)&&yes.getId()==id) {
				return yes;
			}
		}
		return null;
	}

	@Override
	public ProjectDTO findByNameAndStartDateAndEndDate(String name, LocalDate startdate, LocalDate endDate) {
		
		for(int i=0;i<this.ProjectIndex;i++) {
			ProjectDTO mba=dtos[i];
			if(mba.getName().equals(name)&&mba.getStartDate().equals(startdate)&&mba.getEndDate().equals(endDate)) {
				return mba;
			}
		}
		return null;
	}
	@Override
	public ProjectDTO[] findAll() {
		if (ProjectIndex != 0) {
			return dtos;
		}
		return null;
	}
	
	@Override
	public int total() {
		return this.ProjectIndex;
	}

	
}
