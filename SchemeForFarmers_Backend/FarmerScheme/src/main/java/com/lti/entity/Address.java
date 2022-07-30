package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_address")
public class Address {
	
	@Id
	@SequenceGenerator(name = "address_id", initialValue = 1000,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id")
	int addressId;
	String street;
	String city;
	String state;
	String pincode;
	
	@OneToOne
	@JoinColumn(name = "farmerId")
	Farmer farmer;
	
	@OneToOne
	@JoinColumn(name = "bidderId")
	Bidder bidder;

	
	public Address() {
		super();
	}


	public Address(int addressId, String street, String city, String state, String pincode, Farmer farmer,
			Bidder bidder) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.farmer = farmer;
		this.bidder = bidder;
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public Farmer getFarmer() {
		return farmer;
	}


	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}


	public Bidder getBidder() {
		return bidder;
	}


	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}
	
	
}
