package com.xworkz.application.repositry;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRepoImp implements ApplicationRepositry {

	private ApplicationDTO[] apps = new ApplicationDTO[5];
	private int appsindex = 0;

	@Override
	public boolean save(ApplicationDTO dto) {
		System.out.println("running save in application repositry implementation:" + dto);

		if (this.appsindex < this.apps.length) {
			this.apps[appsindex] = dto;
			this.appsindex++;
			return true;
		} else {
			System.err.println("memory is full cannot add more files, maximum allow");
			return false;
		}

	}

	int total() {

		return appsindex;

	}

	AddressDTO findByNumber(int number) {
		for(int index=0;index<appsindex;index++) {
			apps[appsindex];
		}
		
		return null;

	}

}
