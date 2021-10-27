package com.edu.bank.vo.service;

import com.edu.bank.vo.Product;

public class ProductService {

	
	public void printAllProducMakers(Product[] pros) {
		
		String allMaker = "";
		
		for(Product p : pros) {
			allMaker += p.getMaker() + " ";
		}
		
		System.out.println("maker ดย " +  allMaker);
	}
	
	public int getTotalPrice(Product[] pros) {
		
		int total = 0;
		
		for(Product p : pros) {
			total += p.getPrice() * p.getQuantity();
		}
		
		return total;
	}
	
	public Product[] getUpToPrices(Product[] pros, int price) {
		
		Product[] Makers = new Product[pros.length];
		int index = 0;
		for(Product p : pros) {
			if(p.getPrice() >= price) {
				Makers[index] = p;
				index++;
			}
		}
		
		return Makers;
	}
	
	public Product[] getSameMakers(Product[] pros, String maker) {
		
		Product[] Makers = new Product[pros.length];
		int index = 0;
		for(Product p : pros) {
	
			if(p.getCompany().equals(maker)) {
				
				Makers[index++] = p;
			}
		}
		
		return Makers;
	}
	
	public double getMeanPrice(Product[] pros) {
		
		
		return getTotalPrice(pros) / pros.length;
	}

	
	

}
