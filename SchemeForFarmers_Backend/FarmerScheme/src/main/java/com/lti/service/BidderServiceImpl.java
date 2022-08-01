package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.exception.BidderServiceException;

import com.lti.repository.BidderRepository;

@Service
public class BidderServiceImpl implements BidderService {

	@Autowired
	private BidderRepository bidderRepo;
	@Autowired
	private EmailService emailService;
	
	@Override
	public void register(Bidder bidder) {
		
		if(!bidderRepo.isBidderPresent(bidder.getEmail())) {
		int id=bidderRepo.addOrUpdateBidder(bidder);
		String text="Successfully registered. Your id is "+id;
		String subject="Registration Confirmation";
		emailService.sendEmailForNewRegistration(bidder.getEmail(), text, subject);
		}
		else
		throw new BidderServiceException("Customer already registered!");
		}
	@Override
	public Bidder login(String email, String password) {
		try {
			if(!bidderRepo.isBidderPresent(email))
				throw new BidderServiceException("Bidder not registered!");
			int id = bidderRepo.findByEmailAndPassword(email, password);
			Bidder bidder = bidderRepo.findById(id);
			return bidder;
		}
		catch(EmptyResultDataAccessException e) {
			throw new BidderServiceException("Incorrect email/password");
		}
	}
	@Override
	public List<Bidder> viewAllUsers() {
		return bidderRepo.findAll();
	}
	@Override
	public void placeBid(Crop crop) {
		bidderRepo.placeBid(crop);
	}
	@Override
	public Bidder findById(int bidderId) {
		Bidder b= bidderRepo.findById(bidderId);
		return b;
	}
	@Override
	public void bidApprove(Crop crop) {
		bidderRepo.bidApprove(crop);
	}



		
	}


