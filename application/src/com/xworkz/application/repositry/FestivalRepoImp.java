package com.xworkz.application.repositry;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class FestivalRepoImp implements FestivalRepository {

	private FestivalDTO[] fest=new FestivalDTO[5];
	private int festivalindex=0;
	
	@Override
	public boolean save(FestivalDTO dto) {
		System.out.println("running festival repo in implemtenta:"+ dto);
		if(this.festivalindex > this.fest.length) {
			System.out.println("repo is saved at index:"+this.festivalindex+" "+dto);
			this.festivalindex++;
			return true;
		}else {
			System.err.println("memory is full cannot add ,ore files,maximum allows");
			throw new FestivalMemoryFullException("handle the exception");
		}
	}

}
