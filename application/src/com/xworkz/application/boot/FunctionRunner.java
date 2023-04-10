package com.xworkz.application.boot;

import com.xworkz.application.dto.FunctionDTO;
import com.xworkz.application.exception.DesertInvalidException;
import com.xworkz.application.exception.MemoryFullException;
import com.xworkz.application.repositry.FunctionRepository;
import com.xworkz.application.repositry.FunctionRepositoryImp;
import com.xworkz.application.service.FunctionService;
import com.xworkz.application.service.FunctionServiceImp;

public class FunctionRunner {

	public static void main(String[] args) {
		FunctionDTO dto=new FunctionDTO(1, "naming", "banglore", 67);
		
		FunctionRepository repository=new FunctionRepositoryImp();
		FunctionService service=new FunctionServiceImp(repository);
		FunctionDTO dto1=new FunctionDTO(2, "babyshow", "baga", 39);
		FunctionDTO dto2=new FunctionDTO(3, "marrage", "gadag", 89);
		FunctionDTO dto3=new FunctionDTO(4, "grannyd", "bagalkot", 87);
	
		
		
		try {
			boolean save=service.validatAndSave(dto);
				System.out.println("runner : saved dto:"+save);
				System.out.println("********************************");
				
				boolean save1=service.validatAndSave(dto1);
				System.out.println("saved:"+save1);
				System.out.println("***********************");
				
				boolean save2=service.validatAndSave(dto2);
				System.out.println("saved:"+save2);
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				
				boolean save3=service.validatAndSave(dto3);
				System.out.println("saved:"+save3);
				
				FunctionDTO finddto=service.find(dto1);
				System.out.println("runner: found dto:");
				System.out.println(finddto);
				
				
			
		}catch(DesertInvalidException e) {
			e.printStackTrace();	
		}catch(MemoryFullException e) {
			e.printStackTrace();
		}

	}

}
