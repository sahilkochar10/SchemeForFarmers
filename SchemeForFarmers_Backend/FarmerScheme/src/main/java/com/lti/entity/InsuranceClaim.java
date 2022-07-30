package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_insurClaims")
public class InsuranceClaim {
	
	@Id
	@SequenceGenerator(name = "claim_id", initialValue = 400,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "claim_id")

	int claimId;	
	String insureeName;
	String causeofloss;
	String dateofloss;
	int amount;
	boolean claimapproval;
	
	@OneToOne
	@JoinColumn(name="insuranceid")
	Insurance insurance;
	
	@ManyToOne
	@JoinColumn(name = "farmerId")
	Farmer farmer;

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public String getInsureeName() {
		return insureeName;
	}

	public void setInsureeName(String insureeName) {
		this.insureeName = insureeName;
	}

	public String getCauseofloss() {
		return causeofloss;
	}

	public void setCauseofloss(String causeofloss) {
		this.causeofloss = causeofloss;
	}

	public String getDateofloss() {
		return dateofloss;
	}

	public void setDateofloss(String dateofloss) {
		this.dateofloss = dateofloss;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isClaimapproval() {
		return claimapproval;
	}

	public void setClaimapproval(boolean claimapproval) {
		this.claimapproval = claimapproval;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	
	
}
