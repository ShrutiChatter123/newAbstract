package com.xworkz.application.repositry;

import com.xworkz.application.dto.FunctionDTO;

public class FunctionRepositoryImp implements FunctionRepository {

	private FunctionDTO[] dtos = new FunctionDTO[10];

	private int index = 0;

	@Override
	public boolean save(FunctionDTO dto) {
		if (this.index < dtos.length) {
			dtos[index] = dto;
			System.out.println("" + "" + "" + "" + "saved dto in dtos[" + index + ":" + dtos[index]);
			this.index++;
			return true;
		} else {
			System.out.println("memory is full can not store");
		}

		return false;
	}

	@Override
	public boolean isExist(FunctionDTO dto) {
		if (index == 0) {
			System.out.println("can not check first elemenent");
			return false;
		} else {
			System.out.println("onwards first element");
			for (int index = 0; index < this.index; index++) {
				if (dto.equals(dtos[index])) {
					System.out.println("this record already exist");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public FunctionDTO find(FunctionDTO dto) {
		for (int index = 0; index < this.index; index++) {
			FunctionDTO find = dtos[index];
			if (dto.equals(find)) {
				System.out.println("repo: requested dto found in repo");
				return find;
			}
		}
		return null;
	}

	@Override
	public FunctionDTO findFindByName(String name) {
		for (int index = 0; index < this.index; index++) {
			FunctionDTO byname = dtos[index];
			if (byname != null && byname.equals(byname)) {
				return byname;
			}
		}
		return FunctionRepository.super.findFindByName(name);
	}

	@Override
	public FunctionDTO findByNameAndLocation(String name, String location) {

		for (int index = 0; index < this.index; index++) {
			FunctionDTO nalo = dtos[index];
			if (nalo.getName().equals(name) && nalo.getLocation().equals(location))
				;
			return nalo;
		}
		return FunctionRepository.super.findByNameAndLocation(name, location);
	}

	@Override
	public FunctionDTO findBydateAndNameAndAreaRent(int date, String name, double AreaRent) {
		for (int index = 0; index < dtos.length; index++) {
			FunctionDTO dar = dtos[index];
			if (dar.getDate() == date && dar.getName().equals(name) && dar.getAreaRent() == AreaRent) {
				return dar;

			}
		}

		return FunctionRepository.super.findBydateAndNameAndAreaRent(date, name, AreaRent);
	}

	@Override
	public int total() {

		return this.index;
	}

}