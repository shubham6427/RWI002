package com.qualify;

public class Customer {
	
private String customerName;
private long creaditValue;
private String customerAddress;

public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getCreaditValue() {
	return creaditValue;
}
public void setCreaditValue(long creaditValue) {
	this.creaditValue = creaditValue;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public Customer(String customerName, long creaditValue, String customerAddress) {
	super();
	this.customerName = customerName;
	this.creaditValue = creaditValue;
	this.customerAddress = customerAddress;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", creaditValue=" + creaditValue + ", customerAddress="
			+ customerAddress + "]";
}


}
