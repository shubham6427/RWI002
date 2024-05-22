package maven.hiber.demo.MavenHiberDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int houseNo;
private String colony;
private String wardNo;
public Address(int houseNo, String colony, String wardNo) {
	super();
	this.houseNo = houseNo;
	this.colony = colony;
	this.wardNo = wardNo;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public String getColony() {
	return colony;
}
public void setColony(String colony) {
	this.colony = colony;
}
public String getWardNo() {
	return wardNo;
}
public void setWardNo(String wardNo) {
	this.wardNo = wardNo;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.houseNo+" : "+this.colony+" : "+this.wardNo;
}



}
