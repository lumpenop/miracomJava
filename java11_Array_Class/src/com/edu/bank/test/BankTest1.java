package com.edu.bank.test;



import com.edu.bank.Account;

public class BankTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Account [] accounts = new Account[3];
		
		for(int i=0; i<3; i++) {
			System.out.println(accounts[i]);
		}
		
		accounts[0]  = new Account(20000.0 ,"����");
		accounts[1]  = new Account(15000.0 ,"����");
		accounts[2]  = new Account(10000.0 ,"�츮");*/
		
		
		Account[] accounts = {
				new Account(10000.0, "����"),
				new Account(5000.0, "����"),
				new Account(1000.0, "�츮")
		};
		
		
		for(Account account : accounts) {
			System.out.println(account.getDetails());
		}
		
	}

}
