package com.xworkz.springAnot.configration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAnot")
public class SpringConfigration {

	@Bean
	public String email() {
		System.out.println("registering email");
		return "Contact@shruegmail.com";
	}

	@Bean
	public String education() {
		System.out.println("registering education");
		return "Contact @ AITMgmail.com";
	}

	@Bean
	public String taste() {
		System.out.println("registering taste");
		return "spicy";
	}

	@Bean
	public String function() {
		System.out.println("registering function");
		return "Naming function";
	}

	@Bean
	public String trip() {
		System.out.println("registering trip");
		return "trip in mansoon";

	}

	@Bean
	public String location() {
		System.out.println("registering location");
		return "banglore";

	}

	@Bean
	public String coachinCenter() {
		System.out.println("registering coaching center");
		return "Xworkz";

	}

	@Bean
	public String MobilePhone() {
		System.out.println("registering MobilePhone");
		return "android";

	}

	@Bean
	public String sports() {
		System.out.println("registering sports");
		return "kho-kho";

	}

	@Bean
	public String chintu() {
		System.out.println("registering chintu");
		return "pogo";

	}

	@Bean
	public String food() {
		System.out.println("registering food");
		return "tiffan-center";

	}

	@Bean
	public String festival2() {
		System.out.println("registering festival");
		return "diwali";

	}

	@Bean
	public String hostel() {
		System.out.println("registering hostel");
		return "girls-hostel";

	}

	@Bean
	public String collage() {
		System.out.println("registering collage");
		return "AITM";

	}

	@Bean
	public Integer birthDay() {
		System.out.println("registering birthday");
		return 10;
	}

	@Bean
	public Integer rollNo() {
		System.out.println("registering rollNo");
		return 20;
	}

	@Bean
	public Integer orderNo() {
		System.out.println("registering orderNo");
		return 3;
	}

	@Bean
	public Integer buildingFloors() {
		System.out.println("registering buildingFloors");
		return 5;
	}

	@Bean
	public Integer noOfRoomsInBuliding() {
		System.out.println("registering noOfRoomsInBuliding");
		return 6;
	}

	@Bean
	public Integer teachers() {
		System.out.println("registering teachers");
		return 9;
	}

	@Bean
	public Integer noOfExam() {
		System.out.println("registering noOfExam");
		return 7;
	}

	@Bean
	public Integer holidaysInWeek() {
		System.out.println("registering holidaysInWeek");
		return 2;
	}

	@Bean
	public Integer holidaysInMonth() {
		System.out.println("registering holidaysInMonth");
		return 7;
	}

	@Bean
	public Short age() {
		System.out.println("registering age");
		return 10;
	}

	@Bean
	public Short queNo() {
		System.out.println("registering queNo");
		return 1;
	}

	@Bean
	public Short weight() {
		System.out.println("registering weight");
		return 21;
	}

	@Bean
	public Short distance() {
		System.out.println("registering distance");
		return 43;
	}

	@Bean
	public Short spectSize() {
		System.out.println("registering spectSize");
		return 5;
	}

	@Bean
	public Short listOfContact() {
		System.out.println("registering listOfContact");
		return 66;
	}

	@Bean
	public Short dish() {
		System.out.println("registering dish");
		return 15;
	}

	@Bean
	public Short tiles() {
		System.out.println("registering tiles");
		return 8;
	}

	@Bean
	public Short votes() {
		System.out.println("registering votes");
		return 55;
	}

	@Bean
	public Byte tileWork() {
		System.out.println("registering tileWork");
		return 33;
	}

	@Bean
	public byte vehicleTire() {
		System.out.println("registering vehicleTire");
		return 4;
	}

	@Bean
	public Byte handRing() {
		System.out.println("registering handRing");
		return 2;
	}

	@Bean
	public Byte box() {
		System.out.println("registering box");
		return 3;
	}

	@Bean
	public Byte lunchverity() {
		System.out.println("registering lunchverity");
		return 4;
	}

	@Bean
	public Byte waterBottel() {
		System.out.println("registering waterBottel");
		return 3;
	}

	@Bean
	public Byte coin() {
		System.out.println("registering coin");
		return 10;
	}

	@Bean
	public Byte tableSpoon() {
		System.out.println("registering tableSpoon");
		return 7;
	}

	@Bean
	public Byte handBags() {
		System.out.println("registering handBags");
		return 11;
	}

	@Bean
	public Long MobPhone() {
		System.out.println("registering mobilePhone");
		return 9148187206L;
	}

	@Bean
	public Long Usn() {
		System.out.println("registering Usn");
		return 1234566789L;
	}

	@Bean
	public Long GstNo() {
		System.out.println("registering GstNo");
		return 91481232L;
	}

	@Bean
	public Long ShopNo() {
		System.out.println("registering ShopNo");
		return 9889887L;
	}

	@Bean
	public Long shopExtrapin() {
		System.out.println("registering shopExtrapin");
		return 12156464L;
	}

	@Bean
	public Long tinNo() {
		System.out.println("registering tinNo");
		return 7776987L;
	}

	@Bean
	public Long pinCode() {
		System.out.println("registering pinCode");
		return 1515782L;
	}

	@Bean
	public Long paperCode() {
		System.out.println("registering paperCode");
		return 5567876L;
	}

	@Bean
	public Long portNo() {
		System.out.println("registering portNo");
		return 3443432L;
	}

	@Bean
	public Double pi() {
		System.out.println("Registring pi");
		return 3.14159;
	}

	@Bean
	public Double eulerNumber() {
		System.out.println("Registring eulerNumber");
		return 2.71828;
	}

	@Bean
	public Double goldenRatio() {
		System.out.println("Registring goldenRatio");
		return 1.61803;
	}

	@Bean
	public Double gravity() {
		System.out.println("Registring gravity");
		return 9.81;
	}

	@Bean
	public Double speedOfLight() {
		System.out.println("Registring pi");
		return 299973.58;
	}

	@Bean
	public Double cgpa() {
		System.out.println("Registring cgpa");
		return 8.23;
	}

	@Bean
	public Double phLevelOfWater() {
		System.out.println("Registring phLevelOfWater");
		return 7.2;
	}

	@Bean
	public Double percentage() {
		System.out.println("Registring percentage");
		return 56.45;
	}

	@Bean
	public Double industryGrowth() {
		System.out.println("Registring industryGrowth");
		return 18.45;
	}

	@Bean
	public Float eulerNumber1() {
		System.out.println("Registring eulerNumber");
		return 2.71828f;
	}

	@Bean
	public Float goldRatiooo() {
		System.out.println("Registring goldRatiooo");
		return 1.618038f;
	}

	@Bean
	public Float pi1() {
		System.out.println("Registring pi1");
		return 3.14159f;
	}

	@Bean
	public Float gravity1() {
		System.out.println("Registring gravity1");
		return 9.81f;
	}

	@Bean
	public Float speedofLigtht() {
		System.out.println("Registring speedofLigtht");
		return 27873738f;
	}

	@Bean
	public Float avogadroConstant() {
		System.out.println("Registring eulerNumber");
		return 6.98655f;
	}

	@Bean
	public Float boltconstant() {
		System.out.println("Registring boltconstant");
		return 1.3823f;
	}

	@Bean
	public Float pointer() {
		System.out.println("Registring ph2");
		return 2.8f;
	}

	@Bean
	public Character firstLetter() {
		System.out.println("registering A letter");
		return 'A';
	}

	@Bean
	public Character lastLetter() {
		System.out.println("registering Z lastLetter");
		return 'Z';
	}

	@Bean
	public Character questionMark() {
		System.out.println("registering ? questionMark");
		return '?';
	}

	@Bean
	public Character exclamationMark() {
		System.out.println("registering exclamationMark");
		return '!';
	}

	@Bean
	public Character starSymbol() {
		System.out.println("registering starSymbol");
		return '*';
	}

	@Bean
	public Character annotation() {
		System.out.println("registering annotation");
		return '@';
	}

	@Bean
	public Character xSymbol() {
		System.out.println("registering xSymbol");
		return 'X';
	}

	@Bean
	public Character andSymbol() {
		System.out.println("registering andSymbol");
		return '&';
	}

	@Bean
	public Character wSymbol() {
		System.out.println("registering wSymbol");
		return 'W';
	}

	@Bean
	public Boolean hasNoValue() {
		System.out.println("registering hasNoValue ");
		return false;

	}

	@Bean
	public Boolean hasNoError() {
		System.out.println("registering hasNoError ");
		return true;

	}

	@Bean
	public Boolean hasValue() {
		System.out.println("registering hasValue ");
		return true;

	}
	@Bean
	public Boolean marrid() {
		System.out.println("registering marriage");
		return false;
	}
	@Bean
	public Boolean educated() {
		System.out.println("registering education");
		return true;
	}
	@Bean
	public Boolean handicapt() {
		System.out.println("registering handicapt");
		return false;
	}
	@Bean
	public Boolean completedDegree() {
		System.out.println("registering completedDegree ");
		return true;
	}
	@Bean
	public Boolean anyBackLog() {
		System.out.println("registering anyBackLog");
		return false;
	}
	@Bean
	public Boolean blind() {
		System.out.println("registering blind");
		return false;
	}

	@Bean
	public List arry() {

		List<String> arry = new ArrayList<>();
		arry.add("shtuti");
		arry.add("collage");
		arry.add("shoo");
		arry.add("watch");
		arry.add("time");
		arry.add("time");
		arry.add("time");

		return arry;
	}

	@Bean
	public List pet() {

		List<String> pet = new LinkedList<>();
		pet.add("cat");
		pet.add("rooby Cat");
		pet.add("brony Cat");
		pet.add("camel-Cat");
		pet.add("ramu");
		return pet;
	}

	@Bean
	public Set Mla() {
		Set<Integer> ref = new HashSet<>();

		ref.add(121);
		ref.add(131);
		ref.add(156);
		ref.add(155);
		ref.add(349);
		ref.add(444);
		ref.add(444);
		return ref;

	}

	@Bean
	public Set Clint() {

		Set<String> yahoo = new LinkedHashSet<>();
		yahoo.add("manjula");
		yahoo.add("abhishk");
		yahoo.add("mutturaj");
		yahoo.add("shruti");
		yahoo.add("shilpa");
		yahoo.add("shilpa");

		return yahoo;

	}

	@Bean
	public Set Exam() {
		Set<String> okk = new TreeSet<>();
		okk.add("Kannada");
		okk.add("English");
		okk.add("hindi");
		okk.add("Social study");
		okk.add("politaca science");
		okk.add("politaca science");

		return okk;

	}

}
