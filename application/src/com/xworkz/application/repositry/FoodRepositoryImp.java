package com.xworkz.application.repositry;

import com.xworkz.application.dto.EventDTO;
import com.xworkz.application.dto.FoodDTO;

public class FoodRepositoryImp implements FoodRepository {

	private FoodDTO[] dtos = new FoodDTO[3];

	private int index = 0;

	@Override
	public boolean save(FoodDTO dto) {
		if (this.index < dtos.length) {
			dtos[index] = dto;
			this.index++;
			System.out.println("saving is correct:" + this.index + " " + dto);
			return true;
		} else {
			System.out.println("memory is full can not store");
		}
		return false;
	}

	@Override
	public boolean isExist(FoodDTO dto) {
		if (index == 0) {
			System.out.println("can not check first element");
			return false;
		} else {
			System.out.println("onwards first element");
			for (int index = 0; index < this.index; index++) {
				FoodDTO event = this.dtos[index];
				if (event.equals(dtos)) {
					System.out.println("passing invalid event");
					return true;

				}
			}
		}
		return false;
	}

	@Override
	public FoodDTO find(FoodDTO dto) {
		for (int index = 0; index < this.index; index++) {
			FoodDTO find = this.dtos[index];
			if (find.equals(dto)) {
				System.out.println("passing invalid dto");
				return find;
			}
		}
		return FoodRepository.super.find(dto);
	}

	@Override
	public FoodDTO findByName(String name) {
		for (int index = 0; index < this.index; index++) {
			FoodDTO names = dtos[index];
			if (names.getName().equals(name)) {
				System.out.println("data invalid name passing");
				return names;
			}
		}
		return null;
	}

	@Override
	public FoodDTO findByNameAndCost(String name, int cost) {
		for (int index = 0; index < this.index; index++) {
			FoodDTO ncost = dtos[index];
			if (ncost.getName().equals(name) && ncost.getCost() == cost) {
				System.out.println("passing invalid cost");
				return ncost;
			}
		}
		return null;
	}

	@Override
	public FoodDTO findByNameAndLocationAndCost(String location, int cost) {
		for (int index = 0; index < this.index; index++) {
			FoodDTO local = this.dtos[index];
			if (local.getLocation().equals(location) && local.getCost() == cost) {
				System.out.println("passing invalid location,cost");
				return local;
			}
		}
		return null;
	}

	@Override
	public String findbuyerNamebyShopGstAndCost(int cost, double ShopGst) {

		for (int index = 0; index < this.index; index++) {
			FoodDTO yosh = this.dtos[index];
			if (yosh.getCost() == cost && yosh.getShopGstNo() == ShopGst) {
				System.out.println("dto with this cost and shopGst exists :" + cost + ShopGst);
				return yosh.getBuyerName();
			}
		}

		return null;
	}

	@Override
	public int total() {
		return this.index;
	}

	@Override
	public FoodDTO[] findAll() {
		if (this.index != 0) {
			return dtos;
		}
		return null;
	}

}
