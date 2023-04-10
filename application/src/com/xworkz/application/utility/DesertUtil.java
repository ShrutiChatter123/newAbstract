package com.xworkz.application.utility;

import java.time.LocalDate;

public class DesertUtil {

	private DesertUtil() {
	}

	
	
	public static boolean validdouble(double num) { 
		if(num>0&& num<500000) {
		return true;
		}
		return false;
		
	}
	public static boolean validInt(int value) {
		if (value > 0 && value < 1000000000) {
			return true;
		}
		return false;

	}

	public static boolean validString(String str) {
		if (str != null && !str.isEmpty() && str.length() > 3 && str.length() < 30) {
			return true;
		}

		return false;

	}

	public static boolean validFlags(boolean... flags) {
		for (int i = 0; i < flags.length; i++) {
			boolean temp = flags[i];
			if (!temp) {
				System.out.println("invalid flag  at index:"+i);
				return false;
			}

		}
		return true;

	}

	public static boolean validDouble(double num) {
		if (num > 0 && num < 1000) {
			return true;
		}
		return false;

	}
	
	public static boolean validLocalDate(LocalDate date) {
		LocalDate before = LocalDate.of(2025, 1, 1);
		LocalDate after = LocalDate.of(2019, 1, 1);
		if (date != null && date.isAfter(after) && date.isBefore(before)) {
			return true;

		}
		return false;
	}

	

}
