package com.xworkz.collection.Runner;

import com.xworkz.collection.functional.Shooter;
import com.xworkz.collection.util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {

		Shooter shooter = (g1) -> {

			System.out.println("shooter:" + g1);
			return false;
		};
		ShooterUtil.test1(shooter);
		
		
		
		
		
		
	}
}
