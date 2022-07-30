package com.lti.dto;

public class ClaimApprovalDto {	
	int claimId;
	int insureeId;
	int farmerId;
	String insureeName;
	String causeofloss;
	String dateofloss;
	int amount;
	boolean claimapproval;
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
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
	
}
