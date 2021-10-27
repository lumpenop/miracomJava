package com.edu.bank.vo.test;

import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;
import com.edu.bank.vo.service.CustomerService;

public class OutletServiceTest4 {
	
	public static void main(String[] args) {
		Product[] pros1 = {
				new Product("�Ŷ��", 3000, 5, "���"),
				new Product("��γ׻���", 12000, 10, "���"),
				new Product("����ũ��", 23000, 1, "LG"),
				new Product("������", 440000, 1, "���")
		};
		
		Product[] pros2 = {
				new Product("�׿�ġ��", 8000, 1, "LG"),
				new Product("�����", 1000, 2, "���"),
				new Product("����Ÿ��", 50000, 1, "LG")
		};
		
		Customer[] custs = {
				new Customer(111, "����", "��赿"),
				new Customer(222, "������", "�Ż絿")
		};
		
		custs[0].buyProducts(pros1);
		custs[0].buyProducts(pros1);
		
		CustomerService cs = new CustomerService();
		
		
		// Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
		String[] returnMakers = cs.getAllProductMaker(custs[0]);
		
//		for(String m : returnMakers) {
//			System.out.println(m);
//		}
		
		
		// Outlet�ȿ� �ִ� ��� ���� �����ϴ� ���
		Customer[] returnAllCs =  cs.getCustomers(custs);
		
//		for(Customer c : returnAllCs) {
//			System.out.println(c.getName());
//		}
		
		
		// ��� �� �� Ư�� ���� ssn ���� �˻�
		String returnSearch = cs.searchCustomer(custs, 111);
//		System.out.println(returnSearch);
		
		
		// ���� ������ ��ǰ �� ���� ���� ����
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
