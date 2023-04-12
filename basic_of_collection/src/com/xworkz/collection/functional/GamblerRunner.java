package com.xworkz.collection.functional;

import com.xworkz.collection.util.GamblerUtil;

public class GamblerRunner {

	public static void main(String[] args) {
		Gambler gambler=(principal)->{
			
			if(principal>500 && principal<1000) {
				System.out.println("principal is less than1000:"+principal);
				return 0;
			}else {
			
			System.out.println("principal is less than 1000:"+principal);
			return 100;
			}
		};
		GamblerUtil.show(gambler);
	}
	
}
