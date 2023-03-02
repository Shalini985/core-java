package com.xworkz.toy.repository;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import com.xworkz.toy.dto.ToyDto;
import com.xworkz.toy.entity.ToyEntity;

@Repository
public class ToysRepositoryImpl implements ToysRepository {

	@Autowired
	public EntityManagerFactory entityManagerFactory; 
	
	public ToysRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	public boolean save(ToyEntity entity) {
		System.out.println("Running save in repository");
		EntityManager entityManager =  this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

	public ToyEntity findById(int id) {
		System.out.println("Find By id in Repository... "+id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		ToyEntity feromDb = entityManager.find(ToyEntity.class, id);
		entityManager.close();
		return feromDb;
	} 

	@Override
	public List<ToyEntity> findByCompany(String company){
		EntityManager mangaer=this.entityManagerFactory.createEntityManager();
		try {
			Query query=mangaer.createNamedQuery("findCompany");
			query.setParameter("comp", company);
			List<ToyEntity> list= query.getResultList();
			System.out.println("Total List found in repo"+list.size());
			return list;
		} finally {
			mangaer.close();
		}
		
	}
	public boolean update(ToyEntity entity) {
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
			
		}
	}
}



