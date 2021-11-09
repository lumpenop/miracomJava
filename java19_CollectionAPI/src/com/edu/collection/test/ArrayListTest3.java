package com.edu.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("kim");
		list.add("lee");
		list.add("park");
		list.add("jung");
		
		System.out.println(list);
		
		list.add(0, "ah");
		
		System.out.println(list);
		
		String name = list.remove(0);
		System.out.println(list);
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals("jung")) System.out.println(list.get(i));
		}
		
		
	}

}
