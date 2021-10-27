package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BnakTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account(1000.0, "신한");
		Account acc2 = new Account(2000.0, "국민");
		Account acc3 = new Account(3000.0, "우리");
		
		Customer James = new Customer(1, "James");
		
		Account[] accounts = {acc1, acc2, acc3};
		
		James.setAccounts(accounts);
		
		Account[] reAcc = James.getAccounts();
		
		Account choice = null;
		for(Account acc : reAcc) {
			if(acc.getBankName().equals("신한")) {
				choice = acc;
			}
		}
		
	
		choice.deposit(900);
		choice.deposit(30000);
		
		
		choice.withdraw(50000);
		System.out.println(choice.getBalance());
		choice.withdraw(5000);
		System.out.println(choice.getBalance());
		
		
		
		
	}

}
