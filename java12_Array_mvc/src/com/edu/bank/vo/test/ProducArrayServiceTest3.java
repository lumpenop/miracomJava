package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;
import com.edu.bank.vo.service.ProductService;

/*
 * ~Test클래스는
 * 1) 객체를 생성(==클래스의 멤버를 메모리에 올리고)
 * 2) 멤버에 접근(필드 접근이 막혔기 때문에 메소드 접근만 가능...) ==메소드 호출
 * -------------------------------------------------------------
 * ProductService에서 모든 메소드를 정의해두었기 때문에
 * ProductService 객체를 생성--> 메소드 호출
 */


public class ProducArrayServiceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pros = {
				new Product("신라면", 3000, 1, "농심"),
				new Product("흥부네생수", 12000, 1, "농심"),
				new Product("옥시크린", 23000, 1, "LG"),
				new Product("정수기", 440000, 1, "대우"),
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
		
		Product[] sameMaker = service.getSameMakers(pros, "농심");
		
		for(Product p : sameMaker) {
			if(p == null) break;
			System.out.println(p.getMaker());
		}
		
		System.out.println(service.getMeanPrice(pros));
	}

}
