package com.xworkz.oopsAbstract.thing;

public class Withdrow extends Deposit {

	public void depositcash() {
		System.out.println("proceed 6554898554");
	}

	public void withdrow() {
		System.out.println("sucessfully done 480975567");
	}

	
	public static void main(String[] args) {
		Withdrow drow=new Withdrow();
		drow.depositcash();
		drow.withdrow();
		drow.transfer();
		drow.accountDetail();
		drow.miniStatement();
		drow.regularPayment();
		drow.accountBalance();
		drow.recharge();
		drow.changePin();
		drow.passWordSett();
	}
	
	
	
	
	
	
	
}
