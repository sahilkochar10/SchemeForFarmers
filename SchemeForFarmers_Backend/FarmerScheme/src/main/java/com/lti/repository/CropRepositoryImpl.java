package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.Crop;

@Repository
public class CropRepositoryImpl implements CropRepository {
	@PersistenceContext
	EntityManager em;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Crop findById(int cropId) {
		return em.find(Crop.class,cropId);
	}

	@Override
	public void updateCrop(Crop crop) {
		try
		{
			Session session = this.sessionFactory.getCurrentSession();
			session.update(crop);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	


}
