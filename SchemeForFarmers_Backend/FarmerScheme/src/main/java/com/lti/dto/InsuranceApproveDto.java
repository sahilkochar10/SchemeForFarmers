package com.lti.dto;

public class InsuranceApproveDto {
	int insureeId;
	String insureeName;
	int farmerId;
	String cropName;
	String croptype;
	int sumInsured;
	int area;
	int estimatedamount;
	boolean approvedstatus;
	public int getInsureeId() {
		return insureeId;
	}
	public void setInsureeId(int insureeId) {
		this.insureeId = insureeId;
	}
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
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
	public String getInsureeName() {
		return insureeName;
	}
	public void setInsureeName(String insureeName) {
		this.insureeName = insureeName;
	}
	
	
}
