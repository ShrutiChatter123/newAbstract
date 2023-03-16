package com.xworkz.application.utility;

import java.time.LocalDate;

public class HeadphoneValidUtit {
	public static boolean validString(String value) {

		if (value != null && value.isEmpty() && value.length() < 3 && value.length() > 30) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double numb) {
		if (numb > 0 && numb < 100) {
			return true;
		}
		return false;
	}

	public static boolean validint(int num) {
		if (num > 0 && num < 1000) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date, LocalDate past) {

		LocalDate tomarrow = date.now().plusDays(1);
		LocalDate past1 = date.of(2014, 4, 5);
		if (date != null && !date.isBefore(tomarrow) && date.isAfter(past1)) {
			System.out.println("date is valid");
			return true;
		} else {
			System.err.println("date is invalid");
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {

		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[0];
			if (temp) {
				return true;
			}

		}
		return false;

	}

}
