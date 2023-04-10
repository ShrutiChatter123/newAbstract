package com.xworkz.application.repositry;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.dto.EventDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.EventValidException;
import com.xworkz.application.service.EventService;

public class EventRepositoryImp implements EventRepository {

	private EventDTO[] dtos = new EventDTO[5];
	private int eventindex = 0;
	@Override
	public boolean save(EventDTO dto) throws EventValidException {
		if(eventindex<dtos.length) {
			dtos[eventindex]=dto;
			this.eventindex++;
			System.out.println("saving is correct");
			return true;
		}
		System.out.println("can not store bcz memory is full");
		throw new EventValidException("memory is full");
	}
	
	@Override
	public boolean isExist(EventDTO dto) {
		if(eventindex==0) {
			System.out.println("can not check first element");
			return false;
		}else {
			System.out.println("onwards first element");
			for(int i=0;i<this.eventindex;i++) {
				EventDTO temp=dtos[i];
				if(temp.equals(dto)) {
					System.out.println("dto aready exst");
					return true;
				}
			}
		}
		return EventRepository.super.isExist(dto);
	}
	
	@Override
	public EventDTO find(EventDTO dto) throws EventValidException {
		for(int i=0;i<this.eventindex;i++) {
			EventDTO find=dtos[i];
			if(find.equals(dto)) {
			return find;
			}
		}
		return EventRepository.super.find(dto);
	}
	
	@Override
	public EventDTO findFindByName(String name) throws EventValidException {
		for(int i=0;i<this.eventindex;i++) {
			EventDTO fname=dtos[i];
			if(fname.getName().equals(name)) {
				return fname;
			}
		}
		return EventRepository.super.findFindByName(name);
	}
	
	@Override
	public EventDTO findByNameAndLocation(String name, String location) throws EventValidException {
		for(int i=0;i<eventindex;i++) {
			EventDTO nalo=dtos[i];
			if(nalo.getName().equals(name)&&nalo.getLocation().equals(location)) {
				return nalo;
			}
		}
		
		return EventRepository.super.findByNameAndLocation(name, location);
	}
	
	@Override
	public EventDTO findByNameOrAreaRentOrhallCost(int date, String name, double hallCost) throws EventValidException {
		for(int i=0;i<this.eventindex;i++) {
			EventDTO hall=dtos[i];
			if(hall.getDate()==date|| hall.getName().equals(name)||hall.getHallCost()==hallCost) {
				return hall;
			}
		}
		return EventRepository.super.findByNameOrAreaRentOrhallCost(date, name, hallCost);
	}

	public int total() {
		return this.eventindex;
	}
	
	
	
	
	
}