package com.lti.dto;

public class BidApproveDto {
	int cropid;
    int farmerid;
    int bidderid;
    String croptype;
	String cropName;
	String fertilizertype;
	int quantity;
	int baseprice;
    boolean status;
	public int getCropid() {
		return cropid;
	}
	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	public int getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}
	public int getBidderid() {
		return bidderid;
	}
	public void setBidderid(int bidderid) {
		this.bidderid = bidderid;
	}
	public String getCroptype() {
		return croptype;
	}
	public void setCroptype(String croptype) {
		this.croptype = croptype;
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
    
}
