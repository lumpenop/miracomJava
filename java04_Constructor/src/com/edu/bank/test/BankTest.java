package com.edu.bank.test;

import com.edu.bank.Customer;
import com.edu.bank.Account;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Customer custom1 = new Customer("Morzart", "Kim");
		
		custom1.setAccount(new Account(10000.0));
		
		
		Account jamesAcc = custom1.getAccount();
		
		jamesAcc.deposit(10000);
		System.out.println(jamesAcc.getBalance()); 
		
		
		
	}

}
