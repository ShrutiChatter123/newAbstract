package com.xworkz.application.repositry;

import com.xworkz.application.dto.FestivalDTO;

public interface FestivalRepository {

	public boolean save(FestivalDTO repo) throws RuntimeException;

}
