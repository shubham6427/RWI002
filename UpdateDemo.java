package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		String Address="Indore";
		String Email="shubhamtiwari921111@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage_s", "root","Shubham@123");
 PreparedStatement ps= con.prepareStatement("update Student_Detail set Address=? where email=?");
ps.setString(1, Address);
ps.setString(2, Email);
int count=ps.executeUpdate();
	if(count>0) {
		System.out.println("Success");
				}else {System.out.println("Fail"); 
				}
	
	}

}
