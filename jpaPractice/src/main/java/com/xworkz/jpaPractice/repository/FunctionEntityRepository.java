package com.xworkz.jpaPractice.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpaPractice.entity.FunctionEntity;


public class FunctionEntityRepository {

		
	public FunctionEntityRepository() {
		System.out.println("No-org constructor FunctionEntityRepository ");
	}
	
	EntityManagerFactory factory=	Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager=	factory.createEntityManager();
	
//this is only save operation in jpa
	public boolean onSave(FunctionEntity entity) {
		System.out.println("Running onSave method in FunctionEntityRepository ");
		EntityTransaction transaction=	manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		
		return true;	
	}
	
//	this is findById method
	public FunctionEntity findById(int id) {
	EntityManager manager=	factory.createEntityManager();
	FunctionEntity ref=	manager.find(FunctionEntity.class, id);
	System.out.println("Excecuting finById method:"+ref);
		return ref;
			
		
	}
	
//	this is findAll method
	public List<FunctionEntity> findAll() {
	EntityManager manager=	factory.createEntityManager();
	Query query=manager.createNamedQuery("findAll");
	System.out.println("Excecuting query:"+query);
		return query.getResultList();	
		
	}
	
	public List<FunctionEntity> findByName(String name){
	
		EntityManager manager=	factory.createEntityManager();
	Query query = manager.createNamedQuery("findByName");
		System.out.println("Getting findByName"+query);
		query.setParameter("byName", name);
	return query.getResultList();
		
		
	}
	
	public List<FunctionEntity> findByLocation(String location){
	EntityManager manager=	factory.createEntityManager();
	Query query=	manager.createNamedQuery("findByLocation");
		System.out.println("getting query by location"+query);
		query.setParameter("byLocation", location);
		return query.getResultList() ;
		
	}
	
	public boolean update(String name,int id) {
		EntityTransaction transaction=	manager.getTransaction();
		transaction.begin();
		
		
		FunctionEntity ref=	manager.find(FunctionEntity.class, id);
		System.out.println("Getting the entity:"+ref);
		ref.setName(name);
		
		System.out.println("entity after setting"+ref);
		manager.merge(ref);
		transaction.commit();
		
		return true;
		
	}
	
	
	
	
	
	
	
}
