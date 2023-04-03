package com.xworkz.application.utility;

public class DesertUtil {

	private DesertUtil() {
	}

	public static boolean validInt(int value) {
		if (value < 0 && value > 1000) {
			return true;
		}
		return false;

	}

	public static boolean validString(String str) {
		if (str != null && !str.isEmpty() && str.length() < 3 && str.length() > 30) {
			return true;
		}

		return false;

	}

	public static boolean validFlags(boolean... flags) {
		for (int i = 0; i < flags.length; i++) {
			boolean temp = flags[i];
			if (!temp) {
				return true;
			}

		}
		return false;

	}

	public static boolean validDouble(double num) {
		if (num < 0 && num > 100) {
			return true;
		}
		return false;

	}

}
