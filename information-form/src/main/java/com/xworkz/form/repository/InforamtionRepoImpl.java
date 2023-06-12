package com.xworkz.form.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;

import com.xworkz.form.entity.InformationEntity;
import com.xworkz.form.util.InfoUtil;

@Repository
public class InforamtionRepoImpl implements InformationRepo {

	//private EntityManagerFactory entityManagerFactory  ;

	@Override
	public boolean save(InformationEntity entity) {
		EntityManager manager = InfoUtil.getFactory().createEntityManager();

		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			//transaction.rollback();
		} catch (PersistenceException e) {
			e.printStackTrace();
			
		} finally {
			if (manager != null)
				manager.close();

		}
		return true;
	}

}
