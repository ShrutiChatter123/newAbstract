package com.xworkz.application.repositry;

import com.xworkz.application.dto.SoftwareDTO;

public class SoftwareDTORepoImp implements SoftwareRepository {

	private SoftwareDTO softwareDTOs[] = new SoftwareDTO[5];
	private int index = 0;

	@Override
	public boolean save(SoftwareDTO dto) {

		if (this.index < this.softwareDTOs.length) {
			softwareDTOs[index] = dto;
			this.index++;
			System.out.println("saving can be correct");
			return true;
		} else {
			System.err.println("we cannot save bcz memory is full");
		}
		return false;
	}

	@Override
	public boolean isExist(SoftwareDTO dto) {
		if (index == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			System.out.println("DTO will check onwards first elememt");
			for (int i = 0; i < softwareDTOs.length; i++) {
				SoftwareDTO ref = this.softwareDTOs[i];
				if (ref.equals(dto)) {
					System.out.println("dto is exists");
					return true;
				} else {
					System.out.println("dto is not exists");
				}
			}
		}

		return false;
	}

	@Override
	public int totalSave() {

		return this.index;
	}

	@Override
	public SoftwareDTO findById(int id) {

		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getId() == id) {
				System.out.println("dto is found for id :" + id);
				return ref;
			}

		}

		return null;
	}

	@Override
	public SoftwareDTO findByName(String name) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref;
			}
		}
		return null;
	}

	@Override
	public SoftwareDTO findByNameAndId(String name, int id) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getId() == id && ref.getName().equals(name)) {
				System.out.println("dto is found for id and name");
				return ref;
			}
		}
		return null;

	}

}
