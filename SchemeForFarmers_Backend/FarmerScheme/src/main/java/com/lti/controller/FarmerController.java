package com.lti.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.ClaimDto;
import com.lti.dto.CropDto;
import com.lti.dto.InsuranceDto;
import com.lti.dto.LoginDto;
import com.lti.dto.LoginStatus;
import com.lti.dto.Status;
import com.lti.dto.Status.StatusType;
import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.InsuranceClaim;
import com.lti.exception.BidderServiceException;
import com.lti.exception.FarmerServiceException;
import com.lti.service.FarmerService;
import com.lti.service.InsuranceService;

@RestController
@CrossOrigin
public class FarmerController {
	@Autowired
	private FarmerService farmerService;
	@Autowired
	private InsuranceService insuranceService;
	
		@PostMapping(path="/registerFarmer")
		public Status register(@RequestBody Farmer farmer) {
            try {
                farmerService.register(farmer);
               
                Status status = new Status();
                status.setStatus(StatusType.SUCCESS);
                status.setMessage("Registration successful!");
                return status;
            }
            catch(BidderServiceException e) {
                Status status = new Status();
                status.setStatus(StatusType.FAILURE);
                status.setMessage(e.getMessage());
                return status;
            }
        }
		
		
		@PostMapping("/FarmerLogin")
		public Farmer login(@RequestBody LoginDto loginDto) {
			try {
				Farmer farmer = farmerService.farmerLogin(loginDto.getEmail(), loginDto.getPassword());
				return farmer;
			}
			catch(FarmerServiceException e) {
				LoginStatus loginStatus = new LoginStatus();
				loginStatus.setStatus(StatusType.FAILURE);
				loginStatus.setMessage(e.getMessage());
				return null;
			}


		}
		@PostMapping(path="/placeSellRequest")
		public Status addCrop(@RequestBody CropDto cropDto) {
			try {
				Crop c=new Crop();
				int id = cropDto.getFarmerId();
				System.out.println(id);
				Farmer f = farmerService.findById(id);
				c.setCropName(cropDto.getCropName());
				c.setCroptype(cropDto.getCroptype());
				c.setFertilizertype(cropDto.getFertilizertype());
				c.setQuantity(cropDto.getQuantity());
				c.setStatus(cropDto.isStatus());
				c.setBaseprice(cropDto.getBaseprice());
				c.setFarmer(f);
                farmerService.placeSellRequest(c);
                Status status = new Status();
                status.setStatus(StatusType.SUCCESS);
                status.setMessage("Crop Placed!");
                return status;
            }
            catch(FarmerServiceException e) {
                Status status = new Status();
                status.setStatus(StatusType.FAILURE);
                status.setMessage(e.getMessage());
                return status;
            }
			
		}
		@PostMapping(path="/applyInsurance")
		public Status applyInsurace(@RequestBody InsuranceDto insuranceDto)
		{
			try
			{	
				Insurance i = new Insurance();
				i.setCropName(insuranceDto.getCropName());
				i.setCroptype(insuranceDto.getCroptype());
				i.setInsureeName(insuranceDto.getInsureeName());
				i.setSumInsured(insuranceDto.getSumInsured());
				i.setArea(insuranceDto.getArea());
				i.setEstimatedamount(insuranceDto.getEstimatedamount());
				i.setApprovedstatus(insuranceDto.isApprovedstatus());
				Farmer f = farmerService.findById(insuranceDto.getFarmerId());
				i.setFarmer(f);
				System.out.println(i.getCropName()+" "+i.getCroptype()+" "+i.getEstimatedamount()+" "+i.getSumInsured()+" "+i.getArea()+" "+i.getInsureeName()+" "+i.isApprovedstatus()+" "+insuranceDto.getFarmerId());
				farmerService.applyInsurance(i);
				Status status = new Status();
                status.setStatus(StatusType.SUCCESS);
                status.setMessage("Insurance Applied");
                return status;
				
			}
			catch(FarmerServiceException e)
			{
				Status status = new Status();
                status.setStatus(StatusType.FAILURE);
                status.setMessage(e.getMessage());
                return status;
			}
		}
		@GetMapping(path="/viewAllInsurance")
		public List<Insurance> viewAllInsurance() {
			return farmerService.viewAllInsurance();	
		}
		
		@PostMapping(path = "/claimInsurance")
		public Status claimInsurance(@RequestBody ClaimDto claimDto)
		{
				InsuranceClaim claim = new InsuranceClaim();
				claim.setInsureeName(claimDto.getInsureeName());
				claim.setCauseofloss(claimDto.getCauseofloss());
				claim.setDateofloss(claimDto.getDateofloss());
				claim.setAmount(claimDto.getAmount());
				claim.setClaimapproval(claimDto.isClaimapproval());
				Status s = new Status();
				Insurance i = insuranceService.findById(claimDto.getInsureeId());
				if(i.isApprovedstatus()== true)
				{
					claim.setInsurance(i);
					Farmer f = farmerService.findById(claimDto.getFarmerId());
					claim.setFarmer(f);
					farmerService.claimInsurance(claim);	
					s.setMessage("Insurance Claim applied!");
					s.setStatus(StatusType.SUCCESS);
					return s;
				}
				else {
					s.setStatus(StatusType.FAILURE);
					s.setMessage("Wrong");
					return s;
				}
				
		}
		
		@GetMapping(path="/viewAllClaim")
		public List<InsuranceClaim> viewAllClaim() {
			return farmerService.viewAllClaim();	
		}
		
		
}
