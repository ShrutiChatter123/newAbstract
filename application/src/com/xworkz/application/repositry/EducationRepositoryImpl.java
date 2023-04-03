package com.xworkz.application.repositry;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.EducationMemoryFullException;

public class EducationRepositoryImpl implements EducationRepository {

	private EducationDTO[] value = new EducationDTO[20];
	private int indexValue = 0;

	@Override
	public boolean save(EducationDTO dto) {
		if (indexValue < value.length) {
			value[indexValue] = dto;
			indexValue++;
			System.out.println("Index value is " + indexValue + " " + dto);
			return true;
		}
		System.err.println("Memory is full,cannot add more files,max allowed is 3");
		throw new EducationMemoryFullException("Memory is full,cannot add more files,max allowed 3");
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (indexValue == 0) {
			System.out.println("First value will not check");
			return false;
		} else {
			System.out.println("First value onwards check");
			for (int index = 0; index < this.indexValue; index++) {
				EducationDTO temp = value[index];
				if (temp.equals(dto)) {
					System.out.println("DTO already exists");
					return true;
				}
			}

		}
		return EducationRepository.super.isExist(dto);
	}
	@Override
	public EducationDTO find(EducationDTO dto) {
		for(int index=0;index<this.indexValue;index++) {
			EducationDTO finds=this.value[index];
			if(finds.equals(dto)) {
				return finds;
			}
		}
		return EducationRepository.super.find(dto);
	}
	@Override
	public EducationDTO findByCandidateName(String name) {
		for(int index=0;index<this.indexValue;index++) {
			String findByName=this.value[index].getCandidateName();
			if(findByName.equals(name)) {
				return value[index];
			}
		}
		return EducationRepository.super.findByCandidateName(name);
	}
	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university) {
		for(int index=0;index<this.indexValue;index++) {
			String candidateName=value[index].getCandidateName();
			String universityName=value[index].getUniversity();
			if(candidateName.equals(name) && universityName.equals(university)) {
				return value[index];
			}
		}
		return EducationRepository.super.findByCandidateNameAndUniversity(name, university);
	}
	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String univarsity) {
		for(int index=0;index<this.indexValue;index++) {
			String name=this.value[index].getCandidateName();
			String degree=this.value[index].getDegreeName();
			String univarcity=this.value[index].getUniversity();
			if(name.equals(candidateName) && degree.equals(degreeName) && univarcity.equals(univarsity)) {
				return true;
			}
		}
		return EducationRepository.super.findBacklogByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
				univarsity);
	}
	@Override
	public EducationDTO findbyCandidateNameAndStartDateAndEndDAte(String candidateName, LocalDate startDate,
			LocalDate EndDate) {
		for(int index=0;index<this.indexValue;index++) {
			String name=value[index].getCandidateName();
			LocalDate start=value[index].getStartDate();
			LocalDate end=value[index].getEndDate();
			if(name.equals(candidateName) && start.equals(startDate) && end.equals(EndDate)) {
				return value[index];
			}
		}
		return EducationRepository.super.findbyCandidateNameAndStartDateAndEndDAte(candidateName, startDate, EndDate);
	}
	@Override
	public double findPercentageByCandidateName(String candidateName) {
		for(int index=0;index<this.indexValue;index++) {
			String name=value[index].getCandidateName();
			if(name.equals(candidateName)) {
				return 0;
			}
		}
		return EducationRepository.super.findPercentageByCandidateName(candidateName);
	}
	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String universityName) {
		for(int index=0;index<this.indexValue;index++) {
			String name=value[index].getCandidateName();
			String degree=this.value[index].getDegreeName();
			String university=this.value[index].getUniversity();
			if(name.equals(candidateName)&& degree.equals(degreeName) && university.equals(universityName)) {
				return value[index].getStream();
			}
		}
		return EducationRepository.super.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
				universityName);
	}
	@Override
	public int findIdByCandidateNameAndDegreeNameAndUnivaersity(String candidateName, String degreeName,
			String university) {
		for(int index=0;index<this.indexValue;index++) {
			String name=this.value[index].getCandidateName();
			String degree=this.value[index].getDegreeName();
			String uni=this.value[index].getUniversity();
			if(name.equals(candidateName)&& degree.equals(degreeName)&& uni.equals(university)) {
				return 0;
			}
		}
		return EducationRepository.super.findIdByCandidateNameAndDegreeNameAndUnivaersity(candidateName, degreeName,
				university);
	}
	@Override
	public String findUniversityByCandidateName(String CandidateName) {
		for(int index=0;index<this.indexValue;index++) {
			String name=this.value[index].getCandidateName();
			if(name.equals(CandidateName)) {
				return value[index].getCandidateName();
			}
		}
		return EducationRepository.super.findUniversityByCandidateName(CandidateName);
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.indexValue;
	}

}
