package com.lti.entity;

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
@Table(name = "tbl_sellCrops")
public class SellCrop {
	
	@Id
	@SequenceGenerator(name = "sellCrop_id", initialValue = 200,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sellCrop_id")
	int sellcropid;	
	int bidprice;
	boolean sold;
	
	@ManyToOne
	@JoinColumn(name="farmerId")
	Farmer farmer;
	
	@ManyToOne
	@JoinColumn(name="bidderId")
	Bidder bidder;
	
	@OneToOne
	@JoinColumn(name=" cropid")
	Crop crop;

	public SellCrop() {
		super();
	}

	public int getSellcropid() {
		return sellcropid;
	}

	public void setSellcropid(int sellcropid) {
		this.sellcropid = sellcropid;
	}

	public int getBidprice() {
		return bidprice;
	}

	public void setBidprice(int bidprice) {
		this.bidprice = bidprice;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
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

	public Crop getCrop() {
		return crop;
	}

	public void setCrop(Crop crop) {
		this.crop = crop;
	}
	
	

}
