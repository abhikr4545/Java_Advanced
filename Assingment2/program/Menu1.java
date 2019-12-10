package program;

import java.util.*;
import java.io.*;

public class Menu1 {
	public void check() {
		Validator v = new Validator();
		Menu0 menu0 = new Menu0();
		Scanner cin = new Scanner(System.in);
		boolean processing = true;
		do {
		System.out.println("Press 1 : Login");
		System.out.println("Press 2 : Exit");
		System.out.println("Enter your choice");
		
		int choice = cin.nextInt();
		cin.nextLine();
		
		switch(choice) {
		case 1:
			System.out.println("Enter customer id");
			String cid = cin.nextLine();
			System.out.println("Enter password");
			String pass = cin.nextLine();
			int x = v.check(cid, pass);
			if(x>0) {
				System.out.println("User valid");
				menu0.showALL();
				
			}
			else {
				System.out.println("User invalid");
			}
			break;
		case 2:
			processing = false;
			break;
		}
	}while(processing);
		}
	}

