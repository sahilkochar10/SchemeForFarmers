package com.lti.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="tbl_crops")
public class Crop {
	
	@Id
	@SequenceGenerator(name = "crop_id", initialValue = 100,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crop_id")
	int cropid;
	String croptype;
	String cropName;
	String fertilizertype;

	int quantity;
	int baseprice;
	boolean status;	
	
	@ManyToOne
	@JoinColumn(name = "bidderId")
	Bidder bidder;
	
	@ManyToOne
	@JoinColumn(name="farmerId")
	Farmer farmer;

	public Crop() {
		super();
	}

	public int getCropid() {
		return cropid;
	}

	public void setCropid(int cropid) {
		this.cropid = cropid;
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
