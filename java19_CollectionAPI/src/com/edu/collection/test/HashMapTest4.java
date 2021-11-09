package com.edu.collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("kim", 100);
		map.put("lee", 100);
		map.put("park", 100);
		map.put("seo", 90);
		
		Set<String> set = map.keySet();
		
		
		int total = 0;
		for(String s : set) {
			System.out.println(s);
			System.out.println(map.get(s));
			total += map.get(s);
			
		}
		System.out.println(total);
		System.out.println(total/map.size());
		
		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) { // return boolean, next 값이 있는지
//			String name = it.next(); // ahsNext()의 true/false에 해당하는 값
//			int score = map.get(name);
//		}
		
		Collection<Integer> scores = map.values();
		
		Iterator<Integer> it = scores.iterator();
		
		int total2 = 0;
		while(it.hasNext()) {
			Integer in = it.next();
			
			total2 += in;
			
		}
		System.out.println(total2);
		
		
		System.out.println(Collections.max(scores));
		System.out.println(Collections.min(scores));
	}

}
