package com.edu.bank;

public class Customer {
	
	private int ssn;
	private String name;
	
	
	private Account[] accounts;


	public Customer(int ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}
	
	public String getCustomerInfo() {
		return ssn + ", " + name;
	}
	

}
