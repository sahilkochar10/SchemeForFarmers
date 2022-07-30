package com.lti.service;

import java.util.List;

import com.lti.dto.CropDto;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.SellCrop;

public interface FarmerService {
	
	void register(Farmer farmer);
	Farmer farmerLogin(String email,String password );
	List<Farmer> viewAllUsers();
	void placeSellRequest(Crop crop);
	Farmer findById(int farmerId);
	List<Crop> marketPlace();
	List<SellCrop> history();
	void applyInsurance(Insurance insurance);
	List<Insurance> viewAllInsurance();
	void claimInsurance(InsuranceClaim claim);
	List<InsuranceClaim> viewAllClaim();
	//void claimapproval(InsuranceClaim claim);
}
