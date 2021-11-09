package com.edu.collection.test2;

import java.util.ArrayList;

import com.edu.collection.vo.Person;

public class PersonArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("kang", "bang", 46));
		list.add(new Person("hwang", "bong", 41));
		list.add(new Person("lee", "bing", 4));
		list.add(new Person("kong", "byoeng", 6));
		
		int total = 0;
		Person person = null;
		for(Person p : list) {
			total += p.getAge();
			
			if(p.getAddress() == "bing") {
				person = p;
			}
		}
		
		System.out.println(total/list.size());
		System.out.println(person);
		
	}
	
	

}
