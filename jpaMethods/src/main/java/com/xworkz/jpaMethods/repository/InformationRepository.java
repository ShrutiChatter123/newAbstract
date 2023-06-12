package com.xworkz.jpaMethods.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpaMethods.entity.InformationEntity;

public class InformationRepository {

	EntityManagerFactory factory=	Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager=	factory.createEntityManager();
		
	
	public InformationRepository() {
		System.out.println("No org constructor for InformationRepository");
	}
	
	
	public boolean onSave(InformationEntity entity) {
	
		System.out.println("Running onsave method in InformationRepository");
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
		
	}
	
		public InformationEntity findById(int id) {
			EntityManager manager=	factory.createEntityManager();
		InformationEntity fingref=	manager.find(InformationEntity.class, id);
			System.out.println("getting findById method"+fingref);
			return fingref;
			
		}
		
		
	public List<InformationEntity> findAll(){
		EntityManager manager=	factory.createEntityManager();
	Query query= manager.createNamedQuery("findAll");
		System.out.println("findall method in repo:"+query);
		return query.getResultList();
			
		}
	
	public  List<InformationEntity> findByName(String name) {
		EntityManager manager=	factory.createEntityManager();
	Query query = manager.createNamedQuery("findByName");
		System.out.println("getting findBy name in repo"+query);
		query.setParameter("byName", name);
		return query.getResultList();
		
	}
	
	public List<InformationEntity> findByLocation(String location){
	EntityManager manager=	factory.createEntityManager();
	Query query=	manager.createNamedQuery("findByLocation");
	System.out.println();
		
		return null;
		
	}
	
	
	
	
	
	
	
}
