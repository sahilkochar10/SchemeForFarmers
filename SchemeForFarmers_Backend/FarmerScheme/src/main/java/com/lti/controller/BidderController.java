package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.BidDto;
import com.lti.dto.CropDto;
import com.lti.dto.LoginDto;
import com.lti.dto.LoginStatus;
import com.lti.dto.Status;
import com.lti.dto.Status.StatusType;
import com.lti.entity.Bidder;
import com.lti.entity.Crop;
import com.lti.entity.Farmer;
import com.lti.exception.BidderServiceException;
import com.lti.service.BidderService;
import com.lti.service.CropService;
import com.lti.service.FarmerService;

@RestController
@CrossOrigin
public class BidderController {
	@Autowired
	private BidderService bidderService;
	
	@Autowired
	private FarmerService farmerService;
	
	@Autowired
	private CropService cropService;
	
	@PostMapping(path="/register")
	public Status register(@RequestBody Bidder bidder) {
        try {
            bidderService.register(bidder);
           
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
	@PostMapping("/BidderLogin")
	public Bidder login(@RequestBody LoginDto loginDto) {
		try {
			Bidder bidder = bidderService.login(loginDto.getEmail(), loginDto.getPassword());
			return bidder;
		}
		catch(BidderServiceException e) {
			LoginStatus loginStatus = new LoginStatus();
			loginStatus.setStatus(StatusType.FAILURE);
			loginStatus.setMessage(e.getMessage());
			return null;
		}
	}
	
	@GetMapping("/Crop/{cropId}")
	public Crop findById(@PathVariable int cropId)
	{
		Crop c = cropService.findById(cropId);
		return c;
	}
	
	@PostMapping("/BidPlace")
	public Status updateCrop(@RequestBody BidDto bidDto)
	{
		Crop c = new Crop();
		int id= bidDto.getFarmerId();
		int baseprice = bidDto.getBaseprice();
		System.out.println(id);
		Farmer f = farmerService.findById(id);
		Bidder b = bidderService.findById(bidDto.getBidderId());
		if(b.getBalance() > bidDto.getBaseprice())
		{
		c.setCropid(bidDto.getCropId());
		c.setCropName(bidDto.getCropName());
		c.setCroptype(bidDto.getCropType());
		c.setFertilizertype(bidDto.getFertilizertype());
		c.setQuantity(bidDto.getQuantity());
		c.setBaseprice(baseprice);
		c.setStatus(bidDto.isStatus());
		c.setFarmer(f);
		c.setBidder(b);
		System.out.println(c.getBaseprice());
		bidderService.placeBid(c);
		Status status = new Status();
        status.setStatus(StatusType.SUCCESS);
        status.setMessage("Bid Placed!");
		return status;	
		}
		else
		{
			Status status = new Status();
            status.setStatus(StatusType.FAILURE);
            status.setMessage("Balance is low");
            return status;
		}
	}
	
	
	

	
}
