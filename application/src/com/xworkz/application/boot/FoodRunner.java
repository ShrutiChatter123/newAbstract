package com.xworkz.application.boot;

import com.xworkz.application.dto.FoodDTO;
import com.xworkz.application.exception.EventMemoryFullException;
import com.xworkz.application.exception.EventValidException;
import com.xworkz.application.exception.FoodMemoryFullException;
import com.xworkz.application.exception.FoodValidException;
import com.xworkz.application.repositry.EventRepository;
import com.xworkz.application.repositry.EventRepositoryImp;
import com.xworkz.application.repositry.FoodRepository;
import com.xworkz.application.repositry.FoodRepositoryImp;
import com.xworkz.application.service.EventService;
import com.xworkz.application.service.EventServiceImp;
import com.xworkz.application.service.FoodService;
import com.xworkz.application.service.FoodServiceImp;

public class FoodRunner {

	public static void main(String[] args) {

		FoodDTO dto = new FoodDTO("payasa", 76, "bagalkot", 67.1, "shruti");

		FoodRepository repository = new FoodRepositoryImp();
		FoodService service = new FoodServiceImp(repository);

		FoodDTO dto1 = new FoodDTO("kosamri", 67, "banglore", 78.2, "kaveri");

		try {
			boolean save = service.validateAndSave(dto);
			System.out.println("saving:" + save);
			System.out.println("----------------------------------------");

			System.out.println(service.findbuyerbyShopGstAndCost(89, 67.1));
			System.out.println(service.find(dto1));

//			System.out.println(service.findByNameAndLocationAndCost("kosamri", "banglore", 67));
//			System.out.println("***************8");

//			service.findAll();

		} catch (FoodValidException e) {
			System.out.println(e.getMessage());
		} catch (FoodMemoryFullException e) {
			System.out.println(e.getMessage());
		}

	}
}