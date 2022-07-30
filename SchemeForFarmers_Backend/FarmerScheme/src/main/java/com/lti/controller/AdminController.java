package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.BidApproveDto;
import com.lti.dto.ClaimApprovalDto;
import com.lti.dto.InsuranceApproveDto;
import com.lti.dto.InsuranceDto;
import com.lti.dto.Status;
import com.lti.dto.Status.StatusType;
import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.entity.Insurance;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.SellCrop;
import com.lti.service.BidderService;
import com.lti.service.FarmerService;
import com.lti.service.InsuranceService;

@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	private BidderService bidderService;
	@Autowired
	private FarmerService farmerService;
	
	@Autowired
	private InsuranceService insuranceService;
	
	@GetMapping(path="/viewAllBidders")
	public List<Bidder> viewAllBidders() {
		return bidderService.viewAllUsers();	
	}
	
	@GetMapping(path="/viewAllFarmer")
	public List<Farmer> viewAllFarmers() {
		return farmerService.viewAllUsers();	
	}
	
	@GetMapping(path = "/marketPlace")
	public List<Crop> marketPlace()
	{
		return farmerService.marketPlace();
	}
	
	@PostMapping(path = "/BiddingApproval")
	public Status updateCrop(@RequestBody BidApproveDto bidApproveDto)
	{
		Crop c = new Crop();
		SellCrop s = new SellCrop();
		Status status = new Status();
		c.setCropid(bidApproveDto.getCropid());
		c.setCropName(bidApproveDto.getCropName());
		c.setCroptype(bidApproveDto.getCroptype());
		c.setFertilizertype(bidApproveDto.getFertilizertype());
		c.setQuantity(bidApproveDto.getQuantity());
		c.setBaseprice(bidApproveDto.getBaseprice());
		c.setStatus(bidApproveDto.isStatus());
		Farmer f = farmerService.findById(bidApproveDto.getFarmerid());
		Bidder b = bidderService.findById(bidApproveDto.getBidderid());
		c.setFarmer(f);
		int bal = f.getBalance();
		int bBal = b.getBalance();
		f.setBalance(bidApproveDto.getBaseprice() + bal);
		b.setBalance(bBal - bidApproveDto.getBaseprice());
		c.setBidder(b);
		bidderService.placeBid(c);
		bidderService.bidApprove(c);
		status.setStatus(StatusType.SUCCESS);
		status.setMessage("Bid Approved!!!");
		return status;
	}
	@GetMapping(path = "/History")
	public List<SellCrop> history()
	{
		return farmerService.history();
	}
	@PostMapping(path = "/insuranceApproval")
	public Status insuranceApprove(@RequestBody InsuranceApproveDto insuranceApproveDto)
	{
		Status status = new Status();
		Insurance i = new Insurance();
		i.setInsuranceId(insuranceApproveDto.getInsureeId());
		i.setInsureeName(insuranceApproveDto.getInsureeName());
		i.setCropName(insuranceApproveDto.getCropName());
		i.setCroptype(insuranceApproveDto.getCroptype());
		i.setSumInsured(insuranceApproveDto.getSumInsured());
		i.setArea(insuranceApproveDto.getArea());
		i.setEstimatedamount(insuranceApproveDto.getEstimatedamount());
		i.setApprovedstatus(insuranceApproveDto.isApprovedstatus());
		Farmer f = farmerService.findById(insuranceApproveDto.getFarmerId());
		i.setFarmer(f);
		farmerService.applyInsurance(i);
		status.setMessage("Insurance Approved");
		status.setStatus(StatusType.SUCCESS);
		return status;
	}
	@PostMapping(path = "/claimApprove")
	public Status claimApproval(@RequestBody ClaimApprovalDto dto)
	{
		Status s = new Status();
		InsuranceClaim claim = new InsuranceClaim();
		Farmer f = farmerService.findById(dto.getFarmerId());
		Insurance i = insuranceService.findById(dto.getInsureeId());
		claim.setClaimId(dto.getClaimId());
		claim.setAmount(dto.getAmount());
		claim.setCauseofloss(dto.getCauseofloss());
		claim.setClaimapproval(dto.isClaimapproval());
		claim.setDateofloss(dto.getDateofloss());
		claim.setInsureeName(dto.getInsureeName());
		claim.setFarmer(f);
		claim.setInsurance(i);
		claim.setClaimId(dto.getClaimId());
		farmerService.claimInsurance(claim);
		s.setMessage("Approved");
		s.setStatus(StatusType.SUCCESS);
		return s;
	}
}
