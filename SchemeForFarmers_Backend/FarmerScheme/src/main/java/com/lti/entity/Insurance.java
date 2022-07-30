package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_insurances")
public class Insurance {
	
	@Id
	@SequenceGenerator(name = "insur_id", initialValue = 600,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "insur_id")
	int insuranceId;
	String insureeName;
	String cropName;
	String croptype;
	int sumInsured;
	int area;
	int estimatedamount;
	boolean approvedstatus;
	
	@ManyToOne
	@JoinColumn(name="farmerId")
	Farmer farmer;
	
	@OneToOne(mappedBy = "insurance", cascade = CascadeType.ALL)
	InsuranceClaim insuranceClaim;

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsureeName() {
		return insureeName;
	}

	public void setInsureeName(String insureeName) {
		this.insureeName = insureeName;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	

	public String getCroptype() {
		return croptype;
	}

	public void setCroptype(String croptype) {
		this.croptype = croptype;
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getEstimatedamount() {
		return estimatedamount;
	}

	public void setEstimatedamount(int estimatedamount) {
		this.estimatedamount = estimatedamount;
	}

	public boolean isApprovedstatus() {
		return approvedstatus;
	}

	public void setApprovedstatus(boolean approvedstatus) {
		this.approvedstatus = approvedstatus;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	@JsonIgnore
	public InsuranceClaim getInsuranceClaim() {
		return insuranceClaim;
	}

	public void setInsuranceClaim(InsuranceClaim insuranceClaim) {
		this.insuranceClaim = insuranceClaim;
	}
	
	
	

}
