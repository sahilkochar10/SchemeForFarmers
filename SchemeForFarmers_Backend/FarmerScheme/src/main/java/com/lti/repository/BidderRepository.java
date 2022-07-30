package com.lti.repository;

import java.util.List;

import com.lti.entity.Bidder;
import com.lti.entity.Crop;

public interface BidderRepository {
	int addOrUpdateBidder(Bidder bidder);
	boolean isBidderPresent(String email);
	int findByEmailAndPassword(String email, String password);
	Bidder findById(int id);
	List<Bidder> findAll();
	void placeBid(Crop crop);
	void bidApprove(Crop crop);
}
