package com.edu.collection.test2;

import java.util.HashMap;
import java.util.Set;

import com.edu.collection.vo.Customer;

public class CustomerMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Customer> map = new HashMap<>();
		
		map.put("111", new Customer("KANG", "∞≠»£µø", 50));
		map.put("222", new Customer("LEE", "¿Ãºˆ±Ÿ", 46));
		map.put("333", new Customer("SEO", "º≠¿Â»∆", 42));
		map.put("444", new Customer("KIM", "±Ë»Ò√∂", 38));
		
		System.out.println(map.get("222")); // ≈∞ ∞™¿Ã "222" ¿Œ ªÁ∂˜
		
		Set<String> set =  map.keySet();
		
		for(String key : set) {
			Customer cust = map.get(key);
			if(cust.getCustId().equals("LEE"))
				System.out.println(cust.getName());
		}
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Set<String> set2 = map.keySet();
		int totalAge = 0;
		
		for(String key : set2) {
			totalAge += map.get(key).getAge();
		}
		System.out.println(totalAge / map.size());
		
		
	}

}
