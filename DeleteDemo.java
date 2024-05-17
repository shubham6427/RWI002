package jdcb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		String Email="tanush@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage_s","root", "Shubham@123");
		PreparedStatement ps = con.prepareStatement("delete from Student_Detail where email=?");
		ps.setString(1, Email);
		int v=ps.executeUpdate();
		if(v>0) {
			System.out.println("Success..");
		}else {
			System.out.println("Fail...");
		}
	}

}
