package com.spring;

public class Student {

	private int sId;
	private String sName;
	private int sClass;
	private char sSection;
	private String sAddress;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsClass() {
		return sClass;
	}
	public void setsClass(int sClass) {
		this.sClass = sClass;
	}
	public char getsSection() {
		return sSection;
	}
	public void setsSection(char sSection) {
		this.sSection = sSection;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public Student(int sId, String sName, int sClass, char sSection, String sAddress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sClass = sClass;
		this.sSection = sSection;
		this.sAddress = sAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sClass=" + sClass + ", sSection=" + sSection
				+ ", sAddress=" + sAddress + "]";
	}
	
	
	
	
}
