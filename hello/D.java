package exam.hello;

import java.util.List;

import org.springframework.web.client.RestTemplate;

public class D {

	
	//please before running D.java ensure server is running.
	
	public static void main(String[] args) {
		// suppose postman goes to post office
		String url ="http://localhost:7700";
		RestTemplate t =new RestTemplate();
		
//		  Account x = t.getForObject(url+"/pw?y=111", Account.class);
//		  System.out.println(x);

		  
		  
		//  Account n = t.getForObject(url+"/pw?x=112", Account.class); 
	//	  System.out.println(n);


		  
		  
		  
		  
//		  
//	  List l = t.getForObject(url+"/ms",List.class); 
//		  
//		  System.out.println("-------??????????------------"+l);
		
		  
		  
//		  Account z =new  Account(151,999,90900);
//		  Account q =  t.postForObject(url+"/upd", z, Account.class);
//		  System.out.println("***************"+q);
		  
		  
		  
		  Account x = t.getForObject(url+"/del?x=112", Account.class);
		  System.out.println("----deleted--------"+x);
		  
		  /*
		
		  List l = t.getForObject(url+"/ms",List.class); 
		  
		  System.out.println(l.size());
		 
		
		  Mobile z =new Mobile(67,77);
		  Mobile q =  t.postForObject("http://localhost:8080/upd", z, Mobile.class);
		  System.out.println(q);
		  
		  
		  
		  */
		 
		
		
		
		
		
		
		
		
		

	}

}
