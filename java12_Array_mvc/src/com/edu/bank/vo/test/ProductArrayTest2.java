package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;

public class ProductArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pros = {
				new Product("½Å¶ó¸é", 3000, 1, "³ó½É"),
				new Product("ÈïºÎ³×»ý¼ö", 12000, 1, "³ó½É"),
				new Product("¿Á½ÃÅ©¸°", 23000, 1, "LG"),
				new Product("Á¤¼ö±â", 440000, 1, "´ë¿ì"),
		};
		
		
		
		for(Product pro : pros) {
			System.out.println(pro.getMaker());
		}
		
		for(Product pro : pros) {
			if(pro.getPrice() >= 300000) {
				System.out.println(pro.getDetails());
			}
		}
		
		int totalPrice = 0;
		for(Product pro : pros) {

			totalPrice += pro.getPrice() * pro.getQuantity();
		}
	
		System.out.println(totalPrice);
	}

}
