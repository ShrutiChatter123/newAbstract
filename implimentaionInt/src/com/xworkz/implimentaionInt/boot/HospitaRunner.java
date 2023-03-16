package com.xworkz.implimentaionInt.boot;

import com.xworkz.implimentaionInt.thing.HospitalRule;
import com.xworkz.implimentaionInt.thing.Peoples;

public class HospitaRunner {

	public static void main(String[] args) {
		Peoples pepl = new Peoples();
		boolean work = pepl.workingwithPeople();
		System.out.println(work);
		String s = pepl.behaviour();
		System.out.println(s);
		boolean care = pepl.caring();
		System.out.println(care);
		boolean touch = pepl.dontTouchEquipments();
		System.out.println(touch);
		boolean to = pepl.dontTouchBeds();
		System.out.println(to);
		String plastic = pepl.dontUsePlastic();
		System.out.println(plastic);
		boolean argu = pepl.unnecessaryArguments();
		System.out.println(argu);
		String clean = pepl.cleanEnvoirnment();
		System.out.println(clean);
		double salary = pepl.montlySalaryToWorkers();
		System.out.println(salary);
		String validat = pepl.cardValidation();
		System.out.println(validat);
		int hashcode = pepl.hashCode();
		System.out.println(hashcode);
		String str = pepl.toString();
		System.out.println(str);
		
		
		HospitalRule hos=new Peoples();
		System.out.println(hos.workingwithPeople());
		System.out.println(hos.behaviour());
		System.out.println(hos.caring());
		System.out.println(hos.dontTouchBeds());
		System.out.println(hos.dontTouchEquipments());
		System.out.println(hos.dontUsePlastic());
		System.out.println(hos.unnecessaryArguments());
		System.out.println(hos.cleanEnvoirnment());
		System.out.println(hos.montlySalaryToWorkers());
		System.out.println(hos.cardValidation());
	
		

	}
}
