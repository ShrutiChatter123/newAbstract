package com.xworkz.tomorrow.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;
import javax.transaction.Transaction;

import com.xworkz.tomorrow.entity.Happy;

public class EntityRunner {

	public static void main(String[] args) {
		
	Happy happy=new Happy();
	happy.setId(2);
	happy.setName("tursday");
	
	System.out.println(happy);
		
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction et=manager.getTransaction();
	
////	save
//	et.begin();
//	manager.persist(happy);//save
////	manager.merge(null)// update , find - read, remove - delete
//	et.commit();
//	manager.close();
//	System.out.println("Saving object..");
//	}
	
//	merge method
//	et.begin();
//	manager.merge(happy);
//	et.commit();
//	manager.close();
//	
//}
	
//	find method
//	et.begin();
//	Happy h=manager.find(Happy.class, 1);
//	System.out.println(h);
//	
	
	et.begin();
	Happy yes=	manager.find(Happy.class, 2);
	manager.remove(yes);
	et.commit();
	manager.close();
	System.out.println("Saving value");
	
	
	
	}	
}
