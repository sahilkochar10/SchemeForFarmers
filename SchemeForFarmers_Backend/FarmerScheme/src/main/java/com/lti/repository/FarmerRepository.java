package com.lti.repository;


import java.util.List;

import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.SellCrop;

public interface FarmerRepository {

	int addOrUpdateFarmer(Farmer farmer);
	boolean isFarmerPresent(String email);
	int findByEmailAndPassword(String email, String password);
	Farmer findById(int id);
	List<Farmer> findAll();
	void placeSellRequest(Crop crop);
	List<Crop> viewAllCrops();
	List<SellCrop> history();
	void applyInsurance(Insurance insurance);
	List<Insurance> viewAllInsurance();
	void claimInsurance(InsuranceClaim claim);
	List<InsuranceClaim> viewAllClaim();
	
}
