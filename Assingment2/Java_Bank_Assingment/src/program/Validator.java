package program;

import java.util.*;
import java.io.*;

public class Validator {
	public int check(String custid,String password){
		int result = 0;
	try {
		
		InputStream input = Index.class.getClassLoader().getResourceAsStream("sys.properties");
		Properties prop = new Properties();
		if(input==null) {
			System.out.println("Sorry config file not found");
		}
		
		prop.load(input);
		
		String sys_custid = prop.getProperty("custid");
		String sys_password = prop.getProperty("password");
		
		
		
		if(custid.contentEquals(sys_custid) && password.equals(sys_password)) {
			result = 1;
		}
		else {
			result = 0;
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	return result;
	
	

}
}