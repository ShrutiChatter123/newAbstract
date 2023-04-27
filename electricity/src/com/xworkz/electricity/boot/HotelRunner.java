package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.constance.Location;
import com.xworkz.electricity.dto.HotelDTO;
import com.xworkz.electricity.repository.HotelRepository;
import com.xworkz.electricity.repository.HotelRepositoryImpl;
import com.xworkz.electricity.service.HotelService;
import com.xworkz.electricity.service.HotelServiceImpl;

public class HotelRunner {

	public static void main(String[] args) {

		HotelDTO dto = new HotelDTO(21, "rajvath", Location.BAGALKOT, 45L, LocalDate.of(1994, 7, 12),
				LocalDate.of(2022, 3, 11), true);

		HotelRepository repository = new HotelRepositoryImpl();

		HotelService service = new HotelServiceImpl(repository);
		boolean ref = service.validateAndSave(dto);
		System.out.println(ref);
	}
}
