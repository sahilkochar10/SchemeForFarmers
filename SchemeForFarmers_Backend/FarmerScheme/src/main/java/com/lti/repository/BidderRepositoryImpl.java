package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import java.lang.Long;
import java.util.List;

import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.SellCrop;

@Repository
public class BidderRepositoryImpl implements BidderRepository{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addOrUpdateBidder(Bidder bidder) {
		Bidder b = em.merge(bidder);
		return b.getBidderId();
	}

	@Override
	public boolean isBidderPresent(String email) {
		return (Long)em
				.createQuery("select count(b.bidderId) from Bidder b where b.email = :em")
				.setParameter("em", email)
				.getSingleResult() == 1 ? true : false;
	}

	@Override
	public int findByEmailAndPassword(String email, String password) {
		return (Integer) em
				.createQuery("select b.bidderId from Bidder b where b.email = :em and b.password = :pw")
				.setParameter("em", email)
				.setParameter("pw", password)
				.getSingleResult();
	}

	@Override
	public Bidder findById(int id) {
		return em.find(Bidder.class, id);
	}

	@Override
	public List<Bidder> findAll() {
		return (List)em
				.createQuery("select b from Bidder b")
				.getResultList();
	}
	
	@Override
	@Transactional
	public void placeBid(Crop crop)
	{
		Crop c = em.merge(crop);
	}

	@Override
	@Transactional
	public void bidApprove(Crop crop) {
		if(crop.isStatus() == true)
		{
			SellCrop s = new SellCrop();
			s.setBidder(crop.getBidder());
			s.setBidprice(crop.getBaseprice());
			s.setCrop(crop);
			s.setFarmer(crop.getFarmer());
			s.setSold(true);
			SellCrop sc = em.merge(s);
		}
	}
}
