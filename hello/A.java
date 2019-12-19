package exam.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "*")
@RestController
public class A {
	
	private B obj1;
	
	public A()
	{
		////System.out.println("A object created");
		
	}
	
	
	@Autowired
	public void setObj1(B obj1) {
		System.out.println("Controller : service is wired with Controller ");
		this.obj1 = obj1;
	}


//http:localhost:8080?x=1
	
	//http://localhost:8080/pw?x=1
	
	//http://localhost:8080/pw?x=10, you will get mobile no as zero
	
	@GetMapping("/pw")
	public Account f1(@RequestParam("x")int mn)//assume single select
	{
		System.out.println("function pw is getting called");
		Account m =obj1.getAccount(mn);
		return m;
		
	}
	
	
	@PostMapping("/upd")
	public Account f2(@RequestBody Account n)//assume single select
	{
	
		
		Account m =obj1.updateAcc(n);
		return m;
		
	}
	
	@GetMapping("/ms") //multiselect
	public List<Account> get()
	{
		List<Account> x =obj1.getAll();
		return x;
		
	}
	
	
//	@GetMapping("/sbs")
//	public Account whocares(@RequestParam("x") int imeino)
//	{
//		System.out.println("please work");
//		Account x =new Account();
//		x.setAccno(88);
//		x.setPin(800);
//		x.setBalance(8989);
//		return x;
//		
//	}
	
	@GetMapping("/del")
	public Account delData(@RequestParam("x")int accno) {
		
		Account m = obj1.delAcc(accno);
		return m;
	}
	
	
	
	

}
