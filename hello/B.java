package exam.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	
	private C obj1;
	
	
	@Autowired
	public void setObj1(C obj1) {
		System.out.println("Service : repository DAO  wired to service ");
		this.obj1 = obj1;
	}




	public B()
	{
		
		//System.out.println("B object created");
	}




	
	//single select scenario
	public Account getAccount(int accno) {
		// note obj1 here is a repository object
		
		Optional<Account> x = obj1.findById(accno);
		Account y =null;
		if(x.isPresent())
		{
		
			 y = x.get();  //get the Account object
			//updateAccount(y);
		}
		else
		{
			y =new Account(0);//making account no as zero if accno is not found;	
		}
		//logic is mobile object iemi no is zero then mobile no is not found.
		return y;
		
		
		
		
	}




	public Account updateAccount(Account n) {
	//	System.out.println("update failure");
		// TODO Auto-generated method stub
		n.setBalance(3000);
		if(obj1.existsById(n.getAccno()))
		{	
			obj1.save(n);
		}//change of failing is almost zero.
		
		else
		{	
			n = new Account(0);
			//obj1.save(n);
		}
				return n;
	}

	public Account updateAcc(Account n) {
	//	System.out.println("update failure");
		// TODO Auto-generated method stub
	
		if(obj1.existsById(n.getAccno()))
		{	
			obj1.save(n);
		}//change of failing is almost zero.
		
		else
		{	
			n = new Account(0);
			//obj1.save(n);
		}
				return n;
	}



	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return obj1.findAll();
	}




	public Account delAcc(int accno) {
		// TODO Auto-generated method stub
		obj1.deleteById(accno);
	Account a = getAccount(accno);
return a;
	
	}

}
