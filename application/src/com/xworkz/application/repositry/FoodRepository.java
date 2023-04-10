package com.xworkz.application.repositry;

import com.xworkz.application.dto.FoodDTO;

public interface FoodRepository {

	default boolean isExist(FoodDTO dto) {

		return false;

	}

	boolean save(FoodDTO dto);

	default FoodDTO find(FoodDTO dto) {
		return null;

	}

	default FoodDTO findByName(String name) {
		return null;
	}

	default FoodDTO findByNameAndCost(String name, int cost) {
		return null;

	}

	default FoodDTO findByNameAndLocationAndCost(String name, String location, int cost) {
		return null;
	}

	public String findbuyerNamebyShopGstAndCost(int cost, double ShopGst);

	default int total() {
		return 0;

	}

	FoodDTO findByNameAndLocationAndCost(String location, int cost);

	FoodDTO[] findAll();

}
