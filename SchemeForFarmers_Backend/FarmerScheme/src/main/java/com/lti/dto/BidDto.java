package com.lti.dto;

public class BidDto {
	int cropId;
	int farmerId;
	int bidderId;
	String cropType;
	String cropName;
	String fertilizertype;
	int quantity;
	int baseprice;
	boolean status;
	
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getFertilizertype() {
		return fertilizertype;
	}
	public void setFertilizertype(String fertilizertype) {
		this.fertilizertype = fertilizertype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	
}
