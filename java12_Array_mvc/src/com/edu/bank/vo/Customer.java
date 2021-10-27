package com.edu.bank.vo;

public class Customer {
	private int ssn;
	private String name;
	private String adress;
	
	
	private Product[] products;


	public Customer(int ssn, String name, String adress) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.adress = adress;
	}


	public int getSsn() {
		return ssn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public Product[] getProducts() {
		return products;
	}


	public void buyProducts(Product[] products) {
		this.products = products;
	}
	
	public String getCustomerInfo() {
		return name + ", " + adress;
	}


	
	
}
