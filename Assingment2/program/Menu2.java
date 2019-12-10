package program;
import java.util.*;
import java.sql.*;
public class Menu2 {
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
	
	public void  m1(){
		System.out.println("Press 1 : Update ");
		System.out.println("Press 2 : Delete ");
		int choice = cin.nextInt();
		cin.nextLine();
		switch(choice) {
		case 1:
			updateRecords();
			 break;
		case 2:
			delete();
		}
		
	
		 
	}
	
	public void m2() {
		
	}
	
	public void updateRecords() {
		String query_update = "UPDATE customer SET password=?,rewards=?,city=? WHERE cust_id=?";
		
		System.out.println("Enter customer id to update");
		String cust_update = cin.nextLine();
		System.out.println("Enter new Password");
		String new_password = cin.nextLine();
		System.out.println("Enter new rewards");
		String new_rewards = cin.nextLine();
		System.out.println("Enter city");
		String new_city = cin.nextLine();
		
		try {
			Connection con = getConnection();
			ps = con.prepareStatement(query_update);
			ps.setString(1, new_password);
			ps.setString(2, new_rewards);
			ps.setString(3, new_city);
			ps.setString(4,cust_update);
			ps.executeUpdate();
			System.out.println("Update Succesful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void delete() {
	String query_delete = "DELETE FROM customer WHERE cust_id =?";
	System.out.println("Enter customer id to delete");
	String del_cust_id = cin.nextLine();
	try {
		Connection con =getConnection();
		ps = con.prepareStatement(query_delete);
		ps.setString(1, del_cust_id);
		ps.executeUpdate();
		System.out.println("Customer deleted");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
