package com.xworkz.application.service;

import com.xworkz.application.dto.FoodDTO;
import com.xworkz.application.exception.FoodValidException;

public interface FoodService {

	boolean validateAndSave(FoodDTO dto) throws FoodValidException;

	FoodDTO find(FoodDTO dto) throws FoodValidException;

	FoodDTO findByName(String name)throws FoodValidException;

	FoodDTO findByNameAndCost(String name, int cost)throws FoodValidException;

	FoodDTO[] findAll();

	FoodDTO findByNameAndLocationAndCost(String name, String location, int cost)throws FoodValidException;

	String findbuyerbyShopGstAndCost(int cost, double ShopGst)throws FoodValidException;

	int total()throws FoodValidException;

}
