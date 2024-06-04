package bean.beanscope;

public class Address {
private int houseNo;
private long pinCode;
private String city;


public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public long getPinCode() {
	return pinCode;
}
public void setPinCode(long pinCode) {
	this.pinCode = pinCode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(int houseNo, long pinCode, String city) {
	super();
	this.houseNo = houseNo;
	this.pinCode = pinCode;
	this.city = city;
}
@Override
public String toString() {
	return "Address [houseNo=" + houseNo + ", pinCode=" + pinCode + ", city=" + city + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}




}
