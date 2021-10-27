package com.edu.bank.vo.service;

import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;

public class CustomerService {

	
	
	//1. 특정 고객이 구입한 상품을 리턴하는 기능
	public Product[] getProduct(Customer c) {
		return c.getProducts();
	}
	
	
	//2.특정 고객이 구입한 상품의 maker들만 리턴하는 기능
	public String[] getAllProductMaker(Customer c) {
		
		String[] Makers = new String[c.getProducts().length];
		int index = 0;
		for(Product p : c.getProducts()) {
			Makers[index++] = p.getMaker();
		}
		
		return Makers;
	}
	
	//3. Outlet안에 있는 모든 고객을 리턴하는 기능
	
	public Customer[] getCustomers(Customer[] custs) {
		
		Customer[] all = new Customer[custs.length];
		int index = 0;
		
		for(Customer c : custs) {
			all[index++] = c;
		}
		
		return all;
	}
	
	//4. 모든 고객들 중에서 특정한 고객을 검색하는 기능...ssn으로 검색
	
	public String searchCustomer(Customer[] custs, int ssn) {
		
		for(Customer i : custs) {
			if(i.getSsn() == ssn) {
				return i.getName();
			}
			
		}
		return "존재하지 않는 ssn";
		
	}
	
	//5. 특정 고객이 구입한 물건중 최고가에 해당하는 물건의 가격을 리턴하는 기능
	public int searchExpensive(Customer c) {
		int max = 0;
		
		for(Product p : c.getProducts()) {
			if(p.getPrice() > max) {
				max = p.getPrice();
			}
		}
		
		return max;
	}
	
	
	
	//6. 모든 고객이 구입한 물건중 특정가격 이상되는 제품들을 리턴하는 기능
	
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
			System.out.println("오류");
		}
		
		return product;
	}
	
	//7. 동일한 동네에 살고있는 고객들을 리턴하는 기능
	
	public String[] searchCustomer(Customer[] custs, String adrress) {
		String[] sameAddr = new String[custs.length];
		
		
		return sameAddr;
	}
}
