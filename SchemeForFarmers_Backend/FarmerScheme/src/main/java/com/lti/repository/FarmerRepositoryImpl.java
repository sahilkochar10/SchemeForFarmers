package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.SellCrop;

@Repository
public class FarmerRepositoryImpl implements FarmerRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addOrUpdateFarmer(Farmer farmer) {
		Farmer f = em.merge(farmer);
		return f.getFarmerId();
	}

	@Override
	public boolean isFarmerPresent(String email) {
		return(Long)
				em
				.createQuery("select count(f.farmerId) from Farmer f where f.email = :em")
				.setParameter("em", email)
				.getSingleResult() == 1 ? true : false;
	}

	@Override
	public int findByEmailAndPassword(String email, String password) {
		return (Integer) em
				.createQuery("select f.farmerId from Farmer f where f.email = :em and f.password = :pw")
				.setParameter("em", email)
				.setParameter("pw", password)
				.getSingleResult();
	}

	@Override
	public Farmer findById(int id) {
		return em.find(Farmer.class, id);
	}

	@Override
	public List<Farmer> findAll() {
		return (List)em
				.createQuery("select f from Farmer f")
				.getResultList();
	}

	@Override
	@Transactional
	
	public void placeSellRequest(Crop crop) {
		Crop c = em.merge(crop);
	}

	@Override
	public List<Crop> viewAllCrops() {
		//
		String jpql = "select c from Crop c";
		return (List)em.
				createQuery(jpql)
				.getResultList();
	}

	@Override
	public List<SellCrop> history() {
		String jpql = "select s from SellCrop s";
		return (List)em
				.createQuery(jpql)
				.getResultList();
	}

	@Override
	@Transactional
	public void applyInsurance(Insurance insurance) {
		Insurance i = em.merge(insurance);
	}

	@Override
	public List<Insurance> viewAllInsurance() {
		String jpql = "select i from Insurance i";
		return (List)em
				.createQuery(jpql)
				.getResultList();
	}

	@Override
	@Transactional
	public void claimInsurance(InsuranceClaim claim) {
		InsuranceClaim i = em.merge(claim);
		
	}

	@Override
	public List<InsuranceClaim> viewAllClaim() {
		String jpql = "select c from InsuranceClaim c";
		return (List)em
				.createQuery(jpql)
				.getResultList();
	}

}
