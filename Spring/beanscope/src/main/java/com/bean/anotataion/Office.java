package com.bean.anotataion;

import org.springframework.beans.factory.annotation.Autowired;


public class Office {
private int eId;
private String eName;
@Autowired
private Employee employee;

public int geteId() {
	return eId;
}

public void seteId(int eId) {
	this.eId = eId;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

public Office(int eId, String eName, Employee employee) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.employee = employee;
}

public Office() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Office [eId=" + eId + ", eName=" + eName + ", employee=" + employee + "]";
}


}
