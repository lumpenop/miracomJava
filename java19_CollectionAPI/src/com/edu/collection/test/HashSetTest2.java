package com.edu.collection.test;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("kim");
		set.add("lee");
		set.add("soe");
		set.add("kang");
		set.add("kim");
		
		System.out.println("set 내부 data 수" + set.size()); // 중복 허용 안함
		
		System.out.println(set); // 순서가 없이 저장됨
		
		System.out.println(set.contains("kim")); // 확인
		
		System.out.println(set.remove("kang")); // return boolean
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
		set.clear();
		
		System.out.println(set.isEmpty());
		System.out.println(set);
	}

}
