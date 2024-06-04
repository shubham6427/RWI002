package com.bean.anotataion;

public class Employee {
private String eCity;
private long ePinCode;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String eCity, long ePinCode) {
	super();
	this.eCity = eCity;
	this.ePinCode = ePinCode;
}
public String geteCity() {
	return eCity;
}
public void seteCity(String eCity) {
	this.eCity = eCity;
}
public long getePinCode() {
	return ePinCode;
}
@Override
public String toString() {
	return "Employee [eCity=" + eCity + ", ePinCode=" + ePinCode + "]";
}
public void setePinCode(long ePinCode) {
	this.ePinCode = ePinCode;
}

}
