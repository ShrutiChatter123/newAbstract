package com.xworkz.application.repositry;

import com.xworkz.application.dto.PracticeDTO;

public class PracticeDTORepoImp implements PracticeRepository {

	private PracticeDTO practiceDTOs[] = new PracticeDTO[5];
	private int index = 0;

	@Override
	public boolean save(PracticeDTO dto) {
		if (this.index < practiceDTOs.length) {
			practiceDTOs[index] = dto;
			this.index++;
			System.out.println("saving is right");
			return true;
		} else {
			System.out.println("MEMORY IS FULL CAN NOT STORE element");
		}
		return false;
	}

	@Override
	public boolean isExist(PracticeDTO dto) {
		if (index == 0) {
			System.out.println("can not check first index");
			return false;

		} else {
			System.out.println("DTO will check the saving order");
			for (int index = 0; index < practiceDTOs.length; index++) {
				PracticeDTO ref = this.practiceDTOs[index];
				if (ref.equals(ref)) {
					System.out.println("index exist");
					return true;
				} else {
					System.out.println("index not exist");
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
	public PracticeDTO findById(int id) {
		for (int index = 0; index < practiceDTOs.length; index++) {
			PracticeDTO ref = this.practiceDTOs[index];
			if (ref.getId() == id) {
				System.out.println("dto is found for id:" + id);
				return ref;
			}
		}
		return null;

	}
	
	@Override
	public PracticeDTO findByName(String name) {
		for(int index=0;index<practiceDTOs.length; index++) {
			PracticeDTO ref=this.practiceDTOs[index];
			if(ref.getName().equals(name)) {
				System.out.println("DTO is found for name:"+name);
				return ref;
			}
		}
		return null;
	}

	@Override
	public PracticeDTO findByNameandIDd(String name, int id) {
		for(int index=0;index<practiceDTOs.length;index++) {
			PracticeDTO ref=this.practiceDTOs [index];
			if(ref.getName().equals(name)&&ref.getId()==id) {
				System.out.println("DTO is founfd for id and name");
				return ref;
			}
		}
		return null;
	}
	
}
