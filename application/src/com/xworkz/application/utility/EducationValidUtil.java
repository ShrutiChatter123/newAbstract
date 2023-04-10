package com.xworkz.application.utility;

import java.time.LocalDate;

public class EducationValidUtil {

	public static boolean validInt(int value) {
		if (value > 0 && value < 1000000) {
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

	public static boolean validLocalDate(LocalDate date) {
		LocalDate before = LocalDate.of(2025, 1, 1);
		LocalDate after = LocalDate.of(2019, 1, 1);
		if (date != null && date.isAfter(after) && date.isBefore(before)) {
			return true;

		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int i = 0; i < flag.length; i++) {
			boolean temp = flag[i];
			if (!temp) {
				return false;
			}
		}
		return true;
	}
}
