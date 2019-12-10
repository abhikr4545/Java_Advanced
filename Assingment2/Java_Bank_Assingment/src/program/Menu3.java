package program;

import java.sql.*;
import java.util.Scanner;

public class Menu3 {
	static Scanner cin = new Scanner(System.in);
	final static String url = "jdbc:mysql://localhost:3306/java_bank?useSSL=false";
	final static String user = "root";
	final static String password = "root";
	static PreparedStatement ps = null;
	static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		return con;
	}
	
	public void add() {
		System.out.println("Enter id");
		String cid = cin.nextLine();
		System.out.println("Enter password");
		String cpassword = cin.nextLine();
		System.out.println("Enter rewards");
		String crewards = cin.nextLine();
		System.out.println("Enter  city");
		String city = cin.nextLine();
		
		String query_insert = "INSERT INTO customer(cust_id,password,rewards,city) VALUES(?,?,?,?)";
		try {
			Connection con = getConnection();
			ps = con.prepareStatement(query_insert);
			ps.setString(1, cid);
			 ps.setString(2, cpassword);
			 ps.setString(3, crewards);
			 ps.setString(4, city);
			  ps.executeUpdate();
			  System.out.println("Customer Added");
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
