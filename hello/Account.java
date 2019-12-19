package exam.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private int accno;
	private int pin;
	private int balance;
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", pin=" + pin + ", balance=" + balance + "]";
	}

	
	Account(){
		
	}
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	Account(int accno){
		this.accno = accno;
	}
	Account(int accno , int pin,int balance){
		this.accno = accno;
		this.pin = pin;
		this.balance = balance;
	}
	Account(int accno ,int balance){
		this.accno = accno;
		this.pin = pin;
		this.balance = balance;
	}

	
	
}
