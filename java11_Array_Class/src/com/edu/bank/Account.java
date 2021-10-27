package com.edu.bank;
/*
 * 통장에 대한 정보를 가지고 있는 클래스..
 * balance, bankName 필드를 선언하겠다.
 * 자바에서는 모든 클래스를 작성할때 반드시 Encapsulation기법을 따라서 작성한다.
 * 필드--> private
 * 메소드 --> public
 */
public class Account {
	//1.필드 선언
	private double balance;
	private String bankName;
	
	//2.주입통로를 결정
	public Account(double balance, String bankName) {
		super();
		this.balance = balance;
		this.bankName = bankName;
	}
	



	//3. 필드를 반환..
	public String getDetails() {
		return balance+","+bankName;
	}
	
	//나머지 기능들을 작성..
	public void deposit(double amt) {
		if(amt >= 1000.0) balance +=  amt;
		else System.out.println("1000원 이상의 금액 입력");
	}
	
	public void withdraw(double amt) {
		if(balance >= amt) balance -=amt;
		else System.out.println("잔액이 부족합니다");;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getBankName() {
		return bankName;
	}
}
