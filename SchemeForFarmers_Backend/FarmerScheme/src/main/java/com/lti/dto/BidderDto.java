package com.lti.dto;

public class BidderDto {
	private int bidderId;
	private String bidderFirstName;
	private String bidderLastName;
	private String email;
	private String contactNo;
	private int balance=0;
	private int aadharNo;
	private int traderLicenseNo;
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
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public int getTraderLicenseNo() {
		return traderLicenseNo;
	}
	public void setTraderLicenseNo(int traderLicenseNo) {
		this.traderLicenseNo = traderLicenseNo;
	}
	
	
}
