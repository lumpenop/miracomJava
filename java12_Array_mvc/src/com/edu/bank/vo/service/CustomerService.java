package com.edu.bank.vo.service;

import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;

public class CustomerService {

	
	
	//1. Ư�� ���� ������ ��ǰ�� �����ϴ� ���
	public Product[] getProduct(Customer c) {
		return c.getProducts();
	}
	
	
	//2.Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String[] getAllProductMaker(Customer c) {
		
		String[] Makers = new String[c.getProducts().length];
		int index = 0;
		for(Product p : c.getProducts()) {
			Makers[index++] = p.getMaker();
		}
		
		return Makers;
	}
	
	//3. Outlet�ȿ� �ִ� ��� ���� �����ϴ� ���
	
	public Customer[] getCustomers(Customer[] custs) {
		
		Customer[] all = new Customer[custs.length];
		int index = 0;
		
		for(Customer c : custs) {
			all[index++] = c;
		}
		
		return all;
	}
	
	//4. ��� ���� �߿��� Ư���� ���� �˻��ϴ� ���...ssn���� �˻�
	
	public String searchCustomer(Customer[] custs, int ssn) {
		
		for(Customer i : custs) {
			if(i.getSsn() == ssn) {
				return i.getName();
			}
			
		}
		return "�������� �ʴ� ssn";
		
	}
	
	//5. Ư�� ���� ������ ������ �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
	public int searchExpensive(Customer c) {
		int max = 0;
		
		for(Product p : c.getProducts()) {
			if(p.getPrice() > max) {
				max = p.getPrice();
			}
		}
		
		return max;
	}
	
	
	
	//6. ��� ���� ������ ������ Ư������ �̻�Ǵ� ��ǰ���� �����ϴ� ���
	
	public String[] searchMorePrice(Customer[] custs, int price) {
		
		
		int len = 0;
		for(Customer c : custs) {
			if(c.getProducts() == null) {
				break;
			}
			len += c.getProducts().length;
		}
		
		String[] product = new String[len];
		int index = 0;
		for(Customer c: custs) {
			if(c.getProducts() == null) {
				continue;
			}
			for(Product p : c.getProducts()) {
				
				if(p.getPrice() >= price) {
					product[index++] = p.getMaker();
				}
			}
		}
		if(index==0) {
			System.out.println("����");
		}
		
		return product;
	}
	
	//7. ������ ���׿� ����ִ� ������ �����ϴ� ���
	
	public String[] searchCustomer(Customer[] custs, String adrress) {
		String[] sameAddr = new String[custs.length];
		
		
		return sameAddr;
	}
}
