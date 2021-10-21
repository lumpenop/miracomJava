package com.edu.bank;

import com.edu.bank.Account;

public class Customer {
	String firstName;
	String lastName;
	
	Account account;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public void setAccount(Account account) {
		this.account = account;
	}

	
	public Account getAccount() {
		return account;
	}


	public String getCustomer() {
		return firstName + " " + lastName;
	}
	
	
}
