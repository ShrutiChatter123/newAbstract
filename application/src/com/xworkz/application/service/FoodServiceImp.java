package com.xworkz.application.service;

import com.xworkz.application.dto.FoodDTO;
import com.xworkz.application.exception.FoodValidException;
import com.xworkz.application.repositry.FoodRepository;
import com.xworkz.application.utility.DesertUtil;

public class FoodServiceImp implements FoodService {

	private FoodRepository repo;

	public FoodServiceImp(FoodRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(FoodDTO dto) throws FoodValidException {

		if (dto != null) {
			System.out.println("dto is not invalid now validating:" + dto);

			String name = dto.getName();
			int cost = dto.getCost();
			String location = dto.getLocation();
			double shopGstNo = dto.getShopGstNo();
			String buyername = dto.getBuyerName();

			boolean validName = false;
			boolean validCost = false;
			boolean validLocation = false;
			boolean validShopGstNo = false;
			boolean validBuyerName = false;

			if (DesertUtil.validString(name)) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name invalid");
			}

			if (DesertUtil.validInt(cost)) {
				System.out.println("cost valid");
				validCost = true;
			} else {
				System.err.println("cost invalid");
			}

			if (DesertUtil.validString(location)) {
				System.out.println("location valid");
				validLocation = true;
			} else {
				System.err.println("location invalid");
			}

			if (DesertUtil.validDouble(shopGstNo)) {
				System.out.println("shopGstNo is valid");
				validShopGstNo = true;
			} else {
				System.err.println("shopGstNo invalid");
			}

			if (DesertUtil.validString(buyername)) {
				System.out.println("buyername valid");
				validBuyerName = true;
			} else {
				System.err.println("buyername invalid");
			}

			if (DesertUtil.validFlags(validName, validCost, validLocation, validShopGstNo, validBuyerName)) {
				System.out.println("data is valid now calling isExist to check");

				boolean exist = this.repo.isExist(dto);
				if (!exist) {
					boolean save = this.repo.save(dto);
					return save;
				}
			} else {

				System.out.println("data is invalid  so dont save");
				throw new FoodValidException("data is invalid ");
			}

		} else {
			System.err.println("dto is null");

		}
		return false;
	}

	@Override
	public FoodDTO find(FoodDTO dto)throws FoodValidException  {
		if (validateAndSave(dto)) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public FoodDTO findByName(String name) {
		if (DesertUtil.validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public FoodDTO findByNameAndCost(String name, int cost) {
		if (DesertUtil.validString(name) && DesertUtil.validInt(cost)) {
			return this.repo.findByNameAndCost(name, cost);
		}
		return null;
	}

	@Override
	public FoodDTO findByNameAndLocationAndCost(String name, String location, int cost) {
		if (DesertUtil.validString(name) && DesertUtil.validString(location) && DesertUtil.validInt(cost)) {
			return this.findByNameAndLocationAndCost(name, location, cost);
		}
		return null;
	}

	@Override
	public String findbuyerbyShopGstAndCost(int cost, double ShopGst) {
		if (DesertUtil.validInt(cost) && DesertUtil.validDouble(ShopGst)) {
			return this.repo.findbuyerNamebyShopGstAndCost(cost, ShopGst);
		}
		return null;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

	@Override
	public FoodDTO[] findAll() {
		FoodDTO[] ownArray = new FoodDTO[3];
		FoodDTO[] repoArray = this.repo.findAll();
		int i = 0;

		if (i < repoArray.length) {
			for (int j = 0; j < ownArray.length; j++) {
				if (repoArray[j] != null) {
					ownArray[i] = repoArray[j];
					System.out.println(ownArray[i]);
					i++;

				}
			}
		}

		return ownArray;
	}

}
