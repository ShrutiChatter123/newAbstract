package com.xworkz.springAnot.boot;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAnot.configration.SpringConfigration;
import com.xworkz.springAnot.thing.Construction;
import com.xworkz.springAnot.thing.Exam;
import com.xworkz.springAnot.thing.Festival;
import com.xworkz.springAnot.thing.FoodStreat;
import com.xworkz.springAnot.thing.FrenchFry;
import com.xworkz.springAnot.thing.IFunction;
import com.xworkz.springAnot.thing.Journey;
import com.xworkz.springAnot.thing.Marriage;
import com.xworkz.springAnot.thing.NonVeg;
import com.xworkz.springAnot.thing.Politics;
import com.xworkz.springAnot.thing.Train;
import com.xworkz.springAnot.thing.Weekend;
import com.xworkz.springAnot.thing.Worker;

public class AllSpringRunner {

	@SuppressWarnings({ "restriction", "restriction" })
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigration.class);
		System.out.println(spring.getBeanDefinitionCount());
		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println("---------------------------");
		System.out.println(spring.getBean("email", String.class));
		System.out.println(spring.getBean("education", String.class));
		System.out.println(spring.getBean("taste", String.class));
		System.out.println(spring.getBean("function", String.class));
		System.out.println(spring.getBean("trip", String.class));
		System.out.println(spring.getBean("location", String.class));
		System.out.println(spring.getBean("coachinCenter", String.class));
		System.out.println(spring.getBean("food", String.class));
		System.out.println(spring.getBean("festival2", String.class));
		System.out.println(spring.getBean("hostel", String.class));
		System.out.println(spring.getBean("collage", String.class));
		System.out.println(spring.getBean("chintu", String.class));
		System.out.println(spring.getBean("sports", String.class));

		System.out.println("---------------------------");
		System.out.println(spring.getBean("birthDay", Integer.class));
		System.out.println(spring.getBean("rollNo", Integer.class));
		System.out.println(spring.getBean("orderNo", Integer.class));
		System.out.println(spring.getBean("buildingFloors", Integer.class));
		System.out.println(spring.getBean("noOfRoomsInBuliding", Integer.class));
		System.out.println(spring.getBean("birthDay", Integer.class));
		System.out.println(spring.getBean("noOfExam", Integer.class));
		System.out.println(spring.getBean("holidaysInWeek", Integer.class));
		System.out.println(spring.getBean("holidaysInMonth", Integer.class));

		System.out.println("------------------------");
		System.out.println(spring.getBean("age", Short.class));
		System.out.println(spring.getBean("queNo", Short.class));
		System.out.println(spring.getBean("weight", Short.class));
		System.out.println(spring.getBean("distance", Short.class));
		System.out.println(spring.getBean("spectSize", Short.class));
		System.out.println(spring.getBean("dish", Short.class));
		System.out.println(spring.getBean("tiles", Short.class));
		System.out.println(spring.getBean("votes", Short.class));
		System.out.println(spring.getBean("listOfContact", Short.class));

		System.out.println("-------------------------------");
		System.out.println(spring.getBean("tileWork", Byte.class));
		System.out.println(spring.getBean("vehicleTire", Byte.class));
		System.out.println(spring.getBean("handRing", Byte.class));
		System.out.println(spring.getBean("box", Byte.class));
		System.out.println(spring.getBean("lunchverity", Byte.class));
		System.out.println(spring.getBean("waterBottel", Byte.class));
		System.out.println(spring.getBean("coin", Byte.class));
		System.out.println(spring.getBean("tableSpoon", Byte.class));
		System.out.println(spring.getBean("handBags", Byte.class));

		System.out.println("---------------------------------");
		System.out.println(spring.getBean("MobPhone", Long.class));
		System.out.println(spring.getBean("Usn", Long.class));
		System.out.println(spring.getBean("GstNo", Long.class));
		System.out.println(spring.getBean("ShopNo", Long.class));
		System.out.println(spring.getBean("shopExtrapin", Long.class));
		System.out.println(spring.getBean("tinNo", Long.class));
		System.out.println(spring.getBean("pinCode", Long.class));
		System.out.println(spring.getBean("paperCode", Long.class));
		System.out.println(spring.getBean("portNo", Long.class));

		System.out.println("--------------------------");
		System.out.println(spring.getBean("pi", Double.class));
		System.out.println(spring.getBean("eulerNumber", Double.class));
		System.out.println(spring.getBean("goldenRatio", Double.class));
		System.out.println(spring.getBean("gravity", Double.class));
		System.out.println(spring.getBean("speedOfLight", Double.class));
		System.out.println(spring.getBean("cgpa", Double.class));
		System.out.println(spring.getBean("phLevelOfWater", Double.class));
		System.out.println(spring.getBean("percentage", Double.class));
		System.out.println(spring.getBean("industryGrowth", Double.class));

		System.out.println("----------float-----------------");

		System.out.println(spring.getBean("eulerNumber1", Float.class));
		System.out.println(spring.getBean("goldRatiooo", Float.class));
		System.out.println(spring.getBean("pi1", Float.class));
		System.out.println(spring.getBean("gravity1", Float.class));
		System.out.println(spring.getBean("speedofLigtht", Float.class));
		System.out.println(spring.getBean("avogadroConstant", Float.class));
		System.out.println(spring.getBean("boltconstant", Float.class));
		System.out.println(spring.getBean("pointer", Float.class));

		System.out.println("-----------char---------------");
		System.out.println(spring.getBean("firstLetter", Character.class));
		System.out.println(spring.getBean("lastLetter", Character.class));
		System.out.println(spring.getBean("questionMark", Character.class));
		System.out.println(spring.getBean("exclamationMark", Character.class));
		System.out.println(spring.getBean("starSymbol", Character.class));
		System.out.println(spring.getBean("xSymbol", Character.class));
		System.out.println(spring.getBean("andSymbol", Character.class));

		System.out.println("---------boolean--------------------");
		System.out.println(spring.getBean("hasNoValue", Boolean.class));
		System.out.println(spring.getBean("hasNoError", Boolean.class));
		System.out.println(spring.getBean("hasValue", Boolean.class));
		System.out.println(spring.getBean("marrid", Boolean.class));
		System.out.println(spring.getBean("educated", Boolean.class));
		System.out.println(spring.getBean("handicapt", Boolean.class));
		System.out.println(spring.getBean("completedDegree", Boolean.class));
		System.out.println(spring.getBean("anyBackLog", Boolean.class));
		System.out.println(spring.getBean("blind", Boolean.class));

		System.out.println("****************Methods***********************");
		FoodStreat food = spring.getBean(FoodStreat.class);
		System.out.println(food);
		String foo = food.foodMel();
		System.out.println(foo);

		System.out.println("-----------------------");
		Exam exm = spring.getBean(Exam.class);
		System.out.println(exm);
		String stra = exm.validator();
		System.out.println(stra);

		System.out.println("--------------------------");
		Construction cons = spring.getBean(Construction.class);
		System.out.println(cons);
		long money = cons.budget();
		System.out.println(money);

		System.out.println("---------------------------");
		IFunction func = spring.getBean(IFunction.class);
		System.out.println(func);
		String name = func.FamilyFunction();
		System.out.println(name);

		
		System.err.println("------------------------");
		Journey jou = spring.getBean(Journey.class);
		System.out.println(jou);
		int i = jou.headNo();
		System.out.println(i);

		System.err.println("-----------------------");
		NonVeg veg = spring.getBean(NonVeg.class);
		System.out.println(veg);
		String vee = veg.preparedBy();
		System.out.println(vee);

		System.out.println("-----------------------");
		Politics poo = spring.getBean(Politics.class);
		System.out.println(poo);
		String stt = poo.State();
		System.out.println(stt);

		System.out.println("---------------------");
		Worker work = spring.getBean(Worker.class);
		System.out.println(work);
		int no = work.dailyAttender();
		System.out.println(no);

		System.out.println("------------------------");
		Train train = spring.getBean(Train.class);
		System.out.println(train);
		String dest = train.finalDestiny();
		System.out.println(dest);

		Festival festival = spring.getBean(Festival.class);
		System.out.println(festival.culture());

		Marriage mary = spring.getBean(Marriage.class);
		System.out.println(mary);
		String pai = mary.pairs();
		System.out.println(pai);

		System.out.println("--------------------------s");
		Weekend week = spring.getBean(Weekend.class);
		System.out.println(week);
		String happy = week.Season();
		System.out.println("happy:" + happy);

		System.out.println("-----------------------");
		FrenchFry fry = spring.getBean(FrenchFry.class);
		System.out.println(fry);
		int budget = fry.lowBudgetMenu();
		System.out.println(budget);

		System.out.println("-----------Collection implements-----------------");

		List ref = spring.getBean("arry", List.class);
		System.out.println("ref:" + ref);

		List yes = spring.getBean("pet", List.class);
		System.out.println("yes:" + yes);

		Set set = spring.getBean("Mla", Set.class);
		System.out.println("set:" + set);

		Set yum = spring.getBean("Clint", Set.class);
		System.out.println("yum:" + yum);

		Set cls = spring.getBean("Exam", Set.class);
		System.out.println("cls:" + cls);


		
		
	}
}
