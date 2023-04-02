package com.xworkz.application.utility;

public class AddressUtil {

private  AddressUtil() {
	
}

public static boolean validString(String value) {
	if(value!=null&& !value.isEmpty()&& value.length()<2&& value.length()>30) {
		return true;
	}else {
		return false;
	}
}

public static boolean validint(int value) {
	if(value>0) {
		return true;
	}
	return false;
}

public static boolean validFlags(boolean... flags) {
	for(int index=0;index<flags.length;index++) {
		boolean temp=flags[index];
		if(!temp) {
			return false;
		}
	}
	return true;
}






}