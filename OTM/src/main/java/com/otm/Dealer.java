package com.otm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Dealer {

	@Id
	@Column(name="dealer_code")
	private int dealerCode;
	private String dealerName;
	private String product1;
	private String product2;
	private String product3;
	
	@ManyToOne
	private Distributor distributor;

	public int getDealerCode() {
		return dealerCode;
	}

	public void setDealerCode(int dealerCode) {
		this.dealerCode = dealerCode;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getProduct1() {
		return product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
	}

	public String getProduct2() {
		return product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
	}

	public String getProduct3() {
		return product3;
	}

	public void setProduct3(String product3) {
		this.product3 = product3;
	}

	public Distributor getDistributor() {
		return distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	public Dealer(int dealerCode, String dealerName, String product1, String product2, String product3,
			Distributor distributor) {
		super();
		this.dealerCode = dealerCode;
		this.dealerName = dealerName;
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.distributor = distributor;
	}

	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
