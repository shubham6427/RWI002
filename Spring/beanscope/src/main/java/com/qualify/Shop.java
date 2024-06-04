package com.qualify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Shop {
private int shopNo;
private String shopName;
@Autowired
@Qualifier("Rahul")
private Customer customer;
public Shop(int shopNo, String shopName, Customer customer) {
	super();
	this.shopNo = shopNo;
	this.shopName = shopName;
	this.customer = customer;
}
public Shop() {
	super();
}
public int getShopNo() {
	return shopNo;
}
public void setShopNo(int shopNo) {
	this.shopNo = shopNo;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "Shop [shopNo=" + shopNo + ", shopName=" + shopName + ", customer=" + customer + "]";
}

}
