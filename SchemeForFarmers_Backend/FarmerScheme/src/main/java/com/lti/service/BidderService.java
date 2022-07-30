package com.lti.service;

import java.util.List;

import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;

public interface BidderService {
	void register(Bidder bidder);
	Bidder login(String email, String password);
	List<Bidder> viewAllUsers();
	void placeBid(Crop crop);
	Bidder findById(int bidderId);
	void bidApprove(Crop crop);
}
