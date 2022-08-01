package com.lti;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.entity.*;
import com.lti.controller.*;
import com.lti.repository.*;

@SpringBootTest
class FarmerSchemeApplicationTests {

	@Autowired
	FarmerRepository farmerDetailRepo;

	@Autowired
	BidderRepository bidderDetailRepo;

	@Autowired
	CropRepository cropDetailRepo;

	@Autowired
	InsuranceRepo insuranceRepo;

	// ============================Bidder Testing==========================
	@Test
	void isBidderPresent() {
		boolean checkUser = bidderDetailRepo.isBidderPresent("shrutijain@gmail.com");
		System.out.println(checkUser);
	}

	@Test
	void findBidderByEmailAndPass() {
		int bidderInfo = bidderDetailRepo.findByEmailAndPassword("shrutijain@gmail.com", "shruti123");
		System.out.println(bidderInfo);
	}

	@Test
	void getAllBidder() {
		List<Bidder> bidder = bidderDetailRepo.findAll();
		for (Bidder b : bidder) {
			System.out.println("BidderId : " + b.getBidderId());
			System.out.println("Aadhar : " + b.getAadharNo());
			System.out.println("Balance : " + b.getBalance());
			System.out.println("ContactNo : " + b.getContactNo());
			System.out.println("Email : " + b.getEmail());
			System.out.println("FName : " + b.getBidderFirstName());
			System.out.println("LName : " + b.getBidderLastName());
			System.out.println("TraderLicense : " + b.getTraderLicenseNo());
			System.out.println("Pswd : " + b.getPassword());
		}
	}

	// ==========================Farmer Testing===============================
	@Test
	void isFarmerPresent() {
		boolean checkUser = farmerDetailRepo.isFarmerPresent("raj@gmail.com");
		System.out.println(checkUser);
	}

	@Test
	void findFarmerByEmailAndPass() {
		int FarmerInfo = farmerDetailRepo.findByEmailAndPassword("raj@gmail.com", "raj123456");
		System.out.println(FarmerInfo);
	}

	@Test
	void testGetAllCrop() {
		List<Crop> cropDet = farmerDetailRepo.viewAllCrops();
		for (Crop crop : cropDet) {
			System.out.println("Baseprice : " + crop.getBaseprice());
			System.out.println("Crop Name : " + crop.getCropName());
			System.out.println("Crop Type : " + crop.getCroptype());
			System.out.println("Fertilizer Type : " + crop.getFertilizertype());
			System.out.println("Quantity : " + crop.getQuantity());

		}
	}

	@Test
	void testGetAllInsurance() {
		List<Insurance> insuranceDet = farmerDetailRepo.viewAllInsurance();
		for (Insurance insur : insuranceDet) {
			System.out.println("Insurance Id :" + insur.getInsuranceId());
			System.out.println("APPROVEDSTATUS : " + insur.isApprovedstatus());
			System.out.println("Area : " + insur.getArea());
			System.out.println("CropName : " + insur.getCropName());
			System.out.println("CropType : " + insur.getCroptype());
			System.out.println("EstAmt : " + insur.getEstimatedamount());
			System.out.println("InsureeName : " + insur.getInsureeName());
			System.out.println("SumInsured : " + insur.getSumInsured());
			System.out.println("Farmer Id : " + insur.getFarmer());
		}
	}

	@Test
	void getAllFarmer() {
		List<Farmer> farmer = farmerDetailRepo.findAll();
		for (Farmer f : farmer) {
			System.out.println("FarmerId : " + f.getFarmerId());
			System.out.println("Aadhar : " + f.getAadharNo());
			System.out.println("Balance : " + f.getBalance());
			System.out.println("ContactNo : " + f.getContactNo());
			System.out.println("Email : " + f.getEmail());
			System.out.println("FName : " + f.getFarmerFirstName());
			System.out.println("LName : " + f.getFarmerLastName());
			System.out.println("LandDets : " + f.getLandDetails());
			System.out.println("Pswd : " + f.getPassword());
		}
	}

	@Test
	void getAllInsurClaim() {
		List<InsuranceClaim> insurClaim = farmerDetailRepo.viewAllClaim();
		for (InsuranceClaim ic : insurClaim) {
			System.out.println("ClaimId : " + ic.getClaimId());
			System.out.println("Amt : " + ic.getAmount());
			System.out.println("Cause : " + ic.getCauseofloss());
			System.out.println("ClaimApproval : " + ic.isClaimapproval());
			System.out.println("DateOfLoss : " + ic.getDateofloss());
			System.out.println("InsureeNAme : " + ic.getInsureeName());
			System.out.println("FarmerId : " + ic.getFarmer());
			System.out.println("InsuranceId : " + ic.getInsurance());
		}
	}

}
