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
@Table(name="tbl_farmers")
public class Farmer {
	
	@Id
	@SequenceGenerator(name = "farmer_id", initialValue = 2000,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmer_id")
	int farmerId;
	String farmerFirstName;
	String farmerLastName;
	String landDetails; 
	String email;
	String password;
	String contactNo; 
	int balance=0;
	Long aadharNo;
	
	@OneToOne(mappedBy = "farmer", cascade = CascadeType.ALL)
	Address address;
	
	@OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
	List<Insurance> insurance;
	
	@OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
	List<Crop> crop;
	
	@OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
	List<SellCrop> sellCrop;
	
	//doubt in farmer- claim relation
	@OneToMany(mappedBy = "farmer", cascade= CascadeType.ALL)
	List<InsuranceClaim> insuranceClaim;

	
	public Farmer() {
		super();
	}



	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerFirstName() {
		return farmerFirstName;
	}

	public void setFarmerFirstName(String farmerFirstName) {
		this.farmerFirstName = farmerFirstName;
	}

	public String getFarmerLastName() {
		return farmerLastName;
	}

	public void setFarmerLastName(String farmerLastName) {
		this.farmerLastName = farmerLastName;
	}

	public String getLandDetails() {
		return landDetails;
	}

	public void setLandDetails(String landDetails) {
		this.landDetails = landDetails;
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

	public Long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@JsonIgnore

	public List<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(List<Insurance> insurance) {
		this.insurance = insurance;
	}

	

	
	@JsonIgnore
	public List<Crop> getCrop() {
		return crop;
	}

	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}
	@JsonIgnore
	public List<SellCrop> getSellCrop() {
		return sellCrop;
	}

	public void setSellCrop(List<SellCrop> sellCrop) {
		this.sellCrop = sellCrop;
	}
	@JsonIgnore
	public List<InsuranceClaim> getInsuranceClaim() {
		return insuranceClaim;
	}

	public void setInsuranceClaim(List<InsuranceClaim> insuranceClaim) {
		this.insuranceClaim = insuranceClaim;
	}
	

}
