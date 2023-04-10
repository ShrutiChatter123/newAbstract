package com.xworkz.application.service;

import com.xworkz.application.dto.EventDTO;
import com.xworkz.application.dto.FunctionDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.EventMemoryFullException;
import com.xworkz.application.exception.EventValidException;
import com.xworkz.application.repositry.EventRepository;
import com.xworkz.application.utility.DesertUtil;

public class EventServiceImp implements EventService {

	private EventRepository repo;

	public EventServiceImp(EventRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validatAndSave(EventDTO dto) throws EventValidException {
		if (dto != null) {
			System.out.println("dto is not null now validating");

			String name = dto.getName();
			String locatio = dto.getLocation();
			double hallCost = dto.getHallCost();
			int family = dto.getFamilymemeber();
			int date = dto.getDate();

			boolean ValidName = false;
			boolean validLocation = false;
			boolean validHallCost = false;
			boolean validFamily = false;
			boolean validDate = false;

			if (DesertUtil.validString(name)) {
				System.out.println("name valid");
				ValidName = true;
			} else {
				System.out.println("name invalid");
			}

			if (DesertUtil.validString(locatio)) {
				System.out.println("location is valid");
				validLocation = true;
			} else {
				System.out.println("location invalid");
			}

			if(DesertUtil.validdouble(hallCost)) {
				System.out.println("hallCost is valid");
				validHallCost= true;
			}else {
				System.out.println("hallCost invalid");
			}

			if (DesertUtil.validInt(family)) {
				System.out.println("family is valid");
				validFamily = true;
			} else {
				System.out.println("family invalid");
			}

			if (DesertUtil.validInt(date)) {
				System.out.println("date is valid ");
				validDate = true;
			} else {
				System.out.println("date invalid");
			}

			if (DesertUtil.validFlags(ValidName, validLocation, validDate, validFamily, validHallCost)) {
				System.out.println("data is valid so calling is exist to verify");

				boolean Exist = this.repo.isExist(dto);
					if (!Exist) {
						boolean save = this.repo.save(dto);
						return save;

					}
				 else {
					System.out.println("data is invalid so not save");

					throw new EventValidException("data is invalid");

				}

			} else {
				System.out.println("data is null");

			}
			return false;
		}
		return false;
	}

	@Override
	public EventDTO find(EventDTO dto) throws EventValidException {
		if (dto != null) {
			EventDTO find = this.repo.find(dto);
			System.out.println("svrc: find() ended");
			return find;
		}
		throw new EventMemoryFullException("passing null dto");
	}

	@Override
	public EventDTO findFindByName(String name) throws EventValidException {
		if (DesertUtil.validString(name)) {
			EventDTO Name = this.repo.findFindByName(name);
			return Name;
		}
		throw new EventValidException("passing invalid name");
	}

	@Override
	public EventDTO findByNameAndLocation(String name, String location) throws EventValidException {

		if (DesertUtil.validString(name) && DesertUtil.validString(location)) {
			EventDTO namelocation = this.repo.findByNameAndLocation(name, location);
			return namelocation;
		}

		throw new EventValidException("passing inavlid name and location");
	}

	@Override
	public EventDTO findByNameOrlocationOrhallCost(String name, String location, double hallCost)
			throws EventValidException {
		if (DesertUtil.validString(name) || DesertUtil.validString(location) || DesertUtil.validDouble(hallCost)) {
			EventDTO nlh = this.repo.findByNameOrAreaRentOrhallCost(0, name, hallCost);
			return nlh;
		}
		throw new EventValidException("passing invalid name or location or hallCost");
	}

}
