package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_bidders")
public class Bidder {
	
	@Id
	@SequenceGenerator(name = "bidder_id", initialValue = 4000,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bidder_id")
	int bidderId;
	String bidderFirstName;
	String bidderLastName;
	String email;
	String password;
	String contactNo;
	int balance=0;
	long aadharNo;
	int traderLicenseNo;
	
	@OneToOne(mappedBy = "bidder", cascade = CascadeType.ALL)
	Address address;
	
	@OneToMany(mappedBy = "bidder", cascade = CascadeType.ALL)
	List<Crop> crop;
	
	@OneToMany(mappedBy = "bidder", cascade = CascadeType.ALL)
	List<SellCrop> sellCrop;
	public Bidder()
	{
		super();
	}
	
	

	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	public String getBidderFirstName() {
		return bidderFirstName;
	}
	public void setBidderFirstName(String bidderFirstName) {
		this.bidderFirstName = bidderFirstName;
	}
	public String getBidderLastName() {
		return bidderLastName;
	}
	public void setBidderLastName(String bidderLastName) {
		this.bidderLastName = bidderLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public int getTraderLicenseNo() {
		return traderLicenseNo;
	}
	public void setTraderLicenseNo(int traderLicenseNo) {
		this.traderLicenseNo = traderLicenseNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@JsonIgnore
	public List<SellCrop> getSellCrop() {
		return sellCrop;
	}
	public void setSellCrop(List<SellCrop> sellCrop) {
		this.sellCrop = sellCrop;
	}
	
	@JsonIgnore
	public List<Crop> getCrop() {
		return crop;
	}

	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}
	

}
