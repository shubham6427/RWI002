package com.result;

public class Student {

	
	private int sId;
	private String sName;
	private char sClass;
	
	private int a1;
	private int a2;
	private int a3;
	private int a4;
	private int a5;
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
	public char getsClass() {
		return sClass;
	}
	public void setsClass(char sClass) {
		this.sClass = sClass;
	}
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	public int getA3() {
		return a3;
	}
	public void setA3(int a3) {
		this.a3 = a3;
	}
	public int getA4() {
		return a4;
	}
	public void setA4(int a4) {
		this.a4 = a4;
	}
	public int getA5() {
		return a5;
	}
	public void setA5(int a5) {
		this.a5 = a5;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, char sClass, int a1, int a2, int a3, int a4, int a5) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sClass = sClass;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
	}
	
	public void print(){
		
		System.out.println("Student Id "+sId+"\n"+"Student Name "+sName+"\n"+"Student Class"+sClass+"\n"+"Mathematics "+a1+"\n"+"Physics "+a2+"\n"+"Chemistry "+a3+"\n"+"English "+a4+"\n"+"Hindi "+a5);
int total_Number = (a1+a2+a3+a4+a5);
System.out.println("Total Number Obtained : "+total_Number);
int average=(total_Number)/5;

if(average>=80) {
	System.out.println("You achive : A Grade");
}else if(average<=79) {
	System.out.println("You achieve : B Grade");
}else {
	System.out.println("You are Fail");
}

		
	}

	
	
}
