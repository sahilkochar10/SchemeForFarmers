package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.dto.CropDto;
import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.SellCrop;
import com.lti.exception.BidderServiceException;
import com.lti.exception.FarmerServiceException;
import com.lti.repository.BidderRepository;
import com.lti.repository.FarmerRepository;

@Service
public class FarmerServiceImpl implements FarmerService {
	@Autowired
    private FarmerRepository farmerRepo;
    @Autowired
    private EmailService emailService;
    @Override
    public void register(Farmer farmer) {
    	if(!farmerRepo.isFarmerPresent(farmer.getEmail())) {
    		int id=farmerRepo.addOrUpdateFarmer(farmer);
    		String text="Successfully registered. Your id is "+id;
    		String subject="Registration Confirmation";
    		emailService.sendEmailForNewRegistration(farmer.getEmail(), text, subject);
    		}
    		else
    		throw new FarmerServiceException("Farmer already registered!");
    		}
	@Override
	public Farmer farmerLogin(String email, String password) {
		try {
			if(!farmerRepo.isFarmerPresent(email))
				throw new FarmerServiceException("Farmer not registered!");
			int id = farmerRepo.findByEmailAndPassword(email, password);
			Farmer farmer = farmerRepo.findById(id);
			return farmer;
		}
		catch(EmptyResultDataAccessException e) {
			throw new FarmerServiceException("Incorrect email/password");
		}
		
	}
	@Override
	public List<Farmer> viewAllUsers() {
		return farmerRepo.findAll();
	}
	@Override
	public void placeSellRequest(Crop crop) {
		farmerRepo.placeSellRequest(crop);
	}
	@Override
	public Farmer findById(int farmerId) {
		Farmer f = farmerRepo.findById(farmerId);
		return f;
	}
	@Override
	public List<Crop> marketPlace() {
		return farmerRepo.viewAllCrops();
	}
	@Override
	public List<SellCrop> history() {
		return farmerRepo.history();
	}
	@Override
	public void applyInsurance(Insurance insurance) {
		farmerRepo.applyInsurance(insurance);
		
	}
	@Override
	public List<Insurance> viewAllInsurance() {
		return farmerRepo.viewAllInsurance();
	}
	@Override
	public void claimInsurance(InsuranceClaim claim) {
		 farmerRepo.claimInsurance(claim);
		
	}
	@Override
	public List<InsuranceClaim> viewAllClaim() {
		return farmerRepo.viewAllClaim();
	}
//	@Override
//	public void claimapproval(InsuranceClaim claim) {
//		return farmerRepo.claimApproval();
//		
//	}
	
	
	
 

}
