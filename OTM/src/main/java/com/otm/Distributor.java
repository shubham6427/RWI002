package com.otm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Distributor {
@Id
@Column(name="distributor_Name")
	private String distributorName;


private int distributorCode;

@OneToMany
private List<Dealer> dealers;


public Distributor() {
	super();
	// TODO Auto-generated constructor stub
}

public Distributor(String distributorName, int distributorCode, List<Dealer> dealers) {
	super();
	this.distributorName = distributorName;
	this.distributorCode = distributorCode;
	this.dealers = dealers;
}


public String getDistributorName() {
	return distributorName;
}

public void setDistributorName(String distributorName) {
	this.distributorName = distributorName;
}

public int getDistributorCode() {
	return distributorCode;
}

public void setDistributorCode(int distributorCode) {
	this.distributorCode = distributorCode;
}

public List<Dealer> getDealers() {
	return dealers;
}

public void setDealers(List<Dealer> dealers) {
	this.dealers = dealers;
}
	
}
