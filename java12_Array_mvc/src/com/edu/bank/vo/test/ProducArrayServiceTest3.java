package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;
import com.edu.bank.vo.service.ProductService;

/*
 * ~TestŬ������
 * 1) ��ü�� ����(==Ŭ������ ����� �޸𸮿� �ø���)
 * 2) ����� ����(�ʵ� ������ ������ ������ �޼ҵ� ���ٸ� ����...) ==�޼ҵ� ȣ��
 * -------------------------------------------------------------
 * ProductService���� ��� �޼ҵ带 �����صξ��� ������
 * ProductService ��ü�� ����--> �޼ҵ� ȣ��
 */


public class ProducArrayServiceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pros = {
				new Product("�Ŷ��", 3000, 1, "���"),
				new Product("��γ׻���", 12000, 1, "���"),
				new Product("����ũ��", 23000, 1, "LG"),
				new Product("������", 440000, 1, "���"),
		};
		
		ProductService service = new ProductService();
		
//		service.printAllProducMakers(pros);
//		System.out.println(service.getTotalPrice(pros));
//		
//		Product[] upToPrice = service.getUpToPrices(pros, 1000);
//		
//		for(Product p : upToPrice) {
//			if(p == null) break;
//			System.out.println(p.getMaker());
//		}
		
		Product[] sameMaker = service.getSameMakers(pros, "���");
		
		for(Product p : sameMaker) {
			if(p == null) break;
			System.out.println(p.getMaker());
		}
		
		System.out.println(service.getMeanPrice(pros));
	}

}
