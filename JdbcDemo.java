package jdcb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		String Name="Tanush";
		String Address="Satna";
		String Email="tanush@123";
		String Mobile="1234321234";
		String Class1="BSc";
		
      Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Collage_s","root" ,"Shubham@123");
PreparedStatement ps=con.prepareStatement("insert into Student_Detail value(?,?,?,?,?)");
ps.setString(1,Name);
ps.setString(2,Address);
ps.setString(3,Email);
ps.setString(4,Mobile);
ps.setString(5,Class1);




int i=ps.executeUpdate();
if(i>0) {
	System.out.println("Sucessefully");
}else {
	System.out.println("Fail");
}
	}

}
