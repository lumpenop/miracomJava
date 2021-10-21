package com.edu.bank;

public class Account {
	double balance;
	
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	
	

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}
	
	public void deposit(int amt) {
		balance += amt;
	}
	
	public void withdraw(int amt) {
		balance -= amt;
	}
}

