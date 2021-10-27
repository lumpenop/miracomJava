package com.edu.bank.vo.test;

import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;
import com.edu.bank.vo.service.CustomerService;

public class OutletServiceTest4 {
	
	public static void main(String[] args) {
		Product[] pros1 = {
				new Product("신라면", 3000, 5, "농심"),
				new Product("흥부네생수", 12000, 10, "농심"),
				new Product("옥시크린", 23000, 1, "LG"),
				new Product("정수기", 440000, 1, "대우")
		};
		
		Product[] pros2 = {
				new Product("죽염치약", 8000, 1, "LG"),
				new Product("새우깡", 1000, 2, "농심"),
				new Product("하이타이", 50000, 1, "LG")
		};
		
		Customer[] custs = {
				new Customer(111, "원빈", "방배동"),
				new Customer(222, "아이유", "신사동")
		};
		
		custs[0].buyProducts(pros1);
		custs[0].buyProducts(pros1);
		
		CustomerService cs = new CustomerService();
		
		
		// 특정 고객이 구입한 상품의 maker들만 리턴하는 기능
		String[] returnMakers = cs.getAllProductMaker(custs[0]);
		
//		for(String m : returnMakers) {
//			System.out.println(m);
//		}
		
		
		// Outlet안에 있는 모든 고객을 리턴하는 기능
		Customer[] returnAllCs =  cs.getCustomers(custs);
		
//		for(Customer c : returnAllCs) {
//			System.out.println(c.getName());
//		}
		
		
		// 모든 고객 중 특정 고객을 ssn 으로 검색
		String returnSearch = cs.searchCustomer(custs, 111);
//		System.out.println(returnSearch);
		
		
		// 고객이 구매한 물품 중 가장 높은 가격
//		System.out.println(cs.searchExpensive(custs[0]));
		
		String[] returnMorePrice = cs.searchMorePrice(custs, 44000);
		
		for(String p : returnMorePrice) {
			if(p == null) {
				break;
			}else {
				System.out.println(p);
			}
			
		}
		
		
			
	}
	
}
