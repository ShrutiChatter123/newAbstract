package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.constance.Location;
import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;
import com.xworkz.electricity.repository.ShowRoomRepositoryImpl;
import com.xworkz.electricity.service.ShowRoomService;
import com.xworkz.electricity.service.ShowRoomServiceImpl;

public class ShowRoomRunner {

	public static void main(String[] args) {

		ShowRoomDTO dto = new ShowRoomDTO(31, "TVSPoint", Location.BAGALKOT, 33343, LocalDate.of(1994, 5, 12),
				LocalDate.of(2022, 3, 17));

		ShowRoomRepository repository = new ShowRoomRepositoryImpl();

		ShowRoomService service = new ShowRoomServiceImpl(repository);
		boolean refrence = service.validateAndSave(dto);
		System.out.println(refrence);
	}
}
