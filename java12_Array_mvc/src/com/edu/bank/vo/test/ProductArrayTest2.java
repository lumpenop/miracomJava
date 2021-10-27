package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;

public class ProductArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pros = {
				new Product("�Ŷ��", 3000, 1, "���"),
				new Product("��γ׻���", 12000, 1, "���"),
				new Product("����ũ��", 23000, 1, "LG"),
				new Product("������", 440000, 1, "���"),
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
