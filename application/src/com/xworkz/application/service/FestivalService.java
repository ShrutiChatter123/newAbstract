package com.xworkz.application.service;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface FestivalService {

	public boolean validThenSave(FestivalDTO dto)throws InvalidFestivalException;
}
