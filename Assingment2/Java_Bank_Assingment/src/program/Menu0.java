package program;

import java.sql.*;
import java.util.Scanner;

public class Menu0 {
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
	
	public void showALL() {
		Menu2 menu2 = new Menu2();
		Menu3 menu3 = new Menu3();
		System.out.println("Enter customer id");
		String input = cin.nextLine();
		
		String query_all = "SELECT cust_id from customer";
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query_all);
			while(rs.next()) {
				String fid =  rs.getString("cust_id");
				if(input.equals(fid)) {
					menu2.m1();
					break;
				}
				else {
					menu3.add();
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


